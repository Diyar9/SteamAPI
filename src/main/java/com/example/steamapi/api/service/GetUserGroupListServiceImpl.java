package com.example.steamapi.api.service;

import com.example.steamapi.api.config.SteamConfigProperties;
import com.example.steamapi.api.model.ISteamUser.GetUserGroupList.GetUserGroupListResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetUserGroupListServiceImpl implements GetUserGroupListService {

    private final String STEAM_API_URL = "http://api.steampowered.com/ISteamUser/GetUserGroupList/v1/";
    private final RestTemplate restTemplate;
    private final SteamConfigProperties steamConfigProperties;

    public GetUserGroupListServiceImpl(SteamConfigProperties steamConfigProperties) {
        this.restTemplate = new RestTemplate();
        this.steamConfigProperties = steamConfigProperties;
    }

    @Override
    public GetUserGroupListResponse getUserGroupList(String steamid) {
        //System.out.println("API-nyckel: " + steamConfigProperties.apiKey());

        String url = STEAM_API_URL + "?key=" + steamConfigProperties.apiKey()
                + "&steamid=" + steamid;

        return restTemplate.getForObject(url, GetUserGroupListResponse.class);
    }
}
