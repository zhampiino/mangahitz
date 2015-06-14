package com.project.mangahitz.service.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Component;

import com.project.mangahitz.constants.MangaHitzConstants;
import com.project.mangahitz.domains.MangaEp;
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
		connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded"); 
		connection.setRequestProperty("Accept", "application/json");
		
		//connection.setRequestProperty("Expect","100-continue"); 
        //connection.setRequestProperty("Connection","Keep-Alive"); 
        connection.setDoOutput(true); 
        connection.setDoInput(true); 
		
		return connection;
	}
	
	@Override
	public List<MangaEp> getLastReleaseManga() {
		
		try
		{
		
			HttpURLConnection connection = this.createConnection(String.format("%s%s",MangaHitzConstants.MANGAHITZ_RESTFUL_URL,MangaHitzConstants.GET_LATEST_MANGA), false, "POST", this.CONTENT_LENGHT);
			//connection.setDoInput(false);
			
	        DataOutputStream output = new DataOutputStream(connection.getOutputStream());  
	        output.writeBytes("".toString());
	        output.flush();
	        output.close();
	        /* HTTPS Response */
	        StringBuilder resBody = new StringBuilder(); 
	        DataInputStream input = new DataInputStream( connection.getInputStream() ); 
	        for( int c = input.read(); c != -1; c = input.read() ){
	        	resBody.append( (char)c );
	        	//System.out.print( (char)c );
	        }
	        
	        input.close(); 
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			
		}
//        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("lpn.mfec.co.th", 8080));
//        URL myurl = new URL(httpsURLUpload);
//        HttpsURLConnection con = (HttpsURLConnection)myurl.openConnection(proxy);
//        
//        con.setRequestMethod("POST");
//        con.setRequestProperty("Host","webagentdev.arx.com"); 
//        con.setRequestProperty("Content-length", String.valueOf(xmlReq.length())); 
//        con.setRequestProperty("Content-Type","application/x-www-form-urlencoded"); 
//        con.setRequestProperty("Expect","100-continue"); 
//        con.setRequestProperty("Connection","Keep-Alive"); 
//        con.setDoOutput(true); 
//        con.setDoInput(true); 
//        // Add a parameter [inputXML]
//        StringBuilder reqBody = new StringBuilder();
//        reqBody.append(URLEncoder.encode("inputXML", "UTF-8"));
//        reqBody.append("=");
//        reqBody.append(URLEncoder.encode(xmlReq, "UTF-8"));
//
//        DataOutputStream output = new DataOutputStream(con.getOutputStream());  
//        output.writeBytes(reqBody.toString());
//        output.flush();
//        output.close();
//        /* HTTPS Response */
//        StringBuilder resBody = new StringBuilder(); 
//        DataInputStream input = new DataInputStream( con.getInputStream() ); 
//        for( int c = input.read(); c != -1; c = input.read() ){
//        	resBody.append( (char)c );
//        	//System.out.print( (char)c );
//        }
        	 
        //input.close(); 
		
		//JSONObject
		
		return null;
	}

}
