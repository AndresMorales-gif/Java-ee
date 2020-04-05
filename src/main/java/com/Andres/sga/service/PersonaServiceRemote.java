package com.Andres.sga.service;

import java.util.List;

import javax.ejb.Remote;
import com.Andres.sga.domain.Personas;
@Remote
public interface PersonaServiceRemote {
	
	public List<Personas> listarPersonas();
	
	public Personas encontrarPersonaPorId(Personas personas);
	
	public Personas encontrarPersonaPorEmail(Personas personas);
	
	public void registrarPersona(Personas personas);
	
	public void modificarPersona(Personas personas);
	
	public void eliminarPersona(Personas personas);
	
}
