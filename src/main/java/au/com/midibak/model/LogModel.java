package au.com.midibak.model;

import java.util.Date;
/*
 * This Model is to accommodate logs 
 */

enum LogLevel{
	trace, debug, info, warn, error;
	}


public class LogModel {
	private String serviceName;
	private String requestId;
	private Date dateTime;
	private String userId;
	private String ipAddress;
	private String messageBody;
	private LogLevel logLevel;
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	
	
	
	public LogLevel getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}
	@Override
	public String toString() {
		return "LogModel [serviceName=" + serviceName + ", requestId=" + requestId + ", dateTime=" + dateTime
				+ ", userId=" + userId + ", ipAddress=" + ipAddress + ", messageBody=" + messageBody + ", logLevel="
				+ logLevel + ", getServiceName()=" + getServiceName() + ", getRequestId()=" + getRequestId()
				+ ", getDateTime()=" + getDateTime() + ", getUserId()=" + getUserId() + ", getIpAddress()="
				+ getIpAddress() + ", getMessageBody()=" + getMessageBody() + ", getLogLevel()=" + getLogLevel()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
