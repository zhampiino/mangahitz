package com.project.mangahitz.domains.response;

import java.util.List;

import com.project.mangahitz.domains.Manga;
import com.project.mangahitz.domains.MangaEp;

public class MangaResponse extends BaseResponse {

	private Manga manga;
	
	private List<Manga> mangas;
	
	private MangaEp mangaEp;
	
	private List<MangaEp> mangaEps;

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

	public MangaEp getMangaEp() {
		return mangaEp;
	}

	public void setMangaEp(MangaEp mangaEp) {
		this.mangaEp = mangaEp;
	}

	public List<MangaEp> getMangaEps() {
		return mangaEps;
	}

	public void setMangaEps(List<MangaEp> mangaEps) {
		this.mangaEps = mangaEps;
	}
	
	
	
}
