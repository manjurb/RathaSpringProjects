package com.css.corp.project.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Billing {


	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int billing_Id;
	

	@Column
	private String project_Name;
	
	@Column
	private Date start_date;
	
	@Column
	private Date end_date;
	
	@Column
	private String contract;
	
	@Column
	private String material_code;
	
	@Column
	private String resource;
	
	@Column
	private String UOM;
	
	@Column
	private Double rate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getBilling_Id() {
		return billing_Id;
	}
	
	public void setBilling_Id(int billing_Id) {
		this.billing_Id = billing_Id;
	}
	
	public String getProject_Name() {
		return project_Name;
	}
	
	public void setProject_Name(String project_Name) {
		this.project_Name = project_Name;
	}
	
	public Date getStart_date() {
		return start_date;
	}
	
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
	public Date getEnd_date() {
		return end_date;
	}
	
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	public String getContract() {
		return contract;
	}
	
	public void setContract(String contract) {
		this.contract = contract;
	}
	
	public String getMaterial_code() {
		return material_code;
	}
	
	public void setMaterial_code(String material_code) {
		this.material_code = material_code;
	}
	
	public String getResource() {
		return resource;
	}
	
	public void setResource(String resource) {
		this.resource = resource;
	}
	
	public String getUOM() {
		return UOM;
	}
	
	public void setUOM(String uOM) {
		UOM = uOM;
	}
	
	public Double getRate() {
		return rate;
	}
	
	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Billing(int id, String project_Name, Date start_date, Date end_date, String contract, String material_code,
			String resource, String uOM, Double rate) {
		super();
		this.id = id;
		this.project_Name = project_Name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.contract = contract;
		this.material_code = material_code;
		this.resource = resource;
		UOM = uOM;
		this.rate = rate;
	}

	public Billing() {
		super();
	}
	
	
}
