package com.pathlock.sboot.Controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pathlock.sboot.Dao.StudentDao;
import com.pathlock.sboot.Model.Student;

@RestController
public class StudentController {

	@Autowired
	private StudentDao sdao;

	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return sdao.findAll();

	}

	@PostMapping
	public ResponseEntity<Void> addStudent(@RequestBody Student s1) {

		this.sdao.save(s1);
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	@DeleteMapping("/students/{id}")
	public ResponseEntity<Void> deleteStud(@PathVariable("id") int sid)
	{
		System.out.println("innn");
		try
		{
		sdao.deleteById(sid);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("/students/{id}")	
	public Student getStud(@PathVariable("id") int sid)
	{
		System.out.println("******"+sid);
		return sdao.getById(sid);
	}
	
	@GetMapping("/students/city/{city}")
	public List<Student> getByCity(@PathVariable("city") String city)
	{
		System.out.println(sdao.findByPercentGreaterThan(80));
		return sdao.findByCity(city);
		
	}

}
