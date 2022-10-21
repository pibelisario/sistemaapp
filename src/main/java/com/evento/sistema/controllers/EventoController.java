package com.evento.sistema.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.evento.sistema.entities.Evento;
import com.evento.sistema.repositories.RepositoryEvento;

import java.util.Optional;

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
	    
	    @RequestMapping("/eventos")
	    public ModelAndView listaEventos() {	
	    	ModelAndView mv = new ModelAndView("index");
	    	Iterable<Evento> eventos = evr.findAll();	
	    	mv.addObject("eventos", eventos);
	    	return mv;
	    }
		@RequestMapping("/{codigo}")
		public ModelAndView detalhesEvento(@PathVariable("codigo") long codigo){
		   Optional<Evento> optional = evr.findById(codigo);
		   Evento evento = optional.get();
		   ModelAndView mv = new ModelAndView("detalhesEvento");
		   mv.addObject("evento", evento);
			System.out.println("evento" +evento);
		   return mv;
		}
}
