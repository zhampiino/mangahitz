package com.project.mangahitz.domains.response;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.project.mangahitz.domains.Manga;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaResponse {

	@JsonProperty("manga")
	private Manga manga;

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}
}
