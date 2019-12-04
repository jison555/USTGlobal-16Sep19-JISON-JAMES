package com.ustgloabal.springrest.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeResponse {
	
	private int statusCode;
	private String message;
	private String discription;
	private List<EmployeeBean> employeeBeans;

}
