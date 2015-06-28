package com.project.mangahitz.mapper;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.project.mangahitz.domains.MangaEp;

public class MangaEpJsonMapper {

	public static MangaEp toMangaEp(JSONObject jsonObj){
		
		MangaEp result = new MangaEp();
		
		if(!jsonObj.isNull("manga_ep_id"))
			result.setMangaEpId(jsonObj.getInt("manga_ep_id"));
		
		if(!jsonObj.isNull("manga_id"))
			result.setMangaId(jsonObj.getInt("manga_id"));
		
		if(!jsonObj.isNull("ep_no"))
			result.setEpNo(jsonObj.getInt("ep_no"));
		
		if(!jsonObj.isNull("ep_name"))
			result.setEpName(jsonObj.getString("ep_name"));
		
		if(!jsonObj.isNull("release_date"))
			result.setReleaseDate(jsonObj.getString("release_date"));
		
		if(!jsonObj.isNull("rate"))
			result.setRate(jsonObj.getInt("rate"));
		
		if(!jsonObj.isNull("manga_ep_pics")){
			
			JSONArray jsonArr = jsonObj.getJSONArray("manga_ep_pics");
			
			result.setMangaEpPics(MangaEpPicJsonMapper.toMangaEpPic(jsonArr));
			
		}
		
		if(!jsonObj.isNull("manga")){
			JSONObject mg =jsonObj.getJSONObject("manga");
			result.setManga(MangaJsonMapper.toManga(mg));
		}
		
		return result;
	}
	
	public static List<MangaEp> toMangaEps(JSONArray jsonArr){
		
		List<MangaEp> result = new ArrayList<MangaEp>();
		
		
		for (int i = 0; i < jsonArr.length(); i++) {
			
			JSONObject jsonObj = (JSONObject) jsonArr.get(i);
			
			result.add(toMangaEp(jsonObj));
			
		}
		
		return result;
		
	}
	
}
