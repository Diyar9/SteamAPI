package com.example.steamapi.api.service;

import com.example.steamapi.api.model.ISteamNews.GetNewsForApp.SteamNewsResponse;

public interface SteamNewsService {
    SteamNewsResponse getNewsForApp(int appid, Long count, Integer maxlength, Long enddate, String feeds);
}