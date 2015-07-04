package com.project.mangahitz.service;

import com.project.mangahitz.domains.response.MangaResponse;

public interface MangaHitzRESTful {

	MangaResponse getLastReleaseManga(String viewType,Integer pageNumber,String releaseType);
	
	MangaResponse getPopularManga();
	
	MangaResponse getMangaByName(String name,Integer pageNumber);
	
	MangaResponse getMangaEp(String name,Integer epNo);
}
