package com.project.mangahitz.service.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.project.mangahitz.constants.MGHConstants;
import com.project.mangahitz.domains.response.MangaResponse;
import com.project.mangahitz.mapper.MangaEpJsonMapper;
import com.project.mangahitz.mapper.MangaJsonMapper;
import com.project.mangahitz.service.MangaHitzRESTful;

@Component("mangaHitzRESTful")
public class MangaHitzRESTfulImpl implements MangaHitzRESTful {

	private final Integer CONTENT_LENGHT = 500;
	
	private HttpURLConnection createConnection(String urlName, Boolean enableProxy, String requestMethod,Integer contentLenght) throws IOException{
		
		HttpURLConnection connection;
		
		URL requestUrl = new URL(urlName);
		
		if(enableProxy){
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("lpn.mfec.co.th", 8080));
			connection = (HttpURLConnection)requestUrl.openConnection(proxy);
		}else{
			connection = (HttpURLConnection)requestUrl.openConnection();
		}
		
		connection.setRequestMethod(requestMethod);
		//connection.setRequestProperty("Host","webagentdev.arx.com"); 
		connection.setRequestProperty("Content-length", String.valueOf(contentLenght)); 
		connection.setRequestProperty("Content-Type","application/json"); 
		connection.setRequestProperty("Accept", "application/json");
//		con.setRequestProperty("Content-Type","application/x-www-form-urlencoded"); 
		//connection.setRequestProperty("Expect","100-continue"); 
        //connection.setRequestProperty("Connection","Keep-Alive"); 
        connection.setDoOutput(true); 
        connection.setDoInput(true); 
		
		return connection;
	}
	
	private String readResponse(HttpURLConnection connection) throws IOException{
	
		System.out.println("RESPONSE CODE ==> " + connection.getResponseCode());
		System.out.println("RESPONSE MSG ==> "
				+ connection.getResponseMessage());

		/* HTTPS Response */
		StringBuilder responseBody = new StringBuilder();
		DataInputStream input = new DataInputStream(connection.getInputStream());
		for (int c = input.read(); c != -1; c = input.read()) {
			responseBody.append((char) c);
		}

		input.close();

		return responseBody.toString();

	}
	
	private void writeRequest(HttpURLConnection connection ,String requestBody) throws IOException{
		
		DataOutputStream output = new DataOutputStream(connection.getOutputStream());
		output.writeBytes(requestBody);
		output.flush();
		output.close();
		
	}
	
	@Override
	public MangaResponse getLastReleaseManga(String viewType,Integer pageNumber,String releaseType) {
		
		MangaResponse mgResponse = new MangaResponse();
		
		try
		{
		
			JSONObject jsonRequest = new JSONObject();
			jsonRequest.put("view_type", viewType);
			jsonRequest.put("page_number", pageNumber);
			jsonRequest.put("release_type", releaseType);
			
			
			HttpURLConnection connection = this.createConnection(String.format("%s%s",MGHConstants.MANGAHITZ_RESTFUL_URL,MGHConstants.GET_LATEST_MANGA), false, "POST",jsonRequest.length());
			
//			{"view_type":"list","page_number":0,"release_type":"old"}
			this.writeRequest(connection, jsonRequest.toString());
	        
	       String responseBody = this.readResponse(connection);
	       
	       JSONObject jsonResponse = new JSONObject(responseBody);
	       
	       mgResponse.setStatus(jsonResponse.getBoolean("status"));
	       
	       if(!jsonResponse.isNull("msg")){
	    	   mgResponse.setMsg(jsonResponse.getString("msg"));
	       }
	       
	       mgResponse.setTotalPages(jsonResponse.getInt("total_pages"));
	       
	       if(jsonResponse.getBoolean("status")){
	    	   
	    	   if(!jsonResponse.isNull("manga")){
	    		   JSONObject jsonObj = jsonResponse.getJSONObject("manga");
	    		   
	    		   mgResponse.setManga(MangaJsonMapper.toManga(jsonObj));
	    		   
	    	   }
	    	   
	    	   if(!jsonResponse.isNull("mangas")){
	    		   
	    		   JSONArray jsonArr = jsonResponse.getJSONArray("mangas");
	    		   if(jsonArr != null)
	    			   mgResponse.setMangas(MangaJsonMapper.toMangas(jsonArr));
	    	   }
	    	   
	    	   if(!jsonResponse.isNull("manga_ep")){
	    		   JSONObject jsonObj = jsonResponse.getJSONObject("manga_ep");
	    		   mgResponse.setMangaEp(MangaEpJsonMapper.toMangaEp(jsonObj));
	    	   }
	    	   
	    	   if(!jsonResponse.isNull("manga_eps")){
	    		   
	    		   JSONArray jsonArr = jsonResponse.getJSONArray("manga_eps");
	    		   mgResponse.setMangaEps(MangaEpJsonMapper.toMangaEps(jsonArr));
	    	   }
	    	   
	       }
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			
		}
		
		return mgResponse;
	}

}
