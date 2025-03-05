package com.example.steamapi.api.model.ISteamUser.GetUserGroupList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    private boolean success;
    private List<Groups> groups;

    @JsonProperty("success")
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    @JsonProperty("groups")
    public List<Groups> getGroups() { return groups; }
    public void setGroups(List<Groups> groups) { this.groups = groups; }
}
