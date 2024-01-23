package com.example.telegramAPI.service;

import com.example.telegramAPI.DTO.MyResponse;

public interface APIService {
    MyResponse createChatInviteLink(String apiToken, String chatId);
}
