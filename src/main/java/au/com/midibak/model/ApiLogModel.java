package au.com.midibak.model;

import java.util.Date;

public class ApiLogModel {
	
	private LogModel logModel;
	private String sourceSystem;
	private String targetSystem;
	private String targetEndpoint;
	private String apiEndpointUrl;
	private String awsRequestId;
	private String requestId;
	private String btId;
	private Date   originTimestamp;
	private String eventType;
	private String trackingValue;
	public LogModel getLogModel() {
		return logModel;
	}
	public void setLogModel(LogModel logModel) {
		this.logModel = logModel;
	}
	public String getSourceSystem() {
		return sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public String getTargetSystem() {
		return targetSystem;
	}
	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}
	public String getTargetEndpoint() {
		return targetEndpoint;
	}
	public void setTargetEndpoint(String targetEndpoint) {
		this.targetEndpoint = targetEndpoint;
	}
	public String getApiEndpointUrl() {
		return apiEndpointUrl;
	}
	public void setApiEndpointUrl(String apiEndpointUrl) {
		this.apiEndpointUrl = apiEndpointUrl;
	}
	public String getAwsRequestId() {
		return awsRequestId;
	}
	public void setAwsRequestId(String awsRequestId) {
		this.awsRequestId = awsRequestId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getBtId() {
		return btId;
	}
	public void setBtId(String btId) {
		this.btId = btId;
	}
	public Date getOriginTimestamp() {
		return originTimestamp;
	}
	public void setOriginTimestamp(Date originTimestamp) {
		this.originTimestamp = originTimestamp;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getTrackingValue() {
		return trackingValue;
	}
	public void setTrackingValue(String trackingValue) {
		this.trackingValue = trackingValue;
	}
	@Override
	public String toString() {
		return "ApiLogModel [" + (logModel != null ? "logModel=" + logModel + ", " : "")
				+ (sourceSystem != null ? "sourceSystem=" + sourceSystem + ", " : "")
				+ (targetSystem != null ? "targetSystem=" + targetSystem + ", " : "")
				+ (targetEndpoint != null ? "targetEndpoint=" + targetEndpoint + ", " : "")
				+ (apiEndpointUrl != null ? "apiEndpointUrl=" + apiEndpointUrl + ", " : "")
				+ (awsRequestId != null ? "awsRequestId=" + awsRequestId + ", " : "")
				+ (requestId != null ? "requestId=" + requestId + ", " : "")
				+ (btId != null ? "btId=" + btId + ", " : "")
				+ (originTimestamp != null ? "originTimestamp=" + originTimestamp + ", " : "")
				+ (eventType != null ? "eventType=" + eventType + ", " : "")
				+ (trackingValue != null ? "trackingValue=" + trackingValue : "") + "]";
	}
	

	
	
	
}
