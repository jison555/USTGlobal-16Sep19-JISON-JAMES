package com.ustglobal.lms.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class LibrarianBean {

	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String lname;
	@Column
	private String password;
	@Column
	private String lemail;
	@Column
	private String role;	
//	@Exclude
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="email")
//	private LoginBean bean;
//	
}
