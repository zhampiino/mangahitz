package com.project.mangahitz.domains.response;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.project.mangahitz.domains.Manga;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaListResponse extends BaseContentResponse {
	
	@org.codehaus.jackson.annotate.JsonProperty("manga_list")
	private List<Manga> mangaList;

	public List<Manga> getMangaList() {
		return mangaList;
	}

	public void setMangaList(List<Manga> mangaList) {
		this.mangaList = mangaList;
	}
	
}
