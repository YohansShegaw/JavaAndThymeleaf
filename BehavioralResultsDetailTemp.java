package com.bannershallmark.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@javax.persistence.Entity
@Table(name = "behavioralresultsdetailtemp")
public class BehavioralResultsDetailTemp {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "emp_id")
	private int empId;
	@Column(name = "cbizid")
	private String cbizID;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "role")
	private int role;
	@Column(name = "cid")
	private int cID;
	@Column(name = "name")
	private String name;
	@Column(name = "result")
	private int result;
	@Column(name = "year")
	private int year;

	public BehavioralResultsDetailTemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BehavioralResultsDetailTemp(int id, int empId, String cbizID, String firstName, String lastName, int role,
			int cID, String name, int result, int year) {
		super();
		this.id = id;
		this.empId = empId;
		this.cbizID = cbizID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.cID = cID;
		this.name = name;
		this.result = result;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCbizID() {
		return cbizID;
	}

	public void setCbizID(String cbizID) {
		this.cbizID = cbizID;
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

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
