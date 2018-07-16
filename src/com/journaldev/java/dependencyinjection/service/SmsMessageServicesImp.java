package com.journaldev.java.dependencyinjection.service;

public class SmsMessageServicesImp implements MessageService {
	public int z = 9;
	@Override
	public void processMessange(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("SMS message from " + msg + " to " + rec);
	}	
}