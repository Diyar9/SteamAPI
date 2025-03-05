package com.example.steamapi.api.service;

import com.example.steamapi.api.config.SteamConfigProperties;
import com.example.steamapi.api.model.ISteamUser.GetFriendList.GetFriendListResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetFriendListServiceImpl implements GetFriendListService {

    private final String STEAM_API_URL = "http://api.steampowered.com/ISteamUser/GetFriendList/v1/";
    private final RestTemplate restTemplate;
    private final SteamConfigProperties steamConfigProperties;

    public GetFriendListServiceImpl(SteamConfigProperties steamConfigProperties) {
        this.restTemplate = new RestTemplate();
        this.steamConfigProperties = steamConfigProperties;
    }

    @Override
    public GetFriendListResponse getFriendList(String steamid, String relationship) {
        //System.out.println("API-nyckel: " + steamConfigProperties.apiKey());

        String url = STEAM_API_URL + "?key=" + steamConfigProperties.apiKey()
                + "&steamid=" + steamid + "&relationship=" + relationship;

        return restTemplate.getForObject(url, GetFriendListResponse.class);
    }
}