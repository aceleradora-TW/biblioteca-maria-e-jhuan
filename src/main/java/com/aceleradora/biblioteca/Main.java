package com.aceleradora.biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.criaLivros();

        System.out.println("----Bem vindas e bem vindos a nossa Biblioteca----");
        biblioteca.exibirLivros();

    }
}