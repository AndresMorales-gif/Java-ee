package com.Andres.sga.service;

import java.util.*;

import javax.ejb.Stateless;

import com.Andres.sga.domain.Personas;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{

	public List<Personas> listarPersonas() {
		List<Personas> persona = new ArrayList<Personas>();
		persona.add(new Personas("Juan","Gomez","JuanGomez@mail.com","555123456"));
		persona.add(new Personas("Luis","Garcia","LuisGarcia@mail.com","548759514"));
		return persona;
	}

	public Personas encontrarPersonaPorId(Personas personas) {
		
		return personas;
	}

	public Personas encontrarPersonaPorEmail(Personas personas) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registrarPersona(Personas personas) {
		// TODO Auto-generated method stub
		
	}

	public void modificarPersona(Personas personas) {
		// TODO Auto-generated method stub
		
	}

	public void eliminarPersona(Personas personas) {
		// TODO Auto-generated method stub
		
	}

}
