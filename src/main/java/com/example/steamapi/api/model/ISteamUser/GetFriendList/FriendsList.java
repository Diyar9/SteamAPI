package com.example.steamapi.api.model.ISteamUser.GetFriendList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FriendsList {

    private List<Friends> friends;

    @JsonProperty("friends")
    public List<Friends> getFriends() { return friends; }
    public void setFriends(List<Friends> friends) { this.friends = friends; }
}
