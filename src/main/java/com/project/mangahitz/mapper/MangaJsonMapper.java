package com.project.mangahitz.mapper;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.project.mangahitz.domains.Manga;

public class MangaJsonMapper {

	
	public static Manga toManga(JSONObject jsonObj){
		
		Manga result = new Manga();
		
		if(!jsonObj.isNull("manga_id"))
			result.setMangaId(jsonObj.getInt("manga_id"));
		
		if(!jsonObj.isNull("name"))
			result.setName(jsonObj.getString("name"));
		
		if(!jsonObj.isNull("description"))
			result.setDescription(jsonObj.getString("description"));
		
		if(!jsonObj.isNull("alternate_name"))
			result.setAlternateName(jsonObj.getString("alternate_name"));
		
		if(!jsonObj.isNull("artist"))
			result.setArtist(jsonObj.getString("artist"));
		
		if(!jsonObj.isNull("author"))
			result.setAuthor(jsonObj.getString("author"));
		
		if(!jsonObj.isNull("status"))
			result.setStatus(jsonObj.getString("status"));
		
		if(!jsonObj.isNull("year_release"))
			result.setYearRelease(jsonObj.getString("year_release"));
		
		if(!jsonObj.isNull("pic_url"))
			result.setPicUrl(jsonObj.getString("pic_url"));
		
		if(!jsonObj.isNull("rate"))
			result.setRate(jsonObj.getInt("rate"));
		
		if(!jsonObj.isNull("publishing"))
			result.setPublishing(jsonObj.getString("publishing"));
		
		if(!jsonObj.isNull("manga_ep"))
		{
			
		}
		
		if(!jsonObj.isNull("manga_eps")){
		
			JSONArray jsonArr = jsonObj.getJSONArray("manga_eps");
			
			result.setMangaEps(MangaEpJsonMapper.toMangaEps(jsonArr));
			
		}
		
		return result;
	}
	
	public static List<Manga> toMangas(JSONArray jsonArr){
		
		List<Manga> result = new ArrayList<Manga>();
		
		
		for (int i = 0; i < jsonArr.length(); i++) {
			
			JSONObject jsonObj = (JSONObject) jsonArr.get(i);
			
			result.add(toManga(jsonObj));
			
		}
		
		return result;
	}
	
}
