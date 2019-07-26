package com.example.demo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.biz.DepartmentchartBiz;
import com.example.demo.pojo.DepartmentchartPojo;
import com.example.demo.pojo.StaffPojo;

@RestController
@RequestMapping("/api")
public class DepartmentAction {
	
	@Autowired
	private DepartmentchartBiz biz;
	
	@GetMapping("querAll")
	public List<DepartmentchartPojo> QuerAll() {
		return biz.queryAll();
	}
	
	@GetMapping("getquer")
	public List<StaffPojo> findAll(){
		return biz.StaffqueryAll();
	}
	
	@DeleteMapping("dele/{id}")
	public Map<String, String> delet(@PathVariable int id){
		System.out.println("数据:"+id);
		biz.delete(id);
		Map<String, String> message = new HashMap<String, String>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
