package com.example.steamapi.api.controller;

import com.example.steamapi.api.model.ISteamUser.GetFriendList.GetFriendListResponse;
import com.example.steamapi.api.service.GetFriendListService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/friendslist")
public class GetFriendListController {

    private final GetFriendListService getFriendListService;

    public GetFriendListController(GetFriendListService getFriendListService) {
        this.getFriendListService = getFriendListService;
    }

    @GetMapping
    public GetFriendListResponse getFriendList(@RequestParam String steamid,
                                               @RequestParam(required = false) String relationship) {
        return getFriendListService.getFriendList(steamid, relationship);
    }
}

//EXAMPLE: http://localhost:8080/api/friendslist?steamid=76561198184723727&relationship=friend
