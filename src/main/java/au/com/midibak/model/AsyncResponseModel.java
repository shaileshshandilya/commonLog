package au.com.midibak.model;

public class AsyncResponseModel {
	
	private ApiLogModel apiLogModel;
	private String queueName;
	private String responseMessageType; //XML or JSON 
	private String responseMessage;
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
	public String getResponseMessageType() {
		return responseMessageType;
	}
	public void setResponseMessageType(String responseMessageType) {
		this.responseMessageType = responseMessageType;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	@Override
	public String toString() {
		return "AsyncResponseModel [" + (apiLogModel != null ? "apiLogModel=" + apiLogModel + ", " : "")
				+ (queueName != null ? "queueName=" + queueName + ", " : "")
				+ (responseMessageType != null ? "responseMessageType=" + responseMessageType + ", " : "")
				+ (responseMessage != null ? "responseMessage=" + responseMessage : "") + "]";
	}

	
	
}
