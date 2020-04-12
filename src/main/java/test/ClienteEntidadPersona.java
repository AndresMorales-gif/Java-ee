package test;


import javax.persistence.*;

import org.apache.logging.log4j.*;

import com.Andres.sga.domain.Personas;

public class ClienteEntidadPersona {
	static Logger log = LogManager.getRootLogger();
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
		EntityManager en = emf.createEntityManager();
		EntityTransaction tx = en.getTransaction();
		
		//Inicia la transaccion
		tx.begin();
		//No se debe especificar el ID de la base de datos
		Personas personal = new Personas("Jhon", "Arturo", "JArturo@email.com", "458 968 154"); 
		log.debug("Objeto a persistir" + personal);
		//Persistimos el objeto
		en.persist(personal);
		//terminamos la transaccion
		tx.commit();
		log.debug("Objeto persistido"+personal);
		en.close(); 
	}
}
