package com.bannershallmark.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buisnessresultsdetailtemp")
public class BuisnessResultsDetailTemp {

	@Column(name = "e_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	@Column(name = "	emp_id")
	private int empId;
	@Column(name = "employeeid")
	private String employeeID;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "total")
	private double total;
	@Column(name = "sales_to_plan")
	private double salesToPlan;
	@Column(name = "iat_to_plan")
	private double iatToPlan;
	@Column(name = "connect_to_plan")
	private double connectToPlan;
	@Column(name = "relate_to_plan")
	private double relateToPlan;
	@Column(name = "conversion_to_plan")
	private double conversionToPlan;
	@Column(name = "role")
	private int role;
	@Column(name = "year")
	private int year;

	public BuisnessResultsDetailTemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BuisnessResultsDetailTemp(int eId, int empId, String employeeID, String firstName, String lastName,
			double total, double salesToPlan, double iatToPlan, double connectToPlan, double relateToPlan,
			double conversionToPlan, int role, int year) {
		super();
		this.eId = eId;
		this.empId = empId;
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.total = total;
		this.salesToPlan = salesToPlan;
		this.iatToPlan = iatToPlan;
		this.connectToPlan = connectToPlan;
		this.relateToPlan = relateToPlan;
		this.conversionToPlan = conversionToPlan;
		this.role = role;
		this.year = year;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getSalesToPlan() {
		return salesToPlan;
	}

	public void setSalesToPlan(double salesToPlan) {
		this.salesToPlan = salesToPlan;
	}

	public double getIatToPlan() {
		return iatToPlan;
	}

	public void setIatToPlan(double iatToPlan) {
		this.iatToPlan = iatToPlan;
	}

	public double getConnectToPlan() {
		return connectToPlan;
	}

	public void setConnectToPlan(double connectToPlan) {
		this.connectToPlan = connectToPlan;
	}

	public double getRelateToPlan() {
		return relateToPlan;
	}

	public void setRelateToPlan(double relateToPlan) {
		this.relateToPlan = relateToPlan;
	}

	public double getConversionToPlan() {
		return conversionToPlan;
	}

	public void setConversionToPlan(double conversionToPlan) {
		this.conversionToPlan = conversionToPlan;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
