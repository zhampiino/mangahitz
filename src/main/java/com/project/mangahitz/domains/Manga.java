package com.project.mangahitz.domains;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Manga {

	@JsonProperty("manga_id")
	private Integer mangaId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("request_name")
	private String requestName;

	@JsonProperty("description")
	private String description;

	@JsonProperty("alternate_name")
	private String alternateName;

	@JsonProperty("year_release")
	private String yearRelease;

	@JsonProperty("status")
	private String status;

	@JsonProperty("author")
	private String author;

	@JsonProperty("artist")
	private String artist;

	@JsonProperty("publishing")
	private String publishing;

	@JsonProperty("categories")
	private String categories;

	@JsonProperty("tagges")
	private String tagges;

	@JsonProperty("original_pic_url")
	private String originalPicUrl;

	@JsonProperty("rate")
	private Integer rate;

	@JsonProperty("create_date")
	private Date createDate;

	@JsonProperty("original_thumbnail_url")
	private String originalThumbnailUrl;

	@JsonProperty("content_url")
	private String contentUrl;

	@JsonProperty("upload_pic_url")
	private String uploadPicUrl;

	@JsonProperty("upload_thumbnail_url")
	private String uploadThumbnailUrl;

	@JsonProperty("lastest_release")
	private Date lastestRelease;
	
	private List<MangaEp> mangaEpsList;

	public Integer getMangaId() {
		return mangaId;
	}

	public void setMangaId(Integer mangaId) {
		this.mangaId = mangaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public String getYearRelease() {
		return yearRelease;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getTagges() {
		return tagges;
	}

	public void setTagges(String tagges) {
		this.tagges = tagges;
	}

	public String getOriginalPicUrl() {
		return originalPicUrl;
	}

	public void setOriginalPicUrl(String originalPicUrl) {
		this.originalPicUrl = originalPicUrl;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getOriginalThumbnailUrl() {
		return originalThumbnailUrl;
	}

	public void setOriginalThumbnailUrl(String originalThumbnailUrl) {
		this.originalThumbnailUrl = originalThumbnailUrl;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getUploadPicUrl() {
		return uploadPicUrl;
	}

	public void setUploadPicUrl(String uploadPicUrl) {
		this.uploadPicUrl = uploadPicUrl;
	}

	public String getUploadThumbnailUrl() {
		return uploadThumbnailUrl;
	}

	public void setUploadThumbnailUrl(String uploadThumbnailUrl) {
		this.uploadThumbnailUrl = uploadThumbnailUrl;
	}

	public Date getLastestRelease() {
		return lastestRelease;
	}

	public void setLastestRelease(Date lastestRelease) {
		this.lastestRelease = lastestRelease;
	}

	public List<MangaEp> getMangaEpsList() {
		return mangaEpsList;
	}

	public void setMangaEpsList(List<MangaEp> mangaEpsList) {
		this.mangaEpsList = mangaEpsList;
	}



}
