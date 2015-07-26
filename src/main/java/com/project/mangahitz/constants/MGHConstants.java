package com.project.mangahitz.constants;

public class MGHConstants {


	public final static String MANGAHITZ_RESTFUL_URL = "http://localhost:8092";
	public final static String MD5_KEY_GENERATOR = "9f35fcf4962816794b2405db64f0e4fb";
	
	public final static String VIEW_TYPE_GRID = "grid";
	public final static String VIEW_TYPE_LIST = "list";

	public final static String FIND_LASTEST = String.format("%s/find/manga/lastest/{view}/{page}/{md5key}", MANGAHITZ_RESTFUL_URL);
	public final static String FIND_POPULAR = String.format("%s/find/manga/popular/{md5key}", MANGAHITZ_RESTFUL_URL);
	public final static String FIND_EP_POPULAR = String.format("%s/find/manga/ep/popular/{md5key}", MANGAHITZ_RESTFUL_URL);
	
	
}


