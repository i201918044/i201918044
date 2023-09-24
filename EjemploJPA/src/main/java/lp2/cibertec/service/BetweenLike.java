package lp2.cibertec.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import lp2.cibertec.entidades.Employee;

public class BetweenLike {

	public static void main(String[] args) {
		EntityManagerFactory emfactory =
		         Persistence.createEntityManagerFactory("EjemploJPA");
				//iniciar una transacion objeto EntityManager
				EntityManager entitymanager = emfactory.createEntityManager();
				
				Query query =entitymanager.createQuery("Select e" +"from Employee e" + "where e.salary" +"Between 300000 and 40000");
				
				List<Employee> list = (List<Employee>)query.getResultList();
				
				for(Employee e : list) {
					System.out.println("ID Empleado:" + e.getEid());
					System.out.println("Salario:" + e.getSalary());
					
				}
	
				Query query1 = entitymanager.createQuery("Select e" + "from Employee e" + "where e.salary" +  "where e.ename LIKE 'M%'");
				List<Employee> list1 = (List<Employee>)query.getResultList();
				 for (Employee e:list1) {
					 System.out.println("ID Empleado:" + e.getEid());
						System.out.println("Nombre:" + e.getEname());
						
				 }
	}

}
