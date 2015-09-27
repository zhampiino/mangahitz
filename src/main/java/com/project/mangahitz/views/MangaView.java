package com.project.mangahitz.views;

import com.project.mangahitz.domains.Manga;
import com.project.mangahitz.domains.PageableMangaEp;

public class MangaView extends BaseView {

	private Manga manga;
	
	private PageableMangaEp mangaEps;
	
	public MangaView(){
		this.setViewName("manga");
	}
	
	public Manga getManga() {
		return manga;
	}
	public void setManga(Manga manga) {
		this.manga = manga;
		this.addObject("manga", manga);
	}
	public PageableMangaEp getMangaEps() {
		return mangaEps;
	}
	public void setMangaEps(PageableMangaEp mangaEps) {
		this.mangaEps = mangaEps;
		this.addObject("mangaEps", mangaEps);
	}
	
}
