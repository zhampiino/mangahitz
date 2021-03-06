package com.project.mangahitz.domains;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PageableMangaEpPic  extends Slice {

	@JsonProperty("content")
	private List<MangaEpPic> content;

	public List<MangaEpPic> getContent() {
		return content;
	}

	public void setContent(List<MangaEpPic> content) {
		this.content = content;
	}
	
}
