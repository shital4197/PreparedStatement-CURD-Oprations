package com.mainprestatement;

import comprepstatement.Animal;
import comprepstatement.Car;
import comprepstatement.Company;
import comprepstatement.Employee;
import comprepstatement.Person;

public class MainClass {

	public static void main(String[] args) throws Exception{
		
		Employee e = new Employee(); // for employee database
//		e.insertData();
//		e.updateData();
//		e.deleteData();
//		e.getAllRecord();
		
		Person p = new Person(); // for person database
//		p.insertData();
//		p.updateData();
//		p.deleteData();
//		p.displayAllData();
		
		
		Car c = new Car(); // for car database
//		c.insertData();
//		c.updateData();
//		c.deleteData();
//		c.getallData();
		
		Animal a = new Animal(); // for the animal database
//		a.insertData();
//		a.updateData();
//		a.deleteData();
//		a.getallData();
		
		Company c1 = new Company();
//		c1.insertData();
//		c1.updateData();
//		c1.deleteData();
		c1.getallData();
		
	}

}
