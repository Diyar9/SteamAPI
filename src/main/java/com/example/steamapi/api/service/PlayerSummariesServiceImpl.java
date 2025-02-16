package com.example.steamapi.api.service;

import com.example.steamapi.api.config.SteamApiConfig;
import com.example.steamapi.api.model.ISteamUser.GetPlayerSummaries.PlayerSummariesResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlayerSummariesServiceImpl implements PlayerSummariesService {

    private final String STEAM_API_URL = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/";
    private final RestTemplate restTemplate;
    private final SteamApiConfig steamApiConfig;

    public PlayerSummariesServiceImpl(SteamApiConfig steamApiConfig) {
        this.restTemplate = new RestTemplate();
        this.steamApiConfig = steamApiConfig;
    }

    @Override
    public PlayerSummariesResponse getPlayerSummaries(String steamids) {
        String url = STEAM_API_URL + "?key=" + steamApiConfig.getApiKey()
                + "&steamids=" + steamids;

        return restTemplate.getForObject(url, PlayerSummariesResponse.class);
    }
}
