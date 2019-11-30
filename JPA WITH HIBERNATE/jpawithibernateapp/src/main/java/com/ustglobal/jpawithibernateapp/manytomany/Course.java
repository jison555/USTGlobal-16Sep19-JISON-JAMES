package com.ustglobal.jpawithibernateapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Course {
	@Id
	@Column
	private int cid;
	@Column
	private String cname;
	@lombok.ToString.Exclude
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "course")
	private List<Student> students;
	
	
	

}
