package com.project.mangahitz.mapper;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.project.mangahitz.domains.MangaEpPic;

public class MangaEpPicJsonMapper {

	
	public static MangaEpPic toMangaEpPic(JSONObject jsonObj){
		
		MangaEpPic result = new MangaEpPic();
		
		if(!jsonObj.isNull("ep_pic_id"))
			result.setEpPicId(jsonObj.getInt("ep_pic_id"));
		
		if(!jsonObj.isNull("manga_ep_id"))
			result.setMangaEpId(jsonObj.getInt("manga_ep_id"));
		
		if(!jsonObj.isNull("pic_url"))
			result.setPicUrl(jsonObj.getString("pic_url"));
		
		return result;
	}
	
	public static List<MangaEpPic> toMangaEpPic(JSONArray jsonArr){
		
		List<MangaEpPic> result = new ArrayList<MangaEpPic>();
		
		
		for (int i = 0; i < jsonArr.length(); i++) {
			
			JSONObject jsonObj = (JSONObject) jsonArr.get(i);
			
			result.add(toMangaEpPic(jsonObj));
			
		}
		
		return result;
	}
	
}
