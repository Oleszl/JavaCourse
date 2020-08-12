package com.company;

public class Body {
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Body(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Body{" +
                "body='" + body + '\'' +
                '}';
    }
}
