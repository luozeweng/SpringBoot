package com.example.demo.pojo;

import java.util.Date;

public class StaffPojo {
	private int id; //编号
	private String name;//姓名
	private int sex;//性别
	private int age;//年龄
	private String work;//工作
	private double wages;//工资
	private Date initiationtime;//入职时间
	private double bonus;//奖金
	private int did;//部门id
	
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public Date getInitiationtime() {
		return initiationtime;
	}
	public void setInitiationtime(Date initiationtime) {
		this.initiationtime = initiationtime;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	
}
