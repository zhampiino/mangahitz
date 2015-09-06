package com.project.mangahitz.views;

import org.springframework.web.servlet.ModelAndView;

import com.project.mangahitz.domains.PageableManga;
import com.project.mangahitz.domains.PageableMangaEp;

public class MangaHitzView extends ModelAndView {
	
	private String viewType;

	private PageableManga pageableLastestManga;
	private PageableMangaEp pageableLastestMangaEp;
	
	public MangaHitzView(){
		this.setViewName("/index");
	}
	
	public String getViewType() {
		return viewType;
	}

	public void setViewType(String viewType) {
		this.viewType = viewType;
		this.addObject("viewType", viewType);
	}

	public PageableManga getPageableLastestManga() {
		return pageableLastestManga;
	}

	public void setPageableLastestManga(PageableManga pageableLastestManga) {
		this.pageableLastestManga = pageableLastestManga;
		
		this.addObject("pageableLastestManga", pageableLastestManga);
	}

	public PageableMangaEp getPageableLastestMangaEp() {
		return pageableLastestMangaEp;
	}

	public void setPageableLastestMangaEp(PageableMangaEp pageableLastestMangaEp) {
		this.pageableLastestMangaEp = pageableLastestMangaEp;
		
		this.addObject("pageableLastestMangaEp", pageableLastestMangaEp);
	}
}
