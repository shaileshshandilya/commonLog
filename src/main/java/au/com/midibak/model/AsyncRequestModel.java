package au.com.midibak.model;

public class AsyncRequestModel {
	private ApiLogModel apiLogModel;
	private String queueName;
	private String messageType; //XML or JSON 
	private String requestMessage;
	public ApiLogModel getApiLogModel() {
		return apiLogModel;
	}
	public void setApiLogModel(ApiLogModel apiLogModel) {
		this.apiLogModel = apiLogModel;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getRequestMessage() {
		return requestMessage;
	}
	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}
	@Override
	public String toString() {
		return "AsyncRequestModel [" + (apiLogModel != null ? "apiLogModel=" + apiLogModel + ", " : "")
				+ (queueName != null ? "queueName=" + queueName + ", " : "")
				+ (messageType != null ? "messageType=" + messageType + ", " : "")
				+ (requestMessage != null ? "requestMessage=" + requestMessage : "") + "]";
	}
	
	
	
	
	
}
