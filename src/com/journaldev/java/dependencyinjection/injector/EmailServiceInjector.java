package com.journaldev.java.dependencyinjection.injector;

import com.journaldev.java.dependencyinjection.consumer.Consumer;
import com.journaldev.java.dependencyinjection.consumer.myDIApplication;
import com.journaldev.java.dependencyinjection.service.EmailMessageServicesImp;

public class EmailServiceInjector implements MessageServiceInjectorInterface {

	@Override
	public Consumer getCustomer() {
		// TODO Auto-generated method stub
		return new myDIApplication(new EmailMessageServicesImp());
	}
	

}
