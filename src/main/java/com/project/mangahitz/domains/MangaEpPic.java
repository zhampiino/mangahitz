package com.project.mangahitz.domains;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaEpPic {


	@JsonProperty("ep_pic_id")
	private Integer epPicId;

	@JsonProperty("manga_ep_id")
	private Integer mangaEpId;

	@JsonProperty("original_pic_url")
	private String originalPicUrl;
	
	@JsonProperty("upload_pic_url")
	private String uploadPicUrl;

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

	public String getOriginalPicUrl() {
		return originalPicUrl;
	}

	public void setOriginalPicUrl(String originalPicUrl) {
		this.originalPicUrl = originalPicUrl;
	}

	public String getUploadPicUrl() {
		return uploadPicUrl;
	}

	public void setUploadPicUrl(String uploadPicUrl) {
		this.uploadPicUrl = uploadPicUrl;
	}
	
}
