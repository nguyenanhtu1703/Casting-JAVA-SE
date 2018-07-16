package com.journaldev.java.dependencyinjection.injector;

import com.casting.test.myDITest;
import com.journaldev.java.dependencyinjection.consumer.*;
import com.journaldev.java.dependencyinjection.service.*;

public class SmsServiceInjector implements MessageServiceInjectorInterface {

	@Override
	public Consumer getCustomer() {
		// TODO Auto-generated method stub
		return new myDIApplication(new SmsMessageServicesImp());
	}
	
}
