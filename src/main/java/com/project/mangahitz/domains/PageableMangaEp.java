package com.project.mangahitz.domains;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PageableMangaEp  extends Slice {

	@JsonProperty("content")
	private List<MangaEp> content;

	public List<MangaEp> getContent() {
		return content;
	}

	public void setContent(List<MangaEp> content) {
		this.content = content;
	}
	
}
