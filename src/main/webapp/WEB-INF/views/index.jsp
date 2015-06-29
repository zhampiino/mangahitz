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
		

            <div class="col-md-9">

                <div class="latest-manga">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <b>Latest Manga Updates</b>
                            <div class="pull-right">
                                <strong></strong>
                                <div class="btn-group btn-layout-view">
	                                <c:if test="${viewType eq 'list' }">
	                                	<a href="/view/list" class="btn btn-default btn-xs list active"><span class="glyphicon glyphicon-th-list"></span><span class="hidden-xs">&nbsp;List</span></a>
		                                <a href="/view/grid" class="btn btn-default btn-xs grid"><span class="glyphicon glyphicon-th"></span><span class="hidden-xs">&nbsp;Grid</span></a>
	                                </c:if>
	                                <c:if test="${viewType eq 'grid' }">
	                                	<a href="/view/list" class="btn btn-default btn-xs list"><span class="glyphicon glyphicon-th-list"></span><span class="hidden-xs">&nbsp;List</span></a>
		                                <a href="/view/grid" class="btn btn-default btn-xs grid active"><span class="glyphicon glyphicon-th"></span><span class="hidden-xs">&nbsp;Grid</span></a>
	                                </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                  
                  	<!------------------------->
                  	<!-- View type List View -->
                  	<!------------------------->
                	<c:if test="${viewType eq 'list' }">       
                	
                		<c:if test="${not empty mangas}">
                		
	                		<div class="row layout-view list-view">	                                     
		                    		<!-- Items -->                                    
		                    		<div class="item col-xs-12 col-sm-12 col-lg-12 col-md-12">	     							
											<ul class="list-group">
												<c:forEach var="manga" items="${mangas }">
													<li class="list-group-item">
	                                                	<div class="manga-name"><b><a href="#">${manga.name }</a></b></div>
														<c:if test="${not empty manga.mangaEps }">
															<c:forEach var="mangaEp" items="${manga.mangaEps }">
																<div class="manga-chapters">                                                       
				                                                    <div class="title pull-left"><a href="/naruto">${mangaEp.epName }</a></div>
				                                                    <div class="group pull-right">
				                                                        <span class="date">
				                                                            ${mangaEp.releaseDate }
				                                                        </span>
				                                                        <span class="ratings">
				                                                            <span class="glyphicon glyphicon-star"></span>
				                                                            <span class="glyphicon glyphicon-star"></span>
				                                                            <span class="glyphicon glyphicon-star"></span>
				                                                            <span class="glyphicon glyphicon-star"></span>
				                                                            <span class="glyphicon glyphicon-star"></span>
				                                                        </span>   
				                                                    </div>
				                                                </div>
															</c:forEach>
														</c:if>
													</li>
												</c:forEach>
											</ul>            
		                    		</div>		                     		  	                     	                     
			                		                     	                	 	 
	                    	</div><!-- End row -->
                		
                		</c:if>
                	        	
                		<%-- <div class="row layout-view list-view">	                    
		                    		      
		                    			      
		                    		                    
	                    		<!-- Items -->                                    
	                    		<div class="item col-xs-12 col-sm-12 col-lg-12 col-md-12">	     
                              											
										<ul class="list-group">
											<c:forEach var="i" begin="1" end="5"> 
	                                   		<li class="list-group-item">
	                                   		
                                                <div class="manga-name"><b><a href="/naruto">Naruto Gaiden</a></b></div>
                                                <div class="manga-chapters">                                                       
                                                    <div class="title pull-left"><a href="/naruto">Chapter : 1</a></div>
                                                    <div class="group pull-right">
                                                        <span class="date">
                                                            25-07-2015
                                                        </span>
                                                        <span class="ratings">
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                        </span>   
                                                    </div>
                                                </div>
                                                <div class="manga-chapters">                                                       
                                                    <div class="title pull-left"><a href="/naruto">Chapter : 2</a></div>
                                                    <div class="group pull-right">
                                                        <span class="date">
                                                            25-07-2015
                                                        </span>
                                                        <span class="ratings">
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                        </span>   
                                                    </div>
                                                </div>
                                                <div class="manga-chapters">                                                       
                                                    <div class="title pull-left"><a href="/naruto">Chapter : 3</a></div>
                                                    <div class="group pull-right">
                                                        <span class="date">
                                                            25-07-2015
                                                        </span>
                                                        <span class="ratings">
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                            <span class="glyphicon glyphicon-star"></span>
                                                        </span>   
                                                    </div>
                                                </div>
                                                
											</li>
											</c:forEach>
											
										</ul>

		                                
	                                                      
	                    		</div>		                     		  	                     	                     
		                		                     	                	 	 
                    	</div><!-- End row --> --%>
                    </c:if>
                    
                    
                  	<!------------------------->
                  	<!-- View type Grid View -->
                  	<!------------------------->
                	<c:if test="${viewType eq 'grid' }">           
                	
                		<c:if test="${not empty mangaEps }">
                			<div class="row layout-view grid-view">
                				<c:forEach var="mangaEp" items="${mangaEps }">
								<div class="item col-xs-6 col-sm-6 col-lg-3 col-md-3">
									<div class="thumbnail">
										<a href="/${mangaEp.manga.name }/${mangaEp.epNo }"> <img
											src="${mangaEp.manga.picUrl }"
											alt="" />
											<div class="caption">
												<h5>${mangaEp.manga.name }</h5>
												<p>${mangaEp.epName }</p>
												<div class="wrapper">
													<p class="pull-right">${mangaEp.rate } reviews</p>
													<p class="ratings">
														<span class="glyphicon glyphicon-star"></span>
														<span class="glyphicon glyphicon-star"></span> 
														<span class="glyphicon glyphicon-star"></span> 
														<span class="glyphicon glyphicon-star"></span> 
														<span class="glyphicon glyphicon-star"></span>
													</p>
												</div>
											</div>
											<!-- End caption -->
										</a>
									</div>
									<!-- End thumbnail -->
								</div>
							</c:forEach>
                			
                			</div>
                		</c:if>
                	    	
                		<%-- <div class="row layout-view grid-view">	                    
		                    <c:forEach var="i" begin="1" end="10"> 		                    
	                    		<!-- Items -->                                    
	                    		<div class="item col-xs-6 col-sm-6 col-lg-3 col-md-3">	     
		                            <div class="thumbnail">
		                            	<a href="/naruto/1">
			                                <img src="http://s4.mangapanda.com/cover/naruto/naruto-l0.jpg" alt="" />
			                                <div class="caption">
			                                    <h5>Naruto Gaiden</h5>
			                                    <p>The Seventh Hokage 7</p>
			                                    <div class="wrapper">
				                                    <p class="pull-right">15 reviews</p>
				                                    <p class="ratings">
				                                        <span class="glyphicon glyphicon-star"></span>
				                                        <span class="glyphicon glyphicon-star"></span>
				                                        <span class="glyphicon glyphicon-star"></span>
				                                        <span class="glyphicon glyphicon-star"></span>
				                                        <span class="glyphicon glyphicon-star"></span>
				                                    </p>
				                                </div>
			                                </div><!-- End caption -->
		                                </a>
		                            </div><!-- End thumbnail --> 		                                                      
	                      		</div>		                     		  	                     	                     
		                     </c:forEach>	                     	                	 	 
                    	</div><!-- End row --> --%>
                    </c:if>
                    
     
                </div><!-- End Lastest Manga --> 
                
			
            </div><!-- End col-md --> 

            <div class="col-md-3">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-success">
                            <div class="panel-heading"><b>Popular Manga</b></div>
                            <div class="list-group">
                                <a href="/naruto" class="list-group-item">
                                    Naruto
                                </a>
                                <a href="#" class="list-group-item">
                                    Bleach
                                </a>
                                <a href="#" class="list-group-item">
                                    One Piece
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-success">
                            <div class="panel-heading"><b>Popular Manga</b></div>
                            <div class="list-group">
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                                <a href="#" class="list-group-item">Naruto</a>
                                <a href="#" class="list-group-item">Bleach</a>
                                <a href="#" class="list-group-item">One Piece</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>
    <!-- /.container -->

<c:import url="_footer.jsp"></c:import>
