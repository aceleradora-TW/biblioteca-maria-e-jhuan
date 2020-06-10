package com.aceleradora.biblioteca;

public class Main {
    public static void main(String[] args) {
        String[] titulos = new String[2];
        String[] autores = new String[3];
        titulos[0] = "Program development in java";
        autores[0] = "Barbara Liskov";
        titulos[1] = "use a cabeca: padroes de projeto";
        autores[1] = "elisabeth freeman";
        autores[2] = "kathy sierra";

        System.out.println("Bem vindas e bem vindos a nossa Biblioteca");
        System.out.println("Temos os seguintes livros disponiveis:");
        System.out.println("");
        System.out.println("Livro 1:");
        System.out.println(titulos[0]);
        System.out.println(autores[0]);
        System.out.println("");
        System.out.println("livro 2:");
        System.out.println(titulos[1]);
        System.out.println(autores[1] + " e " + autores[2]);
    }
}
