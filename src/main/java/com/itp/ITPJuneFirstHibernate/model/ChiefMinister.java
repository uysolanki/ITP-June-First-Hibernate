package com.itp.ITPJuneFirstHibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChiefMinister {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cmno;
	private String cmname;
	private int age;
	
	
}
