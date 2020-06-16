package com.aceleradora.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> listaLivros = new ArrayList<>();

    public void criaLivros(){
        Autor autor1 = new Autor("Barbara Liskov");
        Autor autor2 = new Autor("elisabeth freeman e kathy sierra");
        
        Livro livro1 = new Livro("Program development in java", autor1);
        Livro livro2 = new Livro("use a cabeça: padroes de projeto", autor2);
        listaLivros.add(livro1);
        listaLivros.add(livro2);
    }
    public void exibirLivros(){
        System.out.println("Livros disponiveis:");
        for (Livro livro : listaLivros) {
            livro.pegarInformacoes();
        }
    }
}
