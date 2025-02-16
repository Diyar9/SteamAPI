package com.example.steamapi.api.service;

import com.example.steamapi.api.model.ISteamUser.GetPlayerSummaries.PlayerSummariesResponse;

public interface PlayerSummariesService {
    PlayerSummariesResponse getPlayerSummaries(String key, String steamids);
}
