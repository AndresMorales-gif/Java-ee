package com.Andres.sga.datos;

import java.util.List;

import com.Andres.sga.domain.Personas;

public interface PersonaDao {
	
	public List<Personas> findAllPersonas();

	public Personas findPersonaById(Personas personas);
	
	public Personas findPersonaByEmail(Personas personas);
	
	public void insertPersona(Personas personas);
	
	public void updatePersona(Personas personas);
	
	public void deletePersona(Personas personas);
	
}
