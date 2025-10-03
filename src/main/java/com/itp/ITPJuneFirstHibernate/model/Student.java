package com.itp.ITPJuneFirstHibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.TransactionScoped;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name="MyStudent")
public class Student {

	@Id
	@Column(name="rollno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rno;
	private String sname;
	private double per;
	
	@Transient
	int temp;
	
	public Student() {}
	
	public Student(String sname, double per) {
		this.sname = sname;
		this.per = per;
	}
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}
	
	
}
