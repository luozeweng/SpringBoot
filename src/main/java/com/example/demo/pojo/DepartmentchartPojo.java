package com.example.demo.pojo;

import java.util.List;

public class DepartmentchartPojo {
	
	private int  id;//编号
	private String name;//部门名称
	private String address;//地址
	
	private List<StaffPojo> staffPojos;//一对多   部门对员工
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<StaffPojo> getStaffPojos() {
		return staffPojos;
	}
	public void setStaffPojos(List<StaffPojo> staffPojos) {
		this.staffPojos = staffPojos;
	}
	
}
