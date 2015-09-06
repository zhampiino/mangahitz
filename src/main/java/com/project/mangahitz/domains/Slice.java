package com.project.mangahitz.domains;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Slice {

	@JsonProperty("number")
	private int number;
	@JsonProperty("size")
	private int size;
	@JsonProperty("totalElements")
	private int totalElements;
	@JsonProperty("totalPages")
	private int totalPages;
	@JsonProperty("last")
	private boolean last;
	@JsonProperty("first")
	private boolean first;
	@JsonProperty("numberOfElements")
	private int numberOfElements;
	@JsonProperty("sort")
	private List<Order> sort;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	public boolean isFirst() {
		return first;
	}
	public void setFirst(boolean first) {
		this.first = first;
	}
	public int getNumberOfElements() {
		return numberOfElements;
	}
	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}
	public List<Order> getSort() {
		return sort;
	}
	public void setSort(List<Order> sort) {
		this.sort = sort;
	}
	
}
