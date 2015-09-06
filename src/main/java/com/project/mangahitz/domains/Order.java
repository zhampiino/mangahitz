package com.project.mangahitz.domains;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Order {

	@JsonProperty("direction")
	private String direction;
	@JsonProperty("property")
	private String property;
	@JsonProperty("ignoreCase")
	private boolean ignoreCase;
	@JsonProperty("nullHandling")
	private String nullHandling;
	@JsonProperty("ascending")
	private boolean ascending;
	
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public boolean isIgnoreCase() {
		return ignoreCase;
	}
	public void setIgnoreCase(boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}
	public String getNullHandling() {
		return nullHandling;
	}
	public void setNullHandling(String nullHandling) {
		this.nullHandling = nullHandling;
	}
	public boolean isAscending() {
		return ascending;
	}
	public void setAscending(boolean ascending) {
		this.ascending = ascending;
	}
	 
	 
	
}
