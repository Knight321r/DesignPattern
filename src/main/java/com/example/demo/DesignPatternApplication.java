package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.observer.Subject;
import com.example.demo.observer.Observer;
import com.example.demo.observer.EmailObserver;
import com.example.demo.observer.SMSObserver;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		System.out.println("Hello World!");

		Subject subject = new Subject();

		Observer emailObserver = new EmailObserver();
		Observer smsObserver = new SMSObserver();

		subject.addObserver(emailObserver);
		subject.addObserver(smsObserver);

		subject.setMessage("New product launched!");
		subject.setMessage("Special discount offer!");
	}

}
