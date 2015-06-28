package com.project.mangahitz.views;


public class IndexView extends BaseView {

	
	private String viewType;
	private Integer pageNumber;
	
	public IndexView(){
		this.setViewName("index");
	}
	
	public String getViewType() {
		return viewType;
	}


	public void setViewType(String viewType) {
		this.viewType = viewType;
		
		this.addObject("viewType", viewType);
		
	}


	public Integer getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		
		this.addObject("pageNumber", pageNumber);
	}
	
}
