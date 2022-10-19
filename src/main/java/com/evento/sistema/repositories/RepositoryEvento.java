package com.evento.sistema.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evento.sistema.entities.Evento;

@Repository
public interface RepositoryEvento extends CrudRepository<Evento, Long>{
	

}
