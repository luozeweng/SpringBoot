package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.pojo.DepartmentchartPojo;
import com.example.demo.pojo.StaffPojo;


public interface IDepartmentchartDao {
	
	List<DepartmentchartPojo> queryAll();//部门查询
	
	List<StaffPojo> StaffqueryAll();//员工查询
	
	void StaffDelete(@Param("id") int id);//员工删除
}
