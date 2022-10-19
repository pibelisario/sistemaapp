package com.evento.sistema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.evento.sistema.entities.Evento;
import com.evento.sistema.repositories.RepositoryEvento;

@Service
@Controller
public class EventoController {
	private RepositoryEvento  evr;

	   public EventoController (RepositoryEvento evr){
	       this.evr = evr;
	   }

	    @RequestMapping(value = "/cad", method = RequestMethod.GET)
	    public String form(){
	        return "evento/formEvento";
	    }
	    
	    @RequestMapping(value = "/cad", method = RequestMethod.POST)
	    public String formEvento(Evento evento){
	        evr.save(evento);

	       	return "redirect:/cad";
	    }
}