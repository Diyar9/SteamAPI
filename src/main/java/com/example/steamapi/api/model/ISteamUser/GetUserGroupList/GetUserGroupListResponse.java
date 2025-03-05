package com.example.steamapi.api.model.ISteamUser.GetUserGroupList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserGroupListResponse {

    private Response response;

    @JsonProperty("response")
    public Response getResponse() { return response; }
    public void setResponse(Response response) { this.response = response; }
}
