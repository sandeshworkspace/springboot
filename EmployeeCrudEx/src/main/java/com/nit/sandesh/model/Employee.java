package com.nit.sandesh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emptab")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "eid")
	private int id;
	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
	private double empSal;
	@Column(name = "dept")
	private String empDept;
	@Column(name = "addr")
	private String empAddr;
}
