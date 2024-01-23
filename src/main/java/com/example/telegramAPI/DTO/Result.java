package com.example.telegramAPI.DTO;

public class Result {
    private String invite_link;
    private Creator creator;
    private Integer member_limit;
    private boolean creates_join_request;
    private boolean is_primary;
    private boolean is_revoked;

    public Result() {
    }

    public Result(String invite_link, Creator creator, Integer member_limit, boolean creates_join_request, boolean is_primary, boolean is_revoked) {
        this.invite_link = invite_link;
        this.creator = creator;
        this.member_limit = member_limit;
        this.creates_join_request = creates_join_request;
        this.is_primary = is_primary;
        this.is_revoked = is_revoked;
    }

    public String getInvite_link() {
        return invite_link;
    }

    public void setInvite_link(String invite_link) {
        this.invite_link = invite_link;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Integer getMember_limit() {
        return member_limit;
    }

    public void setMember_limit(Integer member_limit) {
        this.member_limit = member_limit;
    }

    public boolean isCreates_join_request() {
        return creates_join_request;
    }

    public void setCreates_join_request(boolean creates_join_request) {
        this.creates_join_request = creates_join_request;
    }

    public boolean isIs_primary() {
        return is_primary;
    }

    public void setIs_primary(boolean is_primary) {
        this.is_primary = is_primary;
    }

    public boolean isIs_revoked() {
        return is_revoked;
    }

    public void setIs_revoked(boolean is_revoked) {
        this.is_revoked = is_revoked;
    }
}
