package com.project.mangahitz.domains;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.project.mangahitz.utils.CalendarUtils;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaEp {

	@JsonProperty("manga_ep_id")
	private Integer mangaEpId;
	
	@JsonProperty("manga_id")
	private Integer mangaId;
	
	@JsonProperty("ep_no")
	private String epNo;
	
	@JsonProperty("ep_name")
	private String epName;

	@JsonProperty("release_date")
	private Date releaseDate;

	@JsonProperty("rate")
	private Integer rate;

	@JsonProperty("chapter_url")
	private String chapterUrl;
	
	@JsonProperty("create_date")
	private Date createDate;

	@JsonProperty("pic_url")
	private String picUrl;
	
	@JsonProperty("request_name")
	private String requestName;
	
	@JsonProperty("name")
	private String name;
	
	private String releaseDateStr;
	
	public String getReleaseDateStr() {
		return releaseDateStr;
	}

	public void setReleaseDateStr(String releaseDateStr) {
		this.releaseDateStr = releaseDateStr;
	}

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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
		String tempRelease =  CalendarUtils.getRelativeTime(releaseDate);
		if(tempRelease.equals("")){
			SimpleDateFormat sdfmt = new SimpleDateFormat("dd/MM/yyyy");
			this.releaseDateStr = sdfmt.format(releaseDate);
		}else{
			this.releaseDateStr = tempRelease;
		}
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public String getChapterUrl() {
		return chapterUrl;
	}

	public void setChapterUrl(String chapterUrl) {
		this.chapterUrl = chapterUrl;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
