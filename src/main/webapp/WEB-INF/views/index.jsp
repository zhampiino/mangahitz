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
                                    <div class="manga-name"><b><a href="/${manga.name }">${manga.name }</a></b></div>
                                    
                                    <c:if test="${not empty manga.mangaEps }">
									<c:forEach var="mangaEp" items="${manga.mangaEps }">
	                                    
	                                    <div class="manga-chapters"> 
	                                        <div class="title pull-left"><a href="/${manga.name }/${mangaEp.epNo}">${mangaEp.epName }</a></div>
	                                        <div class="opt pull-right hidden-xs">
	                                            <span class="date">${mangaEp.releaseDate }</span>
	                                            <span class="ratings">
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

                <section class="section-recent-releases">
                	<div class="wrapper"> 
                		<h1>Recent Releases</h1>

                                                <ul class="list-group">
                            <!-- span class="">15 reviews</span --> 
                            <li class="list-group-item">
                                <div class="img-thumb-wrap">
                                    <img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/koitouso_1_36x0.jpg" /> 
                                </div>
                                <div class="manga-data">

                                    <div class="manga-name"><b><a href="/naruto">Naruto</a></b></div>
                                    <div class="manga-chapters"> 
                                        <div class="title pull-left"><a href="/naruto">Ch. 700.5 - Naruto Book of Wind Naruto Book of Wind Naruto Book of Wind Naruto Book of Wind Naruto Book of Wind</a></div>
                                        <div class="opt pull-right hidden-xs">
                                            <span class="date">25-07-2015</span>
                                            <span class="ratings">
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                            </span>   
                                        </div>
                                    </div>
                                    <div class="manga-chapters">                                                       
                                        <div class="title pull-left"><a href="/naruto">Ch. 700.5 - Naruto Book of Wind </a></div>
                                        <div class="opt pull-right hidden-xs">
                                            <span class="date">25-07-2015</span>
                                            <span class="ratings">
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                            </span>   
                                        </div>
                                    </div>
                                    <div class="manga-chapters">                                                       
                                        <div class="title pull-left"><a href="/naruto">Ch. 700.5 - Naruto Book of Wind</a></div>
                                        <div class="opt pull-right hidden-xs">
                                            <span class="date">25-07-2015</span>
                                            <span class="ratings">
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                            </span>   
                                        </div>
                                    </div>

                                </div>

                            </li>
                            <li class="list-group-item">
                                <div class="img-thumb-wrap">
                                    <img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/naruto_36x0.jpg" /> 
                                </div>
                                <div class="manga-data">

                                    <div class="manga-name"><b><a href="/naruto">One Piece</a></b></div>
                                    <div class="manga-chapters"> 
                                        <div class="title pull-left"><a href="/naruto">Ch. 791 - เศษหิน</a></div>
                                        <div class="opt pull-right hidden-xs">
                                            <span class="date">25-07-2015</span>
                                            <span class="ratings">
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                            </span>   
                                        </div>
                                    </div>

                                </div>

                            </li>
                            <li class="list-group-item">
                                <div class="img-thumb-wrap">
                                    <img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/naruto_36x0.jpg" /> 
                                </div>
                                <div class="manga-data">

                                    <div class="manga-name"><b><a href="/naruto">One Piece</a></b></div>
                                    <div class="manga-chapters"> 
                                        <div class="title pull-left"><a href="/naruto">Ch. 791 - เศษหิน</a></div>
                                        <div class="opt pull-right hidden-xs">
                                            <span class="date">25-07-2015</span>
                                            <span class="ratings">
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                            </span>   
                                        </div>
                                    </div>

                                </div>

                            </li>
                            <li class="list-group-item">
                                <div class="img-thumb-wrap">
                                    <img src="http://www.niceoppai.net/wp-content/manga/cover/tbn/naruto_36x0.jpg" /> 
                                </div>
                                <div class="manga-data">

                                    <div class="manga-name"><b><a href="/naruto">One Piece</a></b></div>
                                    <div class="manga-chapters"> 
                                        <div class="title pull-left"><a href="/naruto">Ch. 791 - เศษหิน</a></div>
                                        <div class="opt pull-right hidden-xs">
                                            <span class="date">25-07-2015</span>
                                            <span class="ratings">
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star"></span>
                                                <span class="glyphicon glyphicon-star-empty"></span>
                                            </span>   
                                        </div>
                                    </div>
                                    
                                </div>

                            </li>

                        </ul>

                	</div>
                </section>

            	<a href="#" class="btn btn-more col-xs-12 col-sm-12 col-md-12 col-lg-12">Older Releases</a>

            </div>

            <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 widget">
                <div class="wrapper">
                    <aside>
                        <h3>Manga Hitz : Top 5</h3>
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a>Naruto</a>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <a>Naruto</a>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <a>Naruto</a>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <a>Naruto</a>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <a>Naruto</a>
                                <p>Chapter 999</p>
                            </li>
                        </ul>
                    </aside>

                    <aside>
                        <h3>Manga Hitz : 6 - 10</h3>
                        <ul class="list-group">
                            <li class="list-group-item">
                                <p>Naruto</p>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <p>Naruto</p>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <p>Naruto</p>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <p>Naruto</p>
                                <p>Chapter 999</p>
                            </li>
                            <li class="list-group-item">
                                <p>Naruto</p>
                                <p>Chapter 999</p>
                            </li>
                        </ul>
                    </aside>
                </div>
                <div class="wrapper">
                    <aside>
                        <h3>Social</h3>
                    </aside>
                </div>
            </div>



        </div>

    </div>
    <!-- /.container -->

<c:import url="_footer.jsp"></c:import>
