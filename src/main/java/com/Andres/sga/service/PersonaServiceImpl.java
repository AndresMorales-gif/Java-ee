package com.Andres.sga.service;

import java.util.*;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.Andres.sga.datos.PersonaDao;
import com.Andres.sga.domain.Personas;

@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{
	
	@Inject
	private PersonaDao personaDao;
	
	@Override
	public List<Personas> listarPersonas() {
		return personaDao.findAllPersonas();
	}
	
	@Override
	public Personas encontrarPersonaPorId(Personas personas) {		
		return personaDao.findPersonaById(personas);
	}
	@Override
	
	public Personas encontrarPersonaPorEmail(Personas personas) {
		return personaDao.findPersonaByEmail(personas);
	}

	@Override
	public void registrarPersona(Personas personas) {
		personaDao.insertPersona(personas);
	}

	@Override
	public void modificarPersona(Personas personas) {
		personaDao.updatePersona(personas);
	}

	@Override
	public void eliminarPersona(Personas personas) {
		personaDao.deletePersona(personas);
	}

}
