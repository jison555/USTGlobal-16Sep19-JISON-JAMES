package com.ustglobal.springmvcassesment.dto;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import net.bytebuddy.build.ToStringPlugin.Exclude;


@Entity
public class OrderBean {
	@Id
	@Column
	@GeneratedValue
	private int orderid;
	
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	
}
