package com.study.dio;

public interface NavegadorInternet {
    void navigate(String url);
    void refresh();
    void back();
    void forward();
}
