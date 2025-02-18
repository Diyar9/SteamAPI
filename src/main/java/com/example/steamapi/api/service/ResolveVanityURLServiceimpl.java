package com.example.steamapi.api.service;

import com.example.steamapi.api.config.SteamConfigProperties;
import com.example.steamapi.api.model.ISteamUser.ResolveVanityURL.ResolveVanityURLResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResolveVanityURLServiceimpl implements ResolveVanityURLService {

    private final String STEAM_API_URL = "http://api.steampowered.com/ISteamUser/ResolveVanityURL/v1/";
    private final RestTemplate restTemplate;
    private final SteamConfigProperties steamConfigProperties;

    public ResolveVanityURLServiceimpl(SteamConfigProperties steamConfigProperties) {
        this.restTemplate = new RestTemplate();
        this.steamConfigProperties = steamConfigProperties;
    }

    @Override
    public ResolveVanityURLResponse getResolveVanityURL(String vanityurl, Integer url_type) {

        if (url_type == null) url_type = 1;

        System.out.println("API-nyckel: " + steamConfigProperties.apiKey());

        String url = STEAM_API_URL + "?key=" + steamConfigProperties.apiKey()
                + "&vanityurl=" + vanityurl + "&url_type=" + url_type;

        return restTemplate.getForObject(url, ResolveVanityURLResponse.class);
    }
}
