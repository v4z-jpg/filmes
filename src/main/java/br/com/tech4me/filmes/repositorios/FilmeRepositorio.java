package br.com.tech4me.filmes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tech4me.filmes.model.Filmes;
@Repository
public interface FilmeRepositorio extends JpaRepository<Filmes, Integer>{
    

    List<Filmes> findByOrderByTituloAsc();
    
}
