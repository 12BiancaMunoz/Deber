package com.tarea.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tarea.entidades.Cliente;
import com.tarea.entidades.Pais;




public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();

	public static void main(String[] args) {
		
		 Cliente cli1 = new Cliente (0,"Bianca","Muñoz","Silva");
		 Cliente cli2 = new Cliente (0,"Fiorella","Muñoz","Silva");
		 Cliente cli3 = new Cliente (0,"Bryan","Muñoz","Silva");
		 
			 
		 
		
		     ingresarCliente(cli1);
		     ingresarCliente(cli2); 
		     ingresarCliente(cli3);
			    
		    
		    
		    
		    
		    
         Pais pa1 = new Pais (0,"Ecuador");
         Pais pa2 = new Pais (0,"Chile");
         Pais pa3 = new Pais (0,"España");
         Pais pa4 = new Pais (0,"Mexico");
         
         
         
         
             ingresarPais (pa1);
             ingresarPais (pa2);
             ingresarPais (pa3);
             ingresarPais (pa4);
        
		

	}
	
	
	 static void ingresarCliente(Cliente cliente) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(cliente);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(cliente.getId());
		}
	  
	 
	 static void ingresarPais(Pais pais) {
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(pais);
			
			session.getTransaction().commit();
			session.close();
			System.out.println(pais.getId());
		}
	

}
