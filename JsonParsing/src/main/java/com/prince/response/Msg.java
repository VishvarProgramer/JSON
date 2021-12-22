package com.prince.response;

public class Msg {

	public String serverity ;
    public String code ; 
    public String priority ;
    public String message ;
    public String value ;
	public String getServerity() {
		return serverity;
	}
	public void setServerity(String serverity) {
		this.serverity = serverity;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
