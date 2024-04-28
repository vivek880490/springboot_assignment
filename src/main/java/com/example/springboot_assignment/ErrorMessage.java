package com.example.springboot_assignment;

import java.util.Date;

public class ErrorMessage {
    private String message;
    private Date date;

    public ErrorMessage(Date date, String message){
        this.date = date;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
