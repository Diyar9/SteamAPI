package com.example.steamapi.api.service;

import com.example.steamapi.api.model.SteamNewsResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SteamNewsServiceImpl implements SteamNewsService {

    private final String STEAM_API_URL = "https://api.steampowered.com/ISteamNews/GetNewsForApp/v2/";

    @Override
    public SteamNewsResponse getNewsForApp(int appid, Long count, Integer maxlength, Long enddate, String feeds) {
        // Standardvärden om de inte anges
        if (count == null || count < 1) count = 20L;
        if (maxlength == null) maxlength = 0;
        if (enddate == null) enddate = System.currentTimeMillis() / 1000;
        if (feeds == null || feeds.isEmpty()) feeds = "";

        // Bygg URL med parametrar
        String url = STEAM_API_URL + "?appid=" + appid
                + "&count=" + count
                + "&maxlength=" + maxlength
                + "&enddate=" + enddate
                + "&feeds=" + feeds
                + "&format=json";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, SteamNewsResponse.class);
    }
}