package lp2.cibertec.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lp2.cibertec.entidades.Employee;

public class ActualizarEmpleado {

	public static void main(String[] args) {
		// CREANDO UN OBJETO TIPO MANAGER FACTORUY
				EntityManagerFactory emfactory =
		         Persistence.createEntityManagerFactory("EjemploJPA");
				//iniciar una transacion objeto EntityManager
				EntityManager entitymanager = emfactory.createEntityManager();
				//
				entitymanager.getTransaction().begin();
				
				Employee employee= entitymanager.find(Employee.class, 1201);
				//antes de actualizar 
				//imprimir el obketo employee
				System.out.println();
				//establecer un nuevo salario
				employee.setSalary(55000);
				entitymanager.getTransaction().commit();
				//despuees de actualizar
				entitymanager.close();
				emfactory.close();
				}

}
