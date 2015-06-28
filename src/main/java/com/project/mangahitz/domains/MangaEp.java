package com.project.mangahitz.domains;

import java.util.List;


public class MangaEp {

	private Integer mangaEpId;
	private Integer mangaId;
	private Integer epNo;
	private String epName;
	private String releaseDate;
	private Integer rate;
	private String createDate;
	private Manga manga;
	private List<MangaEpPic> mangaEpPics;
	
	
	public Integer getMangaEpId() {
		return mangaEpId;
	}

	public void setMangaEpId(Integer mangaEpId) {
		this.mangaEpId = mangaEpId;
	}

	public Integer getMangaId() {
		return mangaId;
	}

	public void setMangaId(Integer mangaId) {
		this.mangaId = mangaId;
	}
	
	public Integer getEpNo() {
		return epNo;
	}

	public void setEpNo(Integer epNo) {
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
