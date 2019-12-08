package com.ustglobal.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "student")
public class StudentBean {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column
	private String name;
	@Column(unique = true)
	private String USN;
	@Column
	private String branch;
	@Column
	private char section;
	@Column
	private int sem;
	@Column
	private String password;
	@Exclude
	@OneToMany(mappedBy = "student")
	private List<BookIssueBean> bookissue;
	
	public List<BookIssueBean> getBookissue() {
		return bookissue;
	}
	public void setBookissue(List<BookIssueBean> bookissue) {
		this.bookissue = bookissue;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUSN() {
		return USN;
	}
	public void setUSN(String uSN) {
		USN = uSN;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}


}
