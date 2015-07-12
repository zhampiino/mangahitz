<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:import url="_header.jsp"></c:import>

  


    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
        <div class="container">
            <!--h1>READ MANGA ONLINE</h1-->
            <p>Manga is the Japanese comics with a unique story line and style. In Japan people of all ages read manga, manga does not target younger audiences like american comics. The genre includes a broad range of subjects. Here you will find 1000s of free english translated manga scans to read online. Discover the world of otaku!</p>
            <p><a class="btn btn-success" href="#" role="button">Learn more »</a></p>
        </div>
    </div>

    <!-- Page Content -->
    <div class="container">

        <div class="row">
        
            <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 main-content">
            
            <c:if test="${viewType eq 'list' }">       
            <c:if test="${not empty mangas}">
            
                <section class="section-new-releases">               
                	<div class="wrapper">           		
        				<h1>New Releases</h1>        				
    					<ul class="list-group">
    					
                      		<c:forEach var="manga" items="${mangas }">
                      		
                       		<li class="list-group-item">
                                <div class="img-thumb-wrap">
                                    <img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/koitouso_1_36x0.jpg" /> 
                                </div>
                                <div class="manga-data">
                                    <div class="manga-name"><a href="/${manga.name }"><b>${manga.name }</b></a></div>
                                    
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
	                                    <img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/naruto_200x0.jpg" /> 
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
	                                    <img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/onepiece_62x0.png" /> 
	                                </div>                       		
	                                <div class="manga-name"><a href="/${manga.name }"><b>${manga.name }</b></a></div>
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
