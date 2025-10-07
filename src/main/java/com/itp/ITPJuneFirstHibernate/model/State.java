package com.itp.ITPJuneFirstHibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int sno;
		private String sname;
		private String capital;
		
		@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		@JoinColumn(name="cm",referencedColumnName = "cmno")
		ChiefMinister chiefMinister;
		
		
		
}
