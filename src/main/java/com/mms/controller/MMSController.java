package com.mms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mms.bean.Mobile;
import com.mms.dao.MobileDAO;


@RestController
@CrossOrigin("http://localhost:4200/")
public class MMSController {
	
	@Autowired
	MobileDAO dao;
	

	@PostMapping("/PerformInsert")
	public String performInsert(@RequestBody Mobile mob)
	{
		
		dao.save(mob);
		return "Inserted";
		
	}
	

	@PutMapping("/PerformUpdate")
	public String performUpdate(@RequestBody Mobile mob)
	{
		
		dao.save(mob);
		return "Updated";
		
	}
	
	@DeleteMapping("/PerformDelete/{id}")
	public String performDelete(@PathVariable("id") int id)
	{
		
		dao.deleteById(id);
		return "Deleted";
		
	}
	
	@GetMapping("/ViewAll")
	public List<Mobile> getAllMobile()
	{
		
		Iterator<Mobile> it = dao.findAll().iterator();
		ArrayList<Mobile> list=new ArrayList<Mobile>();
		while(it.hasNext())
		{
			list.add(it.next());
		}
		return list;
	}
}
