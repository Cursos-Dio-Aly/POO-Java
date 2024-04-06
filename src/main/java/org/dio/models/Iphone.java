package org.dio.models;

public class Iphone implements AparelhoTelefonico {
    private String contaDoUsuario;

    public Iphone(String contaDoUsuario) {
        this.contaDoUsuario = contaDoUsuario;
    }

    public String getContaDoUsuario() {
        return contaDoUsuario;
    }

    public void setContaDoUsuario(String contaDoUsuario) {
        this.contaDoUsuario = contaDoUsuario;
    }

    @Override
    public void ligar(String telefone) {
        System.out.println("Estou ligando para o número: " + telefone);
    }

    @Override
    public String atender() {
        return String.format("Alô? Quem está falando é o %s", getContaDoUsuario());
    }

    @Override
    public String iniciarCorreioDeVoz() {
        return "Iniciando correio de voz do Iphone";
    }
}
