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
//@SessionAttributes(value={"viewType","mangaName"})
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
//			/find/manga/lastest/{view}/{page}/{md5key}
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
		
		//MangaResponse mgResponse = mangaHitzRESTful.getMangaByName(mangaName,1);
		
		return "manga";
	}
	
	@RequestMapping(value = "/{mangaName}/{mangaEpNo}", method = RequestMethod.GET)
	public String mangaEp(Locale locale, Model model,
			@PathVariable("mangaName") String mangaName,
			@PathVariable("mangaEpNo") Integer mangaEpNo) {
		
		model.addAttribute("mangaName", mangaName);
		model.addAttribute("mangaEpNo", mangaEpNo);
		
		//MangaResponse mgResponse = mangaHitzRESTful.getMangaEp(mangaName, mangaEpNo);
		
		return "manga_ep";
	}
}
