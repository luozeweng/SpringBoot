package com.example.demo.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IDepartmentchartDao;
import com.example.demo.pojo.DepartmentchartPojo;
import com.example.demo.pojo.StaffPojo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DepartmentchartBiz {
	
	@Autowired
	private IDepartmentchartDao dao;
	
	/**
	 * 部门查询
	 * @return
	 */
	public List<DepartmentchartPojo> queryAll(){
		return dao.queryAll();
	}
	
	/**
	 * 员工新增
	 * @return
	 */
	public List<StaffPojo> StaffqueryAll(){
		return dao.StaffqueryAll();
	}
	
	/**
	 * 删除
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void delete(int id) {
		dao.StaffDelete(id);
	}
}
