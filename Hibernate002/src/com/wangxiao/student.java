package com.wangxiao;

import java.util.Date;

public class student {
	//1. 公有的类
	//2.提供公有的不带参数的构造方法
	//3.私有属性
	//4.属性setter和getter
	
	private int sid;
	private String sname;
	private String sex;
	private Date birthday;
	private String address;
	private teachers teachers;
	public student(){}

	public student(int sid, String sname, String sex, Date birthday, String address) {
		//super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public teachers getTeachers() {
		return teachers;
	}

	public void setTeachers(teachers teachers) {
		this.teachers = teachers;
	}


	
}
