package com.example.steamapi.api.model.ISteamUser.GetFriendList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Friends {

    private String steamid;
    private String relationship;
    private long friend_since;

    @JsonProperty("steamid")
    public String getSteamid() { return steamid; }
    public void setSteamid(String steamid) { this.steamid = steamid; }

    @JsonProperty("relationship")
    public String getRelationship() { return relationship; }
    public void setRelationship(String relationship) { this.relationship = relationship; }

    @JsonProperty("friend_since")
    public long getFriend_since() { return friend_since; }
    public void setFriend_since(long friend_since) { this.friend_since = friend_since; }
}
