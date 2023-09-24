package lp2.cibertec.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FuncionesAgregadoEscalar {

	public static void main(String[] args) {
		EntityManagerFactory emfactory =
		         Persistence.createEntityManagerFactory("EjemploJPA");
				//iniciar una transacion objeto EntityManager
				EntityManager entitymanager = emfactory.createEntityManager();
				
				//funciones escalar 
				//from employee apunta a una entidad no a una tabla
				Query query =entitymanager.createQuery("Select UPPER(e.ename) from Employee e");
				// se devuelve eñl resultado 
				List<String>  list= query.getResultList();
				
				for (String e : list) {
					System.out.println("Nombre del empleado" + e);
					
					//funciones de agregado
					Query query1 =entitymanager.createQuery("Select Max(e.Salary) from Employee e");
					Double result=(Double) query1.getSingleResult();
					System.out.println("Maximo Salario del Empleado:" +result);
					
				}
	}

}
