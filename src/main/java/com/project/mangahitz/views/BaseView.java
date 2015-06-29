package com.project.mangahitz.views;

import org.springframework.web.servlet.ModelAndView;

public class BaseView extends ModelAndView {

	private boolean status;
	private String msg;
	private Integer totalPages;
	private Integer pageNumber;
	
	public BaseView(){
		this.setStatus(false);
		this.setPageNumber(1);
		this.setTotalPages(1);
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
	
	public Integer getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		
		this.addObject("pageNumber", pageNumber);
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
		
		this.addObject("totalPages", totalPages);
	}
	
	
}
