package com.example.telegramAPI.DTO;

import org.springframework.stereotype.Component;

import java.net.URI;

public class Link {
   private String link;
   private Integer memberLimit;
    private URI uri;

    public Link() {
    }

    public Link(String link, Integer memberLimit, URI uri) {
        this.link = link;
        this.memberLimit = memberLimit;
        this.uri = uri;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(Integer memberLimit) {
        this.memberLimit = memberLimit;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }
}
