package com.project.mangahitz.views;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.project.mangahitz.domains.MangaEp;
import com.project.mangahitz.domains.MangaEpPic;

public class MangaEpView extends ModelAndView {

	private MangaEp mangaEp;
	
	private List<MangaEpPic> mangaEpPics;
	
	public MangaEpView(){
		this.setViewName("/manga_ep");
	}

	public MangaEp getMangaEp() {
		return mangaEp;
	}

	public void setMangaEp(MangaEp mangaEp) {
		this.mangaEp = mangaEp;
		this.addObject("mangaEp", mangaEp);
	}

	public List<MangaEpPic> getMangaEpPics() {
		return mangaEpPics;
	}

	public void setMangaEpPics(List<MangaEpPic> mangaEpPics) {
		this.mangaEpPics = mangaEpPics;
		this.addObject("mangaEpPics", mangaEpPics);
	}
	
	
	
}
