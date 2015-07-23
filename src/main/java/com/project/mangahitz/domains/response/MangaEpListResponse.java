package com.project.mangahitz.domains.response;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import com.project.mangahitz.domains.MangaEp;

@JsonIgnoreProperties(ignoreUnknown=true)
public class MangaEpListResponse extends BaseContentResponse {

	@JsonProperty("manga_ep_list")
	private List<MangaEp> mangaEpList;

	public List<MangaEp> getMangaEpList() {
		return mangaEpList;
	}

	public void setMangaEpList(List<MangaEp> mangaEpList) {
		this.mangaEpList = mangaEpList;
	}
}
