package com.prince.response;

import java.util.List;

public class ErrorMessages {

	public List<Msg> msg ;
    public String count ;
	public List<Msg> getMsg() {
		return msg;
	}
	public void setMsg(List<Msg> msg) {
		this.msg = msg;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
}
