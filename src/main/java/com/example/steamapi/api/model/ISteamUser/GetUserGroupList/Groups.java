package com.example.steamapi.api.model.ISteamUser.GetUserGroupList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Groups {

    private String gid;

    @JsonProperty("gid")
    public String getGid() { return gid; }
    public void setGid(String gid) { this.gid = gid; }
}
