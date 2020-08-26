package au.com.midibak;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import au.com.midibak.logservice.LogClass;
import au.com.midibak.logserviceImpl.LogClassImpl;
import au.com.midibak.model.LogModel;

public class CommonsLogApplication {

	static Logger logger = Logger.getLogger(CommonsLogApplication.class);

	public static void main(String[] args) {

		DOMConfigurator.configure("src\\main\\resources\\log4j.xml");
		LogModel model = new LogModel();
		model.setServiceName("Test Service ");
		LogClass log = new LogClassImpl();
		log.logAsInfo(model, CommonsLogApplication.class);
	}

}
