package com.seralization;

import java.io.Serializable;

public class Employee implements Serializable{
	public static final long serialVersionUID=2L;
	protected int empno;
	protected String empname;
	protected String add;
	protected String empdeptno;
	protected transient Person person;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", add=" + add + ", person=" + person + "]";
	}

}
