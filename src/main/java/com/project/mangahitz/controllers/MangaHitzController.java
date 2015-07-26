package com.project.mangahitz.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.project.mangahitz.constants.MGHConstants;
import com.project.mangahitz.domains.response.MangaEpListResponse;
import com.project.mangahitz.domains.response.MangaListResponse;
import com.project.mangahitz.views.IndexView;

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
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public IndexView index(Locale locale, Model model,@RequestParam(value="viewType", required = false) String viewType) {

		IndexView returnView = new IndexView();
		
		if(viewType == null || viewType.equals(""))
			returnView.setViewType(MGHConstants.VIEW_TYPE_LIST);
		else
			returnView.setViewType(viewType);
		
		
		if(returnView.getViewType().equals("list")){
			
			ResponseEntity<?>  responseEntity = restTemplate.exchange(MGHConstants.FIND_LASTEST,HttpMethod.GET,this.requestEntity(),MangaListResponse.class,returnView.getViewType(),returnView.getPageNumber(),MGHConstants.MD5_KEY_GENERATOR);
			
			if(responseEntity.getStatusCode() == HttpStatus.OK)
			{
				MangaListResponse mg = (MangaListResponse)responseEntity.getBody();
				
				returnView.setTotalPages(mg.getTotalPages());
				
				returnView.setLastestManga(mg);
				
			}else{
				System.out.println(responseEntity.getBody());
			}
			
		}else{
			
			ResponseEntity<?>  responseEntity = restTemplate.exchange(MGHConstants.FIND_LASTEST,HttpMethod.GET,this.requestEntity(),MangaEpListResponse.class,returnView.getViewType(),returnView.getPageNumber(),MGHConstants.MD5_KEY_GENERATOR);
			
			if(responseEntity.getStatusCode() == HttpStatus.OK)
			{
				MangaEpListResponse mg = (MangaEpListResponse)responseEntity.getBody();
				
				returnView.setTotalPages(mg.getTotalPages());
				
				returnView.setLastestMangaEp(mg);
				
			}else{
				System.out.println(responseEntity.getBody());
			}
			
		}
		
		ResponseEntity<?>  popularMangaEntity = restTemplate.exchange(MGHConstants.FIND_POPULAR,HttpMethod.GET,this.requestEntity(),MangaListResponse.class,MGHConstants.MD5_KEY_GENERATOR);
		
		if(popularMangaEntity.getStatusCode() == HttpStatus.OK){
			returnView.setPopularManga((MangaListResponse)popularMangaEntity.getBody());
		}
		
		ResponseEntity<?>  popularMangaEpEntity = restTemplate.exchange(MGHConstants.FIND_EP_POPULAR,HttpMethod.GET,this.requestEntity(),MangaEpListResponse.class,MGHConstants.MD5_KEY_GENERATOR);
		
		if(popularMangaEpEntity.getStatusCode() == HttpStatus.OK){
			returnView.setPopularMangaEp((MangaEpListResponse)popularMangaEpEntity.getBody());
		}
		
		
		return returnView;
	}
	
	@RequestMapping(value = "/latest-chapters/{pageNumber}", method = RequestMethod.GET)
	public IndexView indexWithPage(Locale locale, Model model,
			@RequestParam(value="viewType", required = false) String viewType,
			@PathVariable("pageNumber") Integer pageNumber) {
		
		IndexView returnView = new IndexView();
		
		System.out.println(model.containsAttribute("viewType"));
		
		returnView.setViewType(viewType);
		returnView.setPageNumber(pageNumber);
		
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
	
	@RequestMapping(value = "/{requestName}/chapters/{pageNumber}", method = RequestMethod.GET)
	public String mangaWithPage(Locale locale, Model model,
			@RequestParam(value="requestName") String requestName,
			@PathVariable("pageNumber") Integer pageNumber) {
		
		return "manga";
	}

	@RequestMapping(value = "/{requestName}/{epNo}", method = RequestMethod.GET)
	public String mangaEp(Locale locale, Model model,
			@PathVariable("requestName") String requestName,
			@PathVariable("epNo") Integer epNo) {
		
		model.addAttribute("requestName", requestName);
		model.addAttribute("epNo", epNo);

		return "manga_ep";
	}
	
	@RequestMapping(value = "/{requestName}/{epNo}/{page}", method = RequestMethod.GET)
	public String mangaEpWithPage(Locale locale, Model model,
			@PathVariable("requestName") String requestName,
			@PathVariable("epNo") Integer epNo,
			@PathVariable("page") Integer page) {
		
		
		model.addAttribute("requestName", requestName);
		model.addAttribute("epNo", epNo);

		return "manga_ep";
	}
	
	@RequestMapping(value = "/search/alphabet/{keyword}", method = RequestMethod.GET)
	public String searchByAlphabet(Locale locale, Model model,@PathVariable("keyword") String keyword) {
		return "manga";
	}
	
	@RequestMapping(value = "/search/name/{keyword}", method = RequestMethod.GET)
	public String searchByKeyword(Locale locale, Model model,@PathVariable("keyword") String keyword) {
		return "manga";
	}
	
	@RequestMapping(value = "/search/category/{keyword}", method = RequestMethod.GET)
	public String searchByCategory(Locale locale, Model model,@PathVariable("keyword") String keyword) {
		return "manga";
	}
}
