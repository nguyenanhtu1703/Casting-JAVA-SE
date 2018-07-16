package com.casting.test;

import com.journaldev.java.dependencyinjection.consumer.*;
import com.journaldev.java.dependencyinjection.service.*;
import com.journaldev.java.dependencyinjection.injector.*;

public class myDITest {
	public static void main(String args[]) {
		System.out.println("nguyen anh tu");
		SmsMessageServicesImp tmp = new SmsMessageServicesImp();
		
		Consumer con = null;
		EmailServiceInjector em = new EmailServiceInjector();
		con = em.getCustomer();
		con.preProcessMessages("12345", "7890");
		
		SmsServiceInjector sm = new SmsServiceInjector();
		con = sm.getCustomer();
		con.preProcessMessages("12345", "7890");
	}
}