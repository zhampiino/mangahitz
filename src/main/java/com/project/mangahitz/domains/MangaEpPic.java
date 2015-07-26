package com.project.mangahitz.domains;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaEpPic {

	@JsonProperty("ep_pic_id")
	private Integer epPicId;
	
	@JsonProperty("manga_ep_id")
	private Integer mangaEpId;
	
	@JsonProperty("picUrl")
	private String picUrl;

	public Integer getEpPicId() {
		return epPicId;
	}

	public void setEpPicId(Integer epPicId) {
		this.epPicId = epPicId;
	}
	
	public Integer getMangaEpId() {
		return mangaEpId;
	}

	public void setMangaEpId(Integer mangaEpId) {
		this.mangaEpId = mangaEpId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	
	
}
