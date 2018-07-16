package com.journaldev.java.dependencyinjection.consumer;

import com.journaldev.java.dependencyinjection.service.*;

public class myDIApplication implements Consumer {
	
	MessageService sv;
	
	public myDIApplication(MessageService sv2) {
		sv = sv2;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void preProcessMessages(String msg, String rec) {
		// TODO Auto-generated method stub
		sv.processMessange(msg, rec);
	}
}




