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
import org.springframework.web.servlet.ModelAndView;

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
	public IndexView index(Locale locale, Model model) {

		IndexView returnView = new IndexView();
		
		returnView.setViewType("list");
		
		//model.addAttribute("viewType", "list");
		
		
		
		return returnView;
	}
	
	@RequestMapping(value = "/view/{viewType}", method = RequestMethod.GET)
	public IndexView indexViewType(Locale locale, Model model,@PathVariable("viewType") String viewType) {
		
		IndexView returnView = new IndexView();
		
		System.out.println(model.containsAttribute("viewType"));
		
		returnView.setViewType(viewType);
		
		//mangaHitzRESTful.getLastReleaseManga(viewType,0,"");
		
		
		return returnView;
	}
	
	@RequestMapping(value = "/view/{viewType}/page/{pageNumber}", method = RequestMethod.GET)
	public IndexView indexViewTypeWithPage(Locale locale, Model model,
			@PathVariable("viewType") String viewType,
			@PathVariable("pageNumber") Integer pageNumber) {
		
		IndexView returnView = new IndexView();
		
		System.out.println(model.containsAttribute("viewType"));
		
		returnView.setViewType(viewType);
		returnView.setPageNumber(pageNumber);
		
		//mangaHitzRESTful.getLastReleaseManga(viewType,pageNumber,"");
		
		
		return returnView;
	}
	
	@RequestMapping(value = "/{mangaName}", method = RequestMethod.GET)
	public String manga(Locale locale, Model model,@PathVariable("mangaName") String mangaName) {
		
		model.addAttribute("mangaName", mangaName);
		
		return "manga";
	}
	
	@RequestMapping(value = "/{mangaName}/{mangaEp}", method = RequestMethod.GET)
	public String mangaEp(Locale locale, Model model,@PathVariable("mangaName") String mangaName,@PathVariable("mangaEp") Integer mangaEp) {
		
		model.addAttribute("mangaName", mangaName);
		model.addAttribute("mangaEp", mangaEp);
		
		return "manga_ep";
	}
}
