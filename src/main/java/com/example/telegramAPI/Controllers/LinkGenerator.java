package com.example.telegramAPI.Controllers;

import com.example.telegramAPI.DTO.Link;
import com.example.telegramAPI.DTO.MyResponse;
import com.example.telegramAPI.service.APIService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;

@RequestMapping("/")
@Controller
public class LinkGenerator {
    private final APIService apiService;
    public LinkGenerator(APIService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("link/apiToken/{apiToken}/chatId/{chatId}")
    public ResponseEntity<Link> generate(@PathVariable String apiToken,@PathVariable String chatId){

            MyResponse result = apiService.createChatInviteLink(apiToken, chatId);
            URI uri= ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return new ResponseEntity<>(new Link(result.getResult().getInvite_link(), result.getResult().getMember_limit(),uri), HttpStatus.CREATED);
    }

}
