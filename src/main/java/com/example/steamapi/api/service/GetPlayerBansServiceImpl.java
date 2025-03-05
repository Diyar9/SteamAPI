package com.example.steamapi.api.service;

import com.example.steamapi.api.config.SteamConfigProperties;
import com.example.steamapi.api.model.ISteamUser.GetPlayerBans.GetPlayerBansResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetPlayerBansServiceImpl implements GetPlayerBansService {

    private final String STEAM_API_URL = "http://api.steampowered.com/ISteamUser/GetPlayerBans/v1/";
    private final RestTemplate restTemplate;
    private final SteamConfigProperties steamConfigProperties;

    public GetPlayerBansServiceImpl(SteamConfigProperties steamConfigProperties) {
        this.restTemplate = new RestTemplate();
        this.steamConfigProperties = steamConfigProperties;
    }

    @Override
    public GetPlayerBansResponse getPlayerBans(String steamids) {
        //System.out.println("API-nyckel: " + steamConfigProperties.apiKey());

        String url = STEAM_API_URL + "?key=" + steamConfigProperties.apiKey()
                + "&steamids=" + steamids;

        return restTemplate.getForObject(url, GetPlayerBansResponse.class);
    }
}
