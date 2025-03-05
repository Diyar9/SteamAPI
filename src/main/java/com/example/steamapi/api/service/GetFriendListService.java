package com.example.steamapi.api.service;

import com.example.steamapi.api.model.ISteamUser.GetFriendList.GetFriendListResponse;

public interface GetFriendListService {
    GetFriendListResponse getFriendList(String steamid, String relationship);
}
