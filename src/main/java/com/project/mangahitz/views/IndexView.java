package com.project.mangahitz.views;

import com.project.mangahitz.constants.MGHConstants;
import com.project.mangahitz.domains.response.MangaEpListResponse;
import com.project.mangahitz.domains.response.MangaListResponse;


public class IndexView extends BaseView {

	
	private String viewType;
	private MangaListResponse lastestManga;
	private MangaEpListResponse lastestMangaEp;
	private MangaListResponse popularManga;
	private MangaEpListResponse popularMangaEp;
	
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

	public MangaListResponse getLastestManga() {
		return lastestManga;
	}

	public void setLastestManga(MangaListResponse lastestManga) {
		this.addObject("lastestManga", lastestManga);
		this.lastestManga = lastestManga;
	}

	public MangaEpListResponse getLastestMangaEp() {
		return lastestMangaEp;
	}

	public void setLastestMangaEp(MangaEpListResponse lastestMangaEp) {
		this.addObject("lastestMangaEp", lastestMangaEp);
		this.lastestMangaEp = lastestMangaEp;
	}

	public MangaListResponse getPopularManga() {
		return popularManga;
	}

	public void setPopularManga(MangaListResponse popularManga) {
		this.addObject("popularManga", popularManga);
		this.popularManga = popularManga;
	}

	public MangaEpListResponse getPopularMangaEp() {
		return popularMangaEp;
	}

	public void setPopularMangaEp(MangaEpListResponse popularMangaEp) {
		this.addObject("popularMangaEp", popularMangaEp);
		this.popularMangaEp = popularMangaEp;
	}

	
	
	
}
