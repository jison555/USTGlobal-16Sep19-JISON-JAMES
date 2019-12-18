package com.ustglobal.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class AdminBean {
	@Id
	@Column
	private int id;
	@Column
	private String password;
	@Column
	private String role;

}
