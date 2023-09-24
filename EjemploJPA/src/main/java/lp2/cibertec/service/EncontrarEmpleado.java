package lp2.cibertec.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lp2.cibertec.entidades.Employee;

public class EncontrarEmpleado {

	public static void main(String[] args) {
		EntityManagerFactory emfactory =
		         Persistence.createEntityManagerFactory("EjemploJPA");
				//iniciar una transacion objeto EntityManager
				EntityManager entitymanager = emfactory.createEntityManager();
				//
				entitymanager.getTransaction().begin();
				
				Employee employee= entitymanager.find(Employee.class, 1201);
				
				System.out.println("Id Empleado: " + employee.getEid());
				System.out.println("Nombre empleado:" + employee.getEname());
				System.out.println("Salario de empleado" + employee.getSalary());
				System.out.println("Cargo de empleado" + employee.getDeg());

	}

}
