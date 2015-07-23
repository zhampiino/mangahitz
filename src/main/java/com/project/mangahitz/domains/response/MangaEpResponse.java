package com.project.mangahitz.domains.response;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.project.mangahitz.domains.MangaEp;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaEpResponse {

	@JsonProperty("manga_ep")
	private MangaEp mangaEp;

	public MangaEp getMangaEp() {
		return mangaEp;
	}

	public void setMangaEp(MangaEp mangaEp) {
		this.mangaEp = mangaEp;
	}
	
	
}
