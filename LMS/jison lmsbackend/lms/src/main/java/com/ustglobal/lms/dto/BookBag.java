package com.ustglobal.lms.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Table
@Entity
public class BookBag {
	
	@Id
	@Column
	@GeneratedValue
	private int bagid;
	@Column
	private int bookid;
	@Column
	@JsonFormat
	private Date issueDate;
	@Column
	@JsonFormat
	private  Date returnDate;	
	@Column
	private String status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private StudentBean stud;
}
