package com.ustglobal.lms.dto;





import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Entity
@Table
@Data
public class StudentBean {
	
	@Id
	@GeneratedValue
	@Column()
	private int id;
	@Column
	private String sname;
	@Column
	private String password;
	@Column
	private String semail; 
	@Column
	private String role;
	@lombok.ToString.Exclude
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "stud")
	private List<BookBag> bag;

}
