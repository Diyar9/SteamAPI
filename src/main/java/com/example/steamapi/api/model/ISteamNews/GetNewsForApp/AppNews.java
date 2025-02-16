package com.example.steamapi.api.model.ISteamNews.GetNewsForApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AppNews {

    private int appid;
    private List<NewsItem> newsitems;

    @JsonProperty("appid")
    public int getAppid() { return appid; }
    public void setAppid(int appid) { this.appid = appid; }

    @JsonProperty("newsitems")
    public List<NewsItem> getNewsitems() { return newsitems; }
    public void setNewsitems(List<NewsItem> newsitems) { this.newsitems = newsitems; }
}