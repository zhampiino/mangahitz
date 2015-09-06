package com.project.mangahitz.domains;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PageableManga extends Slice {

	@JsonProperty("content")
	private List<Manga> content;

	public List<Manga> getContent() {
		return content;
	}

	public void setContent(List<Manga> content) {
		this.content = content;
	}
	
	
	
}
