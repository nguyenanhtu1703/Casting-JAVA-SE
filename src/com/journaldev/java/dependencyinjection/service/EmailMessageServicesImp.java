package com.journaldev.java.dependencyinjection.service;

public class EmailMessageServicesImp implements MessageService {
	@Override
	public void processMessange(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Email message from " + msg + " to " + rec);
	}
}