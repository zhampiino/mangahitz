package com.project.mangahitz.constants;

public class MGHConstants {


	public final static String MANGAHITZ_RESTFUL_URL = "http://localhost:8092";
	public final static String MD5_KEY_GENERATOR = "9f35fcf4962816794b2405db64f0e4fb";
	
	public final static String VIEW_TYPE_GRID = "grid";
	public final static String VIEW_TYPE_LIST = "list";

	public final static String FIND_LIST_LASTEST = String.format("%s/find/manga/lastest/20/0", MANGAHITZ_RESTFUL_URL);
	public final static String FIND_GRID_LASTEST = String.format("%s/find/manga/ep/lastest/20/0", MANGAHITZ_RESTFUL_URL);
	public final static String FIND_LASTEST_MANGA_EP_BY_MANGA_ID = String.format("%s/find/manga/ep/lastest/{mangaId}", MANGAHITZ_RESTFUL_URL);
	public final static String FIND_MANGA_BY_NAME = String.format("%s/find/manga/{requestName}",MANGAHITZ_RESTFUL_URL);
	public final static String FIND_MANGA_EP_BY_NAME_AND_PAGE = String.format("%s/find/manga/ep/{requestName}/{size}/{page}",MANGAHITZ_RESTFUL_URL);
	public final static String FIND_MANGA_EP_BY_NAME_AND_EP_NO = String.format("%s/find/manga/ep/{requestName}/{epNo}",MANGAHITZ_RESTFUL_URL);
	public final static String FIND_MANGA_EP_PIC_BY_NAME_AND_EP_NO_ALL = String.format("%s/find/manga/ep/pic/{requestName}/{epNo}/all",MANGAHITZ_RESTFUL_URL);
	public final static String FIND_POPULAR_MANGA = String.format("%s/find/manga/popular/20/0", MANGAHITZ_RESTFUL_URL);
	
//	public final static String FIND_LASTEST = String.format("%s/find/manga/lastest/{view}/{page}/{md5key}", MANGAHITZ_RESTFUL_URL);
//	public final static String FIND_POPULAR = String.format("%s/find/manga/popular/{md5key}", MANGAHITZ_RESTFUL_URL);
//	public final static String FIND_EP_POPULAR = String.format("%s/find/manga/ep/popular/{md5key}", MANGAHITZ_RESTFUL_URL);
	
	
}


