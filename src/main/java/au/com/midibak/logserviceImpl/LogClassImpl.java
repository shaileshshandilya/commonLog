package au.com.midibak.logserviceImpl;

import org.apache.log4j.Logger;

import au.com.midibak.logservice.LogClass;
import au.com.midibak.model.LogModel;

public class LogClassImpl implements LogClass {

	private static LogClass instance = null;
	Logger logger=null;

	public static LogClass getInstance() {
		if (instance == null) {
			instance = new LogClassImpl();
		}
		return instance;
	}

	@Override
	public void logAsInfo(LogModel model, Class<?> cls) {
		logger = Logger.getLogger(cls);
		logger.trace("A TRACE Message" + model.toString());
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message" + model.toString());
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");

	}

	@Override
	public void logAsWarn(LogModel model, Class<?> cls) {
		logger = Logger.getLogger(cls);
		logger.warn("A WARN Message"+model.toString());

	}

}
