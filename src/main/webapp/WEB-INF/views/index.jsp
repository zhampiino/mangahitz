<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:import url="_header.jsp"></c:import>

    <!-- Jumbotron -->
    <div class="jumbotron index-jumbotron">
        <div class="container">
        	<div class="row">
        		<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
        			<div class="thumbnail">
        				<div class="img-wrap">
        					<a href="naruto"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/naruto_200x0.jpg" /></a>
        				</div>
        			</div>
        		</div>
        		<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
        			<div class="thumbnail">
        				<div class="img-wrap">
        					<a href="onepiece"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/onepiece_200x0.png" /></a>
        				</div>
        			</div>
        		</div>
        		<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
        			<div class="thumbnail">
        				<div class="img-wrap">
        					<a href="bleach"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/bleach_3_200x0.jpg" /></a>
        				</div>
        			</div>
        		</div>
        		<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
        			<div class="thumbnail">
        				<div class="img-wrap">
        					<a href="toriko"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/toriko_7_200x0.jpg" /></a>
        				</div>
        			</div>
        		</div>
        		<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
        			<div class="thumbnail">
        				<div class="img-wrap">
        					<a href="fairytail"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/fairytail_200x0.jpg" /></a>
        				</div>
        			</div>
        		</div>
        		<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
        			<div class="thumbnail">
        				<div class="img-wrap">
        					<a href="shokugekinosoma"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/shokugekinosoma_3_200x0.jpg" /></a>
        				</div>
        			</div>
        		</div>
        	</div>           
        </div>
    </div>
    
    <!--  Introduction -->
    <div class="intro">
    	<div class="container">
    		<h3>READ MANGA ONLINE</h3>
    		<p>Manga is the Japanese comics with a unique story line and style. In Japan people of all ages read manga, manga does not target younger audiences like american comics. Here you will find 1000s of free english translated manga scans to read online. Discover the world of otaku! Naruto 701, Naruto Gaiden: The Seventh Hokage 11, Bleach 635, One Piece 794, Fairy Tail 444, will coming next!</p>
    	</div>
    </div>

    <!-- Main Content -->
    <div class="container">

        <div class="row">
        
            <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 content">
            
            <c:if test="${viewType eq 'list' }">       
            <c:if test="${not empty lastestManga}">
            
                <section class="section-new-releases list-view">               
                	<div class="wrapper">
                		<div class="section-header">          		
	        				<h1 class="pull-left">New Releases</h1>	        				
	        				<div class="btn-group btn-layout-view pull-right">
	                        	<span class="btn btn-default btn-xs list active"><span class="glyphicon glyphicon-th-list"></span><span class="hidden-xs">&nbsp;List</span></span>
	                        	<a href="?viewType=grid" class="btn btn-default btn-xs grid"><span class="glyphicon glyphicon-th"></span><span class="hidden-xs">&nbsp;Grid</span></a>
	                        </div>
                        </div> 
                                        				
    					<ul class="list-group">
    					
                      		<c:forEach var="manga" items="${lastestManga.mangaList }">
                      		
                       		<li class="list-group-item">
                                <div class="img-thumb-wrap">
                                    <a href="/${manga.name }"><img src="${manga.picUrl }" /></a>
                                </div>
                                <div class="manga-data">
                                    <div class="manga-name"><a href="/${manga.name }">${manga.name }</a></div>
                                    
                                    <c:if test="${not empty manga.mangaEps }">
									<c:forEach var="mangaEp" items="${manga.mangaEps }">
	                                    
	                                    <div class="manga-chapters"> 
	                                        <div class="title pull-left"><a href="/${manga.name }/${mangaEp.epNo}">Chapter ${mangaEp.epNo} : ${mangaEp.epName }</a></div>
	                                        <div class="opt pull-right">
	                                            <span class="date hidden-xs">${mangaEp.releaseDate }</span>
	                                            <span class="ratings hidden-sm hidden-xs">
	                                                <span class="glyphicon glyphicon-star"></span>
	                                                <span class="glyphicon glyphicon-star"></span>
	                                                <span class="glyphicon glyphicon-star-empty"></span>
	                                                <span class="glyphicon glyphicon-star-empty"></span>
	                                                <span class="glyphicon glyphicon-star-empty"></span>
	                                            </span>   
	                                        </div>
	                                    </div>
	                                    
	                                 </c:forEach>
	                                 </c:if>
                                    
                                </div>
                        	</li>
                        	
                        	</c:forEach>                          
                           
    					</ul>            		
                	</div>
                </section>
                
            </c:if>
            </c:if>
            
            <c:if test="${viewType eq 'grid' }">       
            <c:if test="${not empty lastestMangaEp}">
            	<section class="section-new-releases grid-view">
            		<div class="wrapper">           		
                		<div class="section-header">          		
	        				<h1 class="pull-left">New Releases</h1>	        				
	        				<div class="btn-group btn-layout-view pull-right">
	                        	<a href="?viewType=list" class="btn btn-default btn-xs list"><span class="glyphicon glyphicon-th-list"></span><span class="hidden-xs">&nbsp;List</span></a>
	                        	<span class="btn btn-default btn-xs grid active"><span class="glyphicon glyphicon-th"></span><span class="hidden-xs">&nbsp;Grid</span></span>
	                        </div>
                        </div> 
       				    <c:forEach var="mangaEp" items="${lastestMangaEp.mangaEpList }">
       				    	<div class="col-xs-6 col-sm-4 col-lg-3 col-md-3">
	        					<div class="grid-item">
		        					<div class="img-wrap">
		                            	<a href="/${mangaEp.manga.name }"><img src="${mangaEp.manga.picUrl }" /></a> 
		                            </div>                       		
		                            <div class="manga-name"><a href="/${manga.name }"><b>${manga.name }</b></a></div>
		                            <div class="manga-chapters"><a href="/${manga.name }/${mangaEp.epNo}">Chapter ${mangaEp.epNo} : ${mangaEp.epName }</a></div>
                                </div>
	        				</div>
        				</c:forEach>	
        			</div>           	
            	</section>
            </c:if>
            </c:if>

			<a href="#" class="btn btn-more col-xs-12 col-sm-12 col-md-12 col-lg-12">View All</a>

            </div>

            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 widget">
                <div class="wrapper">
                    <aside class="popular-manga">
                        <h3>Popular Manga</h3>
                        <ul class="list-group">
                        
                        	<c:forEach var="manga" items="${mangas }">
                        	
	                        	<li class="list-group-item">
	                        		<div class="img-thumb-wrap">
	                                    <a href="/${manga.name }"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/naruto_200x0.jpg" /></a> 
	                                </div>
	                                <div class="manga-name"><a href="/${manga.name }"><b>${manga.name }</b></a></div>   	                                
	                        	</li>
	                        	
                        	</c:forEach>
                        	
                        </ul>
                    </aside>                   
                </div>
                
                <div class="wrapper">
                    <aside class="popular-manga-chapter">
                        <h3>Popular Chapter</h3>
                        <ul class="list-group">
                        
                        	<c:forEach var="manga" items="${mangas }">
                        	<c:if test="${not empty manga.mangaEps }">
							<c:forEach var="mangaEp" items="${manga.mangaEps }">
							
	                        	<li class="list-group-item"> 
	                        		<div class="img-thumb-wrap">
	                                    <a href="/${manga.name }"><img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/onepiece_62x0.png" /></a> 
	                                </div>                       		
	                                <div class="manga-name"><a href="/${manga.name }">${manga.name }</a></div>
                                    <div class="manga-chapters"><a href="/${manga.name }/${mangaEp.epNo}">Chapter ${mangaEp.epNo} : ${mangaEp.epName }</a></div>
	                        	</li>
	                        	 
	                       	</c:forEach>
		                    </c:if> 
                        	</c:forEach>
                        	
                        </ul>
                    </aside>
                </div>
                
                <div class="wrapper">
                    <aside class="Social">
                        <h3>Social</h3>
                        
                    </aside>
                </div>
                
            </div>



        </div>

    </div>
    <!-- /.container -->

<c:import url="_footer.jsp"></c:import>
