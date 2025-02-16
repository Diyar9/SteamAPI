package com.example.steamapi.api.model.ISteamNews.GetNewsForApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SteamNewsResponse {

    private AppNews appnews;

    @JsonProperty("appnews")
    public AppNews getAppnews() { return appnews; }
    public void setAppnews(AppNews appnews) { this.appnews = appnews; }
}