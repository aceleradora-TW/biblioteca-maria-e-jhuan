package com.aceleradora.biblioteca;

public class Main {
    public static void main(String[] args) {
        String[] titulos = new String[2];
        String[] autores = new String[3];
        titulos[0] = "Program development in java";
        autores[0] = "Barbara Liskov";
        titulos[1] = "Use a cabeça: padrões de projeto";
        autores[1] = "Elisabeth Freeman";
        autores[2] = "Kathy Sierra";

        System.out.println("----Bem vindas e bem vindos a nossa Biblioteca----");
        System.out.println("-----Temos os seguintes livros disponiveis:-------" + "\n");
        System.out.println("-------Livro 1:------");
        System.out.println(titulos[0]);
        System.out.println("De: " + autores[0] + "\n");
        System.out.println("-------Livro 2:-------");
        System.out.println(titulos[1]);
        System.out.println("De: " + autores[1] + " e " + autores[2]);
    }
}
