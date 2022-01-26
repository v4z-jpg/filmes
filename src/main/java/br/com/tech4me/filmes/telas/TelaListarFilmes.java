package br.com.tech4me.filmes.telas;

import java.util.List;
import java.util.Scanner;

import org.springframework.data.repository.Repository;

import br.com.tech4me.filmes.model.Filmes;
import br.com.tech4me.filmes.repositorios.FilmeRepositorio;

public class TelaListarFilmes implements Tela<Filmes, Integer> {
    @Override
    public void executar(Scanner entrada, Repository<Filmes, Integer> repositorio) {
       FilmeRepositorio repo = (FilmeRepositorio)repositorio;
       List<Filmes> filmes = repo.findByOrderByTituloAsc();
       
       if(filmes.isEmpty()) {
           System.out.println("\nNão há filmes cadastrados!");
           return;
       }
         
       System.out.println("\nLista de Filmes cadastrados:");
       filmes.forEach(System.out::println);
    }
    
}
