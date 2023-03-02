package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.ApiRepo;
@Service
public class ApiService {
	 @Autowired
     ApiRepo r;
     public Book saveDetails( Book e) {
   	  return r.save(e);
     }
     public List<Book> getDetails(){
   	  return r.findAll();
     }
     public Optional<Book> getDetails(int id){
      	  return r.findById(id);
        }
     
     public Book updateDetails(Book e1) {
   	  return r.saveAndFlush(e1);
     }
     public void deleteDetails(int id ) {
   	  r.deleteById(id);
     }
}
