package com.src.sampleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.src.sampleapp.dao.StatusCheckDAO;
import com.src.sampleapp.dao.StatusCheckDAO2;
import com.src.sampleapp.vo.StatusCheckView;


@SpringBootApplication
public class NonResponder implements CommandLineRunner {
    public NonResponder() {
        super();
    }
   
    @Autowired 
    @Qualifier("testDB1")
    StatusCheckDAO repository1;
    
    @Autowired 
    @Qualifier("testDB2")
    StatusCheckDAO2 repository2;
    
    public static void main(String[] args) throws Exception {
        try {
        	SpringApplication.run(NonResponder.class);
        } catch (Exception e) {
    
        }
    }


	@Override
	public void run(String... arg0) throws Exception {

		
		System.out.println("****************In repository1--------------"+repository1.count());
		
		System.out.println("****************In repository2--------------"+repository2.count());
	}
	

}
