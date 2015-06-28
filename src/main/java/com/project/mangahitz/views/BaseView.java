package com.project.mangahitz.views;

import org.springframework.web.servlet.ModelAndView;

public class BaseView extends ModelAndView {

	private boolean status;
	private String msg;
	
	public BaseView(){
		this.setStatus(false);
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		
		this.addObject("status", status);
		
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		
		this.msg = msg;
		
		this.addObject("msg", msg);
	}
	
	
	
}
