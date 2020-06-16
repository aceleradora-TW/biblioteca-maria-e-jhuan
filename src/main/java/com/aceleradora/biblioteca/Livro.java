package com.aceleradora.biblioteca;

public class Livro {
    private String titulo;
    private Autor autores;

    public Livro(String titulo, Autor autores) {
        this.titulo = titulo;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutores() {
        return autores;
    }

    public void pegarInformacoes(){
        System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutores().getNome());
    }
}
