package com.project.mangahitz.domains;

import java.util.List;

public class Manga {

	private Integer mangaId;
	private String name;
	private String description;
	private String alternateName;
	private String yearRelease;
	private String mangaStatus;
	private String author;
	private String artist;
	private String publishing;
	private String picUrl;
	private Integer rate;
	private String createDate;
	private String status;
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
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
