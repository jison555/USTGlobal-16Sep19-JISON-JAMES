package com.ustglobal.lms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class BookBean {
	
	@Id
	@Column
	@GeneratedValue
	private int bid;
	@Column
	private String bname;
	@Column
	private int count;
	@Column
	private String catagory;
	@Column
	private String author;
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="book_bag",joinColumns = @JoinColumn(name="bid"),
//								inverseJoinColumns = @JoinColumn(name="bagid"))		
//	private List<BookBag> bookbag;
//

}
