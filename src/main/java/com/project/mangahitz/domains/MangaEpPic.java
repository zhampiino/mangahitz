package com.project.mangahitz.domains;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaEpPic {

	@JsonProperty("ep_pic_id")
	private Integer epPicId;
	
	@JsonProperty("manga_ep_id")
	private Integer mangaEpId;
	
	@JsonProperty("pic")
	private Picture pic;

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

	public Picture getPic() {
		return pic;
	}

	public void setPic(Picture pic) {
		this.pic = pic;
	}
	
	
	
}
