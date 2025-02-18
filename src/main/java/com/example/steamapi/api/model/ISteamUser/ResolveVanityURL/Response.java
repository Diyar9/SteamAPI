package com.example.steamapi.api.model.ISteamUser.ResolveVanityURL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    private String steamid;
    private Integer success;

    @JsonProperty("steamid")
    public String getSteamid() { return steamid; }
    public void setSteamid(String steamid) { this.steamid = steamid; }

    @JsonProperty("success")
    public Integer getSuccess() { return success; }
    public void setSuccess(Integer success) { this.success = success; }
}
