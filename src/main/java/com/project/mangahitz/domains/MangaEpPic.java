package com.project.mangahitz.domains;


public class MangaEpPic {

	private Integer epPicId;
	
	private Integer mangaEpId;
	
	public Integer getMangaEpId() {
		return mangaEpId;
	}

	public void setMangaEpId(Integer mangaEpId) {
		this.mangaEpId = mangaEpId;
	}

	public Integer getEpPicId() {
		return epPicId;
	}

	public void setEpPicId(Integer epPicId) {
		this.epPicId = epPicId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	private String picUrl;
	
}
