export const fetchSteamId = async (input) => {
    if (!input) return null;

    try {
        // Kontrollera om input är ett SteamID eller en Vanity URL
        if (isNaN(input)) {
            console.log("Användaren har angett en vanity URL. Konverterar till SteamID...");

            // Anropa backend för att konvertera vanity URL till SteamID
            const vanityResponse = await fetch(`http://localhost:8080/api/resolvevanity?vanityurl=${input}`);
            const vanityData = await vanityResponse.json();

            if (vanityData.response.success !== 1) {
                throw new Error("Kunde inte hitta SteamID för det angivna namnet.");
            }

            return vanityData.response.steamid; // Returnera SteamID
        }

        return input; // Om input redan är ett SteamID, returnera det direkt
    } catch (error) {
        console.error("Fel vid hämtning av SteamID:", error);
        throw error;
    }
};

export const fetchPlayerData = async (steamId) => {
    if (!steamId) return null;

    try {
        const response = await fetch(`http://localhost:8080/api/playersummaries?steamids=${steamId}`);
        const data = await response.json();

        return data.response.players || [];
    } catch (error) {
        console.error("Fel vid hämtning av spelarinfo:", error);
        throw error;
    }
};

export const fetchSteamNews = async (appId) => {
    try {
        const response = await fetch(`http://localhost:8080/api/steamnews/${appId}`);
        const data = await response.json();
        return data.appnews.newsitems || [];
    } catch (error) {
        console.error("Fel vid hämtning av Steam-nyheter:", error);
        return []; // Returnera en tom array om anropet misslyckas
    }
};
