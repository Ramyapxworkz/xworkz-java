package com.xworkz.customsandle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customsandle_table")
@NamedQuery(name="readAll",query="SELECT entity from CustomEntity entity")
@NamedQuery(name="readByName",query="SELECT entity from CustomEntity entity where entity.userName=:userName")

public class CustomEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String email;
	private String sizeOfSandle;
	private String width;
	private String length;
	private String design;
	private long number;
	@Column(name="order_status")
	private String status;
}
