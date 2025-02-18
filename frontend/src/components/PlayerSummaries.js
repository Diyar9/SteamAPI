import { useState } from "react";
import { fetchSteamId, fetchPlayerData } from "../services/steamService"; // Importera API-anropen
import "../App.css";

function PlayerSummaries() {
    const [userInput, setUserInput] = useState(""); // Kan vara SteamID eller Vanity URL
    const [list, setList] = useState([]);
    const [error, setError] = useState(null);

    const handleSearch = async () => {
        if (!userInput) return;

        try {
            setError(null);
            setList([]);

            // Hämta SteamID från Vanity URL om nödvändigt
            const steamId = await fetchSteamId(userInput);
            if (!steamId) {
                setError("Kunde inte hitta SteamID. Kontrollera ditt namn eller ID.");
                return;
            }

            // Hämta spelarens information med SteamID
            const players = await fetchPlayerData(steamId);
            setList(players);
        } catch (error) {
            setError("Kunde inte hämta data. Kontrollera SteamID eller vanity URL.");
        }
    };

    return (
        <div className="Player-summaries">
            <h1>Player Summaries</h1>

            {/* Inputfält för SteamID eller Vanity URL */}
            <input
                type="text"
                placeholder="Ange SteamID eller Vanity URL"
                value={userInput}
                onChange={(e) => setUserInput(e.target.value)}
            />
            <button onClick={handleSearch}>Sök</button>

            {error && <p style={{ color: "red" }}>{error}</p>}

            <div className="wrapper">
                {list.map((player) => (
                    <li key={player.steamid}>
                        <h3>{player.personaname}</h3>
                        <p><i>{player.realname}</i></p>
                        <img src={player.avatarfull} alt="Avatar"/>
                        <p>Account created: <b>{new Date(player.timecreated * 1000).toDateString()}</b></p>
                        <p>Last online: <b>{new Date(player.lastlogoff * 1000).toDateString()}</b></p>
                    </li>
                ))}
            </div>
        </div>
    );
}

export default PlayerSummaries;