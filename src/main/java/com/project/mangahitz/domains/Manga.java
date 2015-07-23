package com.project.mangahitz.domains;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown=true)
public class Manga {

	@JsonProperty("manga_id")
	private Integer mangaId;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("alternate_name")
	private String alternateName;
	
	@JsonProperty("year_release")
	private String yearRelease;
	
	@JsonProperty("manga_status")
	private String mangaStatus;
	
	@JsonProperty("author")
	private String author;
	
	@JsonProperty("artist")
	private String artist;
	
	@JsonProperty("publishing")
	private String publishing;
	
	@JsonProperty("pic_url")
	private String picUrl;
	
	@JsonProperty("rate")
	private Integer rate;
	
	@JsonProperty("create_date")
	private String createDate;
	
	@JsonProperty("thumbnail_url")
	private String thumpnailUrl;
	
	@JsonProperty("content_url")
	private String contentUrl;
	
	@JsonProperty("lastest_ep")
	private Integer lastestEp;
	
	@JsonProperty("manga_eps")
	private List<MangaEp> mangaEps;
	
	public List<MangaEp> getMangaEps() {
		return mangaEps;
	}

	public void setMangaEps(List<MangaEp> mangaEps) {
		this.mangaEps = mangaEps;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public String getArtist() {
		return artist;
	}

	public String getAuthor() {
		return author;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String getDescription() {
		return description;
	}

	public Integer getMangaId() {
		return mangaId;
	}

	public String getMangaStatus() {
		return mangaStatus;
	}

	public String getName() {
		return name;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public String getPublishing() {
		return publishing;
	}

	public Integer getRate() {
		return rate;
	}

	public String getYearRelease() {
		return yearRelease;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMangaId(Integer mangaId) {
		this.mangaId = mangaId;
	}

	public void setMangaStatus(String mangaStatus) {
		this.mangaStatus = mangaStatus;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public void setYearRelease(String yearRelease) {
		this.yearRelease = yearRelease;
	}

	public String getThumpnailUrl() {
		return thumpnailUrl;
	}

	public void setThumpnailUrl(String thumpnailUrl) {
		this.thumpnailUrl = thumpnailUrl;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public Integer getLastestEp() {
		return lastestEp;
	}

	public void setLastestEp(Integer lastestEp) {
		this.lastestEp = lastestEp;
	}
	
	
}
