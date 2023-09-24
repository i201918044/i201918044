package lp2.cibertec.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lp2.cibertec.entidades.Employee;
//inicia la transacion , tiene la finalidad de agregar nuevo registro a la tabla 
//de empleado- no esta creada en la base de datos porque este servicio de se va 
//encargar de crearla se va añadir un registro
public class NuevoEmpleado {

	public static void main(String[] args) {
		// CREANDO UN OBJETO TIPO MANAGER FACTORUY
		EntityManagerFactory emfactory =
         Persistence.createEntityManagerFactory("EjemploJPA");
		//iniciar una transacion objeto EntityManager
		EntityManager entitymanager = emfactory.createEntityManager();
		//
		entitymanager.getTransaction().begin();
		//crear nuevo obketo de tipo employee
		Employee employee =new Employee();
		//valor por defecto a Eid 1201
		//agregar un nuevo objeto, pero no esta guardado
		employee.setEid(1201);
		employee.setEname("Janet");
		employee.setSalary(50000);
		employee.setDeg("Programadora");
		//se va guardar y persistence en la base de datos es entitymanager
		entitymanager.persist(employee);
		//obtener la transacion con darla por finalizada
		 entitymanager.getTransaction().commit();
		 //cerrar la conexcion y tambien la factoy
		entitymanager.close();
		emfactory.close();
	}

}
