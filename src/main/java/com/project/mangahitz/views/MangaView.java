package com.project.mangahitz.views;

import java.util.List;

import com.project.mangahitz.domains.Manga;
import com.project.mangahitz.domains.MangaEp;

public class MangaView extends BaseView {

	private Manga manga;
	
	private List<MangaEp> mangaEps;
	
	public MangaView(){
		this.setViewName("manga");
	}
	
	public Manga getManga() {
		return manga;
	}
	public void setManga(Manga manga) {
		this.manga = manga;
	}
	public List<MangaEp> getMangaEps() {
		return mangaEps;
	}
	public void setMangaEps(List<MangaEp> mangaEps) {
		this.mangaEps = mangaEps;
	}
	
}
