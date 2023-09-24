package lp2.cibertec.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.NamedQuery;
import javax.persistence.Table;

//anotaciones 
@Entity
@Table
@NamedQuery(query = "Select e from Employee e where e.eid=:id", name="Find employee by id")
//sale error  la clase employee esta administrada pero no esta listada en persistence .xml..
public class Employee { 
	
	//
	@Id
	//@GeneratedValue definir una estrategia de creacion de nuevo valor del campo clave
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eid_empleado")
	private int eid;
	@Column(name = "ename_empleado")
	private String ename;
	@Column (name ="salary_empleado")
	private double salary;
	@Column (name = "deg_empleado")
	private String deg;
	
	public Employee(int eid, String ename, double salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	public Employee() {
		super();
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	//se va necesitar a la hora de correr las primeras consultas 
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
	}
	
	

}
