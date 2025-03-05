package com.example.steamapi.api.service;

import com.example.steamapi.api.model.ISteamUser.GetPlayerBans.GetPlayerBansResponse;

public interface GetPlayerBansService {
    GetPlayerBansResponse getPlayerBans(String steamids);
}
