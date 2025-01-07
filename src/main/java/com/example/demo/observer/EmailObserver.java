package com.example.demo.observer;

public class EmailObserver implements Observer {

    @Override
    public void update(String message){
        System.out.println("Email Observer: " + message);
    }
}
