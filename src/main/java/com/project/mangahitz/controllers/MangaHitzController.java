package com.project.mangahitz.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.project.mangahitz.constants.MGHConstants;
import com.project.mangahitz.domains.Manga;
import com.project.mangahitz.domains.MangaEp;
import com.project.mangahitz.domains.PageableManga;
import com.project.mangahitz.domains.PageableMangaEp;
import com.project.mangahitz.views.MangaHitzView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MangaHitzController {
	
	private static final Logger logger = LoggerFactory.getLogger(MangaHitzController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	private HttpEntity<?> requestEntity(){
			
			HttpHeaders requestHeaders = new HttpHeaders();
			List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
			acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
			acceptableMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
			requestHeaders.setAccept(acceptableMediaTypes);
			requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
			
			return requestEntity;
			
		}

	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws URISyntaxException 
	 * @throws RestClientException 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public MangaHitzView index(Locale locale, Model model,@RequestParam(value="viewType", required = false) String viewType) throws RestClientException, URISyntaxException {

		MangaHitzView mangaHitzView = new MangaHitzView();
		
		if(viewType == null || viewType.equals(""))
			mangaHitzView.setViewType(MGHConstants.VIEW_TYPE_LIST);
		else
			mangaHitzView.setViewType(viewType);
		
		
		if(mangaHitzView.getViewType().equals("list")){
			
			ResponseEntity<PageableManga> responseManga = restTemplate.getForEntity(new URI("http://localhost:8092/find/manga/lastest/20/0"), PageableManga.class);
		
			if(responseManga.getStatusCode() == HttpStatus.OK){
				
				PageableManga pageableMangaDto = responseManga.getBody();
				
				for (Manga mangaDto : pageableMangaDto.getContent()) {
					
					ResponseEntity<MangaEp[]> responseMangaEp =  restTemplate.getForEntity("http://localhost:8092/find/manga/ep/lastest/{mangaId}", MangaEp[].class, mangaDto.getMangaId());
					
					MangaEp[] mangaEpDtos = responseMangaEp.getBody();
					
					mangaDto.setMangaEpsList(mangaEpDtos);
					
				}
				
				mangaHitzView.setPageableLastestManga(pageableMangaDto);
			}
			
		}else{
			
			ResponseEntity<PageableMangaEp> pageableLastestMangaEp = restTemplate.getForEntity(new URI("http://localhost:8092/find/manga/ep/lastest/20/0"), PageableMangaEp.class);
			
			if(pageableLastestMangaEp.getStatusCode() == HttpStatus.OK){
				mangaHitzView.setPageableLastestMangaEp(pageableLastestMangaEp.getBody());
			}
			
		}
		
		return mangaHitzView;
	}
	
	@RequestMapping(value = "/latest-chapters/{pageNumber}", method = RequestMethod.GET)
	public MangaHitzView indexWithPage(Locale locale, Model model,
			@RequestParam(value="viewType", required = false) String viewType,
			@PathVariable("pageNumber") Integer pageNumber) {
		
		MangaHitzView returnView = new MangaHitzView();
		
		System.out.println(model.containsAttribute("viewType"));
		
		returnView.setViewType(viewType);
		
		return returnView;
	}
	
	@RequestMapping(value = "/viewAll", method = RequestMethod.GET)
	public String viewAll(Locale locale, Model model,
			@RequestParam(value="viewType", required = false) String viewType) {
		
		return "manga";
	}
	
	
	@RequestMapping(value = "/{requestName}", method = RequestMethod.GET)
	public String manga(Locale locale, Model model,@PathVariable("requestName") String requestName) {
		
		model.addAttribute("request manga name", requestName);
		
		return "manga";
	}
	
//	@RequestMapping(value = "/{requestName}/chapters/{pageNumber}", method = RequestMethod.GET)
//	public String mangaWithPage(Locale locale, Model model,
//			@RequestParam(value="requestName") String requestName,
//			@PathVariable("pageNumber") Integer pageNumber) {
//		
//		return "manga";
//	}
//
//	@RequestMapping(value = "/{requestName}/{epNo}", method = RequestMethod.GET)
//	public String mangaEp(Locale locale, Model model,
//			@PathVariable("requestName") String requestName,
//			@PathVariable("epNo") Integer epNo) {
//		
//		model.addAttribute("requestName", requestName);
//		model.addAttribute("epNo", epNo);
//
//		return "manga_ep";
//	}
	
//	@RequestMapping(value = "/{requestName}/{epNo}/{page}", method = RequestMethod.GET)
//	public String mangaEpWithPage(Locale locale, Model model,
//			@PathVariable("requestName") String requestName,
//			@PathVariable("epNo") Integer epNo,
//			@PathVariable("page") Integer page) {
//		
//		
//		model.addAttribute("requestName", requestName);
//		model.addAttribute("epNo", epNo);
//
//		return "manga_ep";
//	}
	
//	@RequestMapping(value = "/search/alphabet/{keyword}", method = RequestMethod.GET)
//	public String searchByAlphabet(Locale locale, Model model,@PathVariable("keyword") String keyword) {
//		return "manga";
//	}
//	
//	@RequestMapping(value = "/search/name/{keyword}", method = RequestMethod.GET)
//	public String searchByKeyword(Locale locale, Model model,@PathVariable("keyword") String keyword) {
//		return "manga";
//	}
//	
//	@RequestMapping(value = "/search/category/{keyword}", method = RequestMethod.GET)
//	public String searchByCategory(Locale locale, Model model,@PathVariable("keyword") String keyword) {
//		return "manga";
//	}
	
	@ModelAttribute("popularManga")
	protected PageableManga popularManga() throws RestClientException, URISyntaxException{
		
		ResponseEntity<PageableManga> responseManga = restTemplate.getForEntity(new URI("http://localhost:8092/find/manga/popular/20/0"), PageableManga.class);
		
		if(responseManga.getStatusCode() == HttpStatus.OK){
			return responseManga.getBody();
		}
		
		return null;
	}
	
	@ModelAttribute("popularMangaEp")
	protected PageableMangaEp popularMangaEp(){
		return null;
	}
}
