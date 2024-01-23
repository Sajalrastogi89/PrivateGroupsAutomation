package com.example.telegramAPI.Exceptions;
import java.time.LocalDateTime;
import java.util.Date;

public class ErrorDetails {
    private LocalDateTime date;
    private String Message;
    private String description;

    public ErrorDetails() {
    }

    public ErrorDetails(LocalDateTime date, String message, String description) {
        this.date = date;
        Message = message;
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
