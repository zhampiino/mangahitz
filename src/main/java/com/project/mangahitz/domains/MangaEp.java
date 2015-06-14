package com.project.mangahitz.domains;


public class MangaEp {

	private Integer mangaEpId;
	private String epNo;
	private String epName;
	private String releaseDate;
	private Integer rate;
	private String createDate;
	private Manga manga;

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
}
