package com.example.telegramAPI.DTO;

public class MyResponse {
    private boolean ok;
    private Result result;

    public MyResponse(boolean ok, Result result) {
        this.ok = ok;
        this.result = result;
    }

    public MyResponse() {
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}

