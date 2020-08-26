package au.com.midibak.logservice;

import au.com.midibak.model.LogModel;

public interface LogClass {
	
	public void logAsInfo(LogModel model,Class<?> cls);
	public void logAsWarn(LogModel model,Class<?> cls);

}
