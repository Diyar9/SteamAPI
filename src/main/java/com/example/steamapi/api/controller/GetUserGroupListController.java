package com.example.steamapi.api.controller;

import com.example.steamapi.api.model.ISteamUser.GetUserGroupList.GetUserGroupListResponse;
import com.example.steamapi.api.service.GetUserGroupListService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grouplist")
public class GetUserGroupListController {

    private final GetUserGroupListService getUserGroupListService;

    public GetUserGroupListController(GetUserGroupListService getUserGroupListService) {
        this.getUserGroupListService = getUserGroupListService;
    }

    @GetMapping
    public GetUserGroupListResponse getGroupList(@RequestParam String steamid) {
        return getUserGroupListService.getUserGroupList(steamid);
    }
}

//EXAMPLE http://localhost:8080/api/grouplist?steamid=76561198051645268
