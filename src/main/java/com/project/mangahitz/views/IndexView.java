package com.project.mangahitz.views;

import java.util.List;

import com.project.mangahitz.constants.MGHConstants;
import com.project.mangahitz.domains.Manga;
import com.project.mangahitz.domains.MangaEp;


public class IndexView extends BaseView {

	
	private String viewType;
	private Manga manga;
	private List<Manga> mangas;
	private MangaEp mangaEp;
	private List<MangaEp> mangaEps;
	
	public IndexView(){
		this.setViewName("index");
		this.viewType = MGHConstants.VIEW_TYPE_LIST;
	}
	
	public String getViewType() {
		return viewType;
	}


	public void setViewType(String viewType) {
		this.viewType = viewType;
		
		this.addObject("viewType", viewType);
		
	}

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
		this.addObject("manga", manga);
	}

	public List<Manga> getMangas() {
		return mangas;
	}

	public void setMangas(List<Manga> mangas) {
		this.mangas = mangas;
		this.addObject("mangas", mangas);
	}

	public MangaEp getMangaEp() {
		return mangaEp;
	}

	public void setMangaEp(MangaEp mangaEp) {
		this.mangaEp = mangaEp;
		this.addObject("mangaEp", mangaEp);
	}

	public List<MangaEp> getMangaEps() {
		return mangaEps;
	}

	public void setMangaEps(List<MangaEp> mangaEps) {
		this.mangaEps = mangaEps;
		this.addObject("mangaEps", mangaEps);
	}


	
	
}
