package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
	@Autowired
    ApiService s;
   
	
	@PostMapping("/postd")
	public Book addInfo(@RequestBody Book st) {
		return s.saveDetails(st);
	}
	
	@GetMapping("/getd")
	public List<Book> fetchDetails(){
		return s.getDetails();
	}
	@GetMapping("/getd/{id}")
	public Optional<Book> fetchDetails(@PathVariable int id){
		return s.getDetails(id);
	}
	
	@PutMapping("/putd")
	public Book updateInfo(@RequestBody Book st1) {
		return s.updateDetails(st1);
	}
	@DeleteMapping("/deleted/{id}")
	public String deleteInfo(@PathVariable("id")int id) {
		s.deleteDetails(id);
		return "The element is deleted";
	}
}
