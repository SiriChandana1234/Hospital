package com.alpha.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.Hospital.Entity.Doctor;
import com.alpha.Hospital.Service.DoctorService;

import jakarta.validation.Valid;

@RestControllerAdvice
public class DoctorController {
	
	

    @Autowired
    private DoctorService ds;

    @PostMapping("/save")
    public void saveDoctor(@RequestBody @Valid Doctor d) {
        ds.saveDoctor(d);
    }
    
  


        @GetMapping("/find")
        public ResponseStructure<Doctor> findDoctor(@RequestParam int id) {
            return ds.findDoctor(id);
        }

        @DeleteMapping("/delete")
        public void deleteDoctor(@RequestParam int id) {
            ds.deleteDoctor(id);
        }

        @PutMapping("/update")
        public void updateDoctor(@RequestParam int id, @RequestBody Doctor d) {
            ds.updateDoctor(id, d);
        }
    }
    
	  
	
	
	           
	
	


