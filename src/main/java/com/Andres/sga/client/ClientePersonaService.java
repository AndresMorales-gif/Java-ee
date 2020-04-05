package com.Andres.sga.client;

import javax.naming.*;

import com.Andres.sga.domain.Personas;
import com.Andres.sga.service.PersonaServiceRemote;
import java.util.List;

public class ClientePersonaService {

	public static void main(String[] args) {
		System.out.println("Iniciando llamada al EJB desde el cliente\n");
		try {
			Context jndi = new InitialContext();
			PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.Andres.sga.service.PersonaServiceRemote");
			
			List<Personas> persona = personaService.listarPersonas();
			for(Personas personas:persona) {
				System.out.println(personas);
			}
			System.out.println("\nFin llamada al EJB desde el cliente");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
	}
	
}
