package org.dio.models;

public class NavegadorNaInternet {
    private String navegador;

    public NavegadorNaInternet(String navegador) {
        this.navegador = navegador;
    }

    public String getNavegador() {
        return navegador;
    }

    public void setNavegador(String navegador) {
        this.navegador = navegador;
    }

    public String exibirPagina(String pagina) {
        return String.format("Você está entrando na página: %s", pagina);
    }

    public void adicionarAba() {
        System.out.println("A aba foi adicionada no seu navegador - " + getNavegador());
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página do navegador - " + getNavegador());
    }
}
