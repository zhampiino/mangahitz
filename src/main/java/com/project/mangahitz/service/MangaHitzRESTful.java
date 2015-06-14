package com.project.mangahitz.service;

import java.util.List;

import com.project.mangahitz.domains.MangaEp;

public interface MangaHitzRESTful {

	List<MangaEp> getLastReleaseManga();
}
