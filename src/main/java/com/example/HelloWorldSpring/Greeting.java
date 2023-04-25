package com.example.HelloWorldSpring;

public class Greeting {
    private String country;
    private String message;

    public String getCountry(){
        return this.country;
    }
    public String getMessage(){
        return this.message;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
