import { useEffect, useState } from "react";
import "./App.css";

function PlayerSummaries() {
    const [steamId, setSteamId] = useState(""); // För inputfältet
    const [list, setList] = useState([]);
    const [error, setError] = useState(null);

    const fetchPlayer = (id) => {
        if (!id) return; // Förhindra att anrop görs om ID är tomt

        fetch(`http://localhost:8080/api/playersummaries?steamids=${id}`)
            .then((response) => response.json())
            .then((data) => {
                console.log("API-respons:", data);
                setList(data.response.players || []);
                setError(null);
            })
            .catch((error) => {
                console.error("Error fetching data:", error);
                setError("Kunde inte hämta data. Kontrollera SteamID.");
            });
    };

    return (
        <div className="Player-summaries">
            <h1>Player Summaries</h1>

            {/* Inputfält för att skriva in SteamID */}
            <input
                type="text"
                placeholder="Ange SteamID"
                value={steamId}
                onChange={(e) => setSteamId(e.target.value)}
            />
            <button onClick={() => fetchPlayer(steamId)}>Sök</button>

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