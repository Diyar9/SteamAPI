package com.example.steamapi.api.model.ISteamNews.GetNewsForApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsItem {

    private String gid;
    private String title;
    private String url;
    private String contents;
    private String author;
    private String feedlabel;
    private long date;

    @JsonProperty("gid")
    public String getGid() { return gid; }
    public void setGid(String gid) { this.gid = gid; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    @JsonProperty("contents")
    public String getContents() { return contents; }
    public void setContents(String contents) { this.contents = contents; }

    @JsonProperty("author")
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @JsonProperty("feedlabel")
    public String getFeedlabel() { return feedlabel; }
    public void setFeedlabel(String feedlabel) { this.feedlabel = feedlabel; }

    @JsonProperty("date")
    public long getDate() { return date; }
    public void setDate(long date) { this.date = date; }
}