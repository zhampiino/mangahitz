package com.project.mangahitz.domains;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;



//@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaEp {

	@JsonProperty("manga_ep_id")
	private Integer mangaEpId;
	
	@JsonProperty("ep_no")
	private String epNo;
	
	@JsonProperty("ep_name")
	private String epName;
	
	@JsonProperty("release_date")
	private String releaseDate;
	
	@JsonProperty("rate")
	private Integer rate;
	
	@JsonProperty("create_date")
	private String createDate;
	
	@JsonProperty("manga")
	private Manga manga;
	
	@JsonProperty("manga_ep_pics")
	private List<MangaEpPic> mangaEpPics;

	public Integer getMangaEpId() {
		return mangaEpId;
	}

	public void setMangaEpId(Integer mangaEpId) {
		this.mangaEpId = mangaEpId;
	}

	public String getEpNo() {
		return epNo;
	}

	public void setEpNo(String epNo) {
		this.epNo = epNo;
	}

	public String getEpName() {
		return epName;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}

	public List<MangaEpPic> getMangaEpPics() {
		return mangaEpPics;
	}

	public void setMangaEpPics(List<MangaEpPic> mangaEpPics) {
		this.mangaEpPics = mangaEpPics;
	}
}
