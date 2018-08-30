package com.prokarma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee 
{
	
	@Id
	@GeneratedValue
	private Integer eid;
	private String ename;
	private String esal;
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	
	@Override
	public String toString() {
		return "Employee [Employee Id=" + eid + ", Employee Name=" + ename + ", Employee Salary=" + esal + "]";
	}

}
