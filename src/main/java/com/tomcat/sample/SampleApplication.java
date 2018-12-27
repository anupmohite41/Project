package com.tomcat.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.tomcat.sample.cont.SampleThread;

@SpringBootApplication
public class SampleApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SampleApplication.class);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SampleApplication.class, args);
		System.out.println("Application Started");
//		SampleThread st = new SampleThread();
//		Thread t1 = new Thread(st);
//		t1.start();
	}
}
