package au.com.midibak.model;

enum ApiRequestType{
	REST,SOAP
}

enum RequestPayloadType{
	JSON,XML
}
public class ApiRequestModel {
	
	private ApiLogModel apiLogModel;
	private ApiRequestType requestType; // Rest or SOAP
	private RequestPayloadType requestPayloadType; //json or XML
	private String requestHeader;
	private String requestBody;
	public ApiLogModel getApiLogModel() {
		return apiLogModel;
	}
	public void setApiLogModel(ApiLogModel apiLogModel) {
		this.apiLogModel = apiLogModel;
	}
	
	
	public ApiRequestType getRequestType() {
		return requestType;
	}
	public void setRequestType(ApiRequestType requestType) {
		this.requestType = requestType;
	}
	
	public RequestPayloadType getRequestPayloadType() {
		return requestPayloadType;
	}
	public void setRequestPayloadType(RequestPayloadType requestPayloadType) {
		this.requestPayloadType = requestPayloadType;
	}
	public String getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(String requestHeader) {
		this.requestHeader = requestHeader;
	}
	public String getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	@Override
	public String toString() {
		return "ApiRequestModel [" + (apiLogModel != null ? "apiLogModel=" + apiLogModel + ", " : "")
				+ (requestType != null ? "requestType=" + requestType + ", " : "")
				+ (requestPayloadType != null ? "requestPayloadType=" + requestPayloadType + ", " : "")
				+ (requestHeader != null ? "requestHeader=" + requestHeader + ", " : "")
				+ (requestBody != null ? "requestBody=" + requestBody : "") + "]";
	} 
	
	

	
}
