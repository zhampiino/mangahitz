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

import com.project.mangahitz.service.MangaHitzRESTful;

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
	public String index(Locale locale, Model model) {

		model.addAttribute("viewType", "list");
		return "index";
	}
	
	@RequestMapping(value = "/view/{viewType}", method = RequestMethod.GET)
	public String index2(Locale locale, Model model,@PathVariable("viewType") String viewType) {
		
		System.out.println(model.containsAttribute("viewType"));
		
		model.addAttribute("viewType", viewType);
		
		mangaHitzRESTful.getLastReleaseManga();
		
		
		return "index";
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
