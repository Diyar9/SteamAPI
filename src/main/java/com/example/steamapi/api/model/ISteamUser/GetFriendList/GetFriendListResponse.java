package com.example.steamapi.api.model.ISteamUser.GetFriendList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetFriendListResponse {

    private FriendsList friendsList;

    @JsonProperty("friendslist")
    public FriendsList getFriendsList() { return friendsList; }
    public void setFriendsList(FriendsList friendsList) { this.friendsList = friendsList; }
}
