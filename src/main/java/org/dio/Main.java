package org.dio;

import org.dio.models.Iphone;
import org.dio.models.NavegadorNaInternet;
import org.dio.models.ReprodutorMusical;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Alyasaf");
        iphone.ligar("(61)99302-1918");
        System.out.println(iphone.atender());
        System.out.println(iphone.iniciarCorreioDeVoz());

        System.out.println("=====================>");

        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet("Opera");
        System.out.println(navegadorNaInternet.exibirPagina("Facebook"));
        navegadorNaInternet.adicionarAba();
        navegadorNaInternet.atualizarPagina();

        System.out.println("=====================>");

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical(Arrays.asList("Call out my name", "MAFIA", "Shivers"));
        System.out.println(reprodutorMusical.tocar());
        System.out.println(reprodutorMusical.pausar());
        reprodutorMusical.selecionarMusica("MAFIA");
    }
}