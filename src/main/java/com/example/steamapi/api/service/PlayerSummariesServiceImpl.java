package com.example.steamapi.api.service;

import com.example.steamapi.api.model.ISteamUser.GetPlayerSummaries.PlayerSummariesResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlayerSummariesServiceImpl implements PlayerSummariesService {

    private final String STEAM_API_URL = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v2/";

    @Override
    public PlayerSummariesResponse getPlayerSummaries(String key, String steamids) {
        String url = STEAM_API_URL + "?key=" + key
                + "&steamids=" + steamids;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, PlayerSummariesResponse.class);
    }
}
