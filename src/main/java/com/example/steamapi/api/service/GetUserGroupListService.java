package com.example.steamapi.api.service;

import com.example.steamapi.api.model.ISteamUser.GetUserGroupList.GetUserGroupListResponse;

public interface GetUserGroupListService {
    GetUserGroupListResponse getUserGroupList (String steamid);
}
