package com.study.dio;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String model;
    private String os;

    public IPhone(String model, String os) {
        this.model = model;
        this.os = os;
    }

    // Métodos de ReprodutorMusical
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void next() {
        System.out.println("Próxima música.");
    }

    @Override
    public void previous() {
        System.out.println("Música anterior.");
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void call(String number) {
        System.out.println("Chamando " + number + "...");
    }

    @Override
    public void answer() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Enviando mensagem para " + number + ": " + message);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Recebendo mensagem.");
    }

    // Métodos de NavegadorInternet
    @Override
    public void navigate(String url) {
        System.out.println("Navegando para " + url + "...");
    }

    @Override
    public void refresh() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void back() {
        System.out.println("Voltando para a página anterior.");
    }

    @Override
    public void forward() {
        System.out.println("Avançando para a próxima página.");
    }
}
