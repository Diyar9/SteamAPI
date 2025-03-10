package com.example.steamapi.api.model.ISteamUser.GetPlayerSummaries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerSummariesResponse {

    private Response response;

    @JsonProperty("response")
    public Response getResponse() { return response; }
    public void setResponse(Response response) { this.response = response; }
}
