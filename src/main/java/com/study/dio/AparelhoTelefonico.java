package com.study.dio;

public interface AparelhoTelefonico {
    void call(String number);
    void answer();
    void sendMessage(String number, String message);
    void receiveMessage();
}
