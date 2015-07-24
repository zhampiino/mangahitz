package com.project.mangahitz.domains;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Picture {

	@JsonProperty("pic_url")
	private String picUrl;
	@JsonProperty("base64_url")
	private String base64Url;
	@JsonProperty("extension")
	private String extension;
	
	public String getBase64Url() {
		return base64Url;
	}
	public void setBase64Url(String base64Url) {
		this.base64Url = base64Url;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
}
