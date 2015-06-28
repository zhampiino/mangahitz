package com.project.mangahitz.domains.response;

import java.util.List;

import com.project.mangahitz.domains.Manga;

public class MangaResponse extends BaseResponse {

	private Manga manga;
	
	private List<Manga> mangas;

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}

	public List<Manga> getMangas() {
		return mangas;
	}

	public void setMangas(List<Manga> mangas) {
		this.mangas = mangas;
	}
	
	
	
}
