package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
//import com.mycompany.app.App;
import com.mycompany.app.Sorter;

@RestController
public class ServiceController{

	@RequestMapping("/resource")
	public double[] service(){
		//App ob = new App();
		Sorter obj = new Sorter();
		double[] arr = obj.sorting();
		return(arr); 
	}
}

