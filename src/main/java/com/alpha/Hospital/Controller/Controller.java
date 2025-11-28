package com.alpha.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.Hospital.Entity.Doctor;
import com.alpha.Hospital.Service.DoctorServicelayer;

import jakarta.validation.Valid;

@RestControllerAdvice
public class Controller {
	
	

    @Autowired
    private DoctorServicelayer ds;

    @PostMapping("/save")
    public void saveDoctor(@RequestBody @Valid Doctor d) {
        ds.saveDoctor(d);
    }

    
	  
	
	
	           
	
	

}
