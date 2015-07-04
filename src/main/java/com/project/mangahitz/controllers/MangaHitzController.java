package com.project.mangahitz.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.mangahitz.constants.MGHConstants;
import com.project.mangahitz.domains.response.MangaResponse;
import com.project.mangahitz.service.MangaHitzRESTful;
import com.project.mangahitz.views.IndexView;

/**
 * Handles requests for the application home page.
 */
@Controller
//@SessionAttributes(value={"viewType","mangaName"})
public class MangaHitzController {
	
	private static final Logger logger = LoggerFactory.getLogger(MangaHitzController.class);
	
	@Autowired
	private MangaHitzRESTful mangaHitzRESTful;
	
	public void setMangaHitzRESTful(MangaHitzRESTful mangaHitzRESTful) {
		this.mangaHitzRESTful = mangaHitzRESTful;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public IndexView index(Locale locale, Model model,@RequestParam(value="viewType", required = false) String viewType) {

		IndexView returnView = new IndexView();
		
		if(viewType == null || viewType.equals(""))
			returnView.setViewType(MGHConstants.VIEW_TYPE_LIST);
		else
			returnView.setViewType(viewType);
		
		MangaResponse lastest = mangaHitzRESTful.getLastReleaseManga(returnView.getViewType(), returnView.getPageNumber(), MGHConstants.RELEASE_LASTEST);
		
		returnView.setStatus(lastest.isStatus());
		returnView.setMsg(lastest.getMsg());
		returnView.setTotalPages(lastest.getTotalPages());
		
		if(returnView.getViewType().equals(MGHConstants.VIEW_TYPE_LIST)){
			returnView.setMangas(lastest.getMangas());
		}else{
			returnView.setMangaEps(lastest.getMangaEps());
		}
		MangaResponse popular = mangaHitzRESTful.getPopularManga();
		returnView.setTop5Mangas(popular.getTop5Mangas());
		returnView.setPopularMangas(popular.getPopularMangas());
		
		return returnView;
	}
	
	@RequestMapping(value = "/latest-chapters/{pageNumber}", method = RequestMethod.GET)
	public IndexView indexViewTypeWithPage(Locale locale, Model model,
			@RequestParam(value="viewType", required = true) String viewType,
			@PathVariable("pageNumber") Integer pageNumber) {
		
		IndexView returnView = new IndexView();
		
		System.out.println(model.containsAttribute("viewType"));
		
		returnView.setViewType(viewType);
		returnView.setPageNumber(pageNumber);
		
		return returnView;
	}
	
	@RequestMapping(value = "/{mangaName}", method = RequestMethod.GET)
	public String manga(Locale locale, Model model,@PathVariable("mangaName") String mangaName) {
		
		model.addAttribute("mangaName", mangaName);
		
		MangaResponse mgResponse = mangaHitzRESTful.getMangaByName(mangaName,1);
		
		return "manga";
	}
	
	@RequestMapping(value = "/{mangaName}/{mangaEpNo}", method = RequestMethod.GET)
	public String mangaEp(Locale locale, Model model,
			@PathVariable("mangaName") String mangaName,
			@PathVariable("mangaEpNo") Integer mangaEpNo) {
		
		model.addAttribute("mangaName", mangaName);
		model.addAttribute("mangaEpNo", mangaEpNo);
		
		MangaResponse mgResponse = mangaHitzRESTful.getMangaEp(mangaName, mangaEpNo);
		
		return "manga_ep";
	}
}
