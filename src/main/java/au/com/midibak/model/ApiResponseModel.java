package au.com.midibak.model;

public class ApiResponseModel {
	private ApiLogModel apiLogModel;
	private String responseStatus;
	private String responsePayloadType;
	private String responseHeader;
	private String responseBody;
	public ApiLogModel getApiLogModel() {
		return apiLogModel;
	}
	public void setApiLogModel(ApiLogModel apiLogModel) {
		this.apiLogModel = apiLogModel;
	}
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public String getResponsePayloadType() {
		return responsePayloadType;
	}
	public void setResponsePayloadType(String responsePayloadType) {
		this.responsePayloadType = responsePayloadType;
	}
	public String getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(String responseHeader) {
		this.responseHeader = responseHeader;
	}
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	@Override
	public String toString() {
		return "ApiResponseModel [" + (apiLogModel != null ? "apiLogModel=" + apiLogModel + ", " : "")
				+ (responseStatus != null ? "responseStatus=" + responseStatus + ", " : "")
				+ (responsePayloadType != null ? "responsePayloadType=" + responsePayloadType + ", " : "")
				+ (responseHeader != null ? "responseHeader=" + responseHeader + ", " : "")
				+ (responseBody != null ? "responseBody=" + responseBody : "") + "]";
	}
	
	
}
