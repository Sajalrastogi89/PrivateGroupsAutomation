package com.example.telegramAPI.service.ServiceImpl;

import com.example.telegramAPI.DTO.MyResponse;
import com.example.telegramAPI.service.APIService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Service
public class APIServiceImpl implements APIService {
    private final WebClient.Builder webClientBuilder;

    public APIServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    @Override
    public MyResponse createChatInviteLink(String apiToken, String chatId) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 12);
        long expireDate = calendar.getTimeInMillis() * 1000;

        Map<String, String> data = new HashMap<>();
        data.put("chat_id", chatId);
        data.put("member_limit", "1");
        data.put("expire_date", expireDate+"");

        String url = "https://api.telegram.org/bot" + apiToken + "/createChatInviteLink";

        // Use WebClient to make the POST request
        MyResponse response= webClientBuilder
                .build()
                .post()
                .uri(url)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(data)
                .retrieve()
                .bodyToMono(MyResponse.class)
                .block(Duration.ofSeconds(10));
        return response;
    }
}
