package com.Andres.sga.datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import com.Andres.sga.domain.Personas;

@Stateless
public class PersonaDaoImpl implements PersonaDao{
	
	@PersistenceContext(unitName="PersonaPU")
	EntityManager en;

	@Override
	public List<Personas> findAllPersonas() {
		
		return en.createNamedQuery("Persona.findAll").getResultList();
	} 

	@Override
	public Personas findPersonaById(Personas personas) {
		return en.find(Personas.class, personas.getIdPersona());
	}

	@Override
	public Personas findPersonaByEmail(Personas personas) {
		Query query = en.createQuery("from Personas p where p.email =: email");
		query.setParameter("email", personas.getEmail());
		return (Personas) query.getSingleResult();
	}

	@Override
	public void insertPersona(Personas personas) {
		en.persist(personas);
	}

	@Override
	public void updatePersona(Personas personas) {
		en.merge(personas);
	}

	@Override
	public void deletePersona(Personas personas) {
		en.remove(en.merge(personas));
	}
	
}
