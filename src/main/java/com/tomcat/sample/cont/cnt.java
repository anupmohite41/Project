package com.tomcat.sample.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class cnt {

	@GetMapping("/{val}")
	public String test(@PathVariable String val){
		return "Welcome "+val;
	}
	@GetMapping("/")
	public String show(){
		Eida e = new Eida(101, "XYZ");
		return e.display();
	}
	@GetMapping("/thread")
	public String thread(){
		Thread t1 = new SampleThread();
		Thread t2 = new SampleThread();
		t1.start();
		t2.start();
		return "thread Running";
	}
}
