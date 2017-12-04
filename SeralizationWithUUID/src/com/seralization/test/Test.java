package com.seralization.test;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

import com.seraliation.util.SeralizationUtil;
import com.seralization.Employee;
import com.seralization.Person;

public class Test {
	
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Person person=null;
	SeralizationUtil util=null;
	util=new SeralizationUtil();
	person=new Person();
	person.setPid(105);
	person.setPname("king");
	
	Employee employee=new Employee();
	employee.setEmpno(1001);
	employee.setEmpname("sunil");
	employee.setAdd("bam");
	employee.setPerson(person);
	
	String file="H:\\seralizable.txt";

	/*util.WrieintoFile(file,employee);
	System.out.println("loading sucefully");*/
	
	employee=(Employee)util.inputFile(file);
	System.out.println(employee);
//System.out.println(emp1);
}
}
