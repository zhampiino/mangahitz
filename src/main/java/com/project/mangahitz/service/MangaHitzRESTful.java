package com.project.mangahitz.service;

import java.util.List;

import com.project.mangahitz.domains.Manga;
import com.project.mangahitz.domains.MangaEp;
import com.project.mangahitz.domains.response.MangaResponse;

public interface MangaHitzRESTful {

	MangaResponse getLastReleaseManga(String viewType,Integer pageNumber,String releaseType);
}
