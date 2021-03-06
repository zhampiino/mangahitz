﻿<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:import url="_header.jsp"></c:import>

    <!-- /.Jumbotron -->
    <div class="jumbotron index-jumbotron">
        <div class="container hidden-xs hidden-sm">
        	<div class="row">
        		<c:if test="${not empty popularManga }">
        			<c:forEach var="manga" items="${popularManga.content }" begin="0" end="5" step="1">
        				<div class="col-xs-6 col-sm-4 col-md-2 col-lg-2">
		        			<div class="thumbnail">
		        				<div class="img-wrap">		        					
		        					<a href="/${manga.requestName }/chapter-list/1">	        						
		        						<img src="${manga.originalPicUrl }" />
		        						<div class="push">		        						
		        							<div class="manga-name">${manga.requestName }</div>
		        						</div>
		        					</a>
		        				</div>
		        			</div>
		        		</div>
        			</c:forEach>
        		</c:if>
        	</div>           
        </div>
    </div>
    
    <!-- /.context-header  -->
    <div class="context-header">
    	<div class="container">
    		<input type="text" />
    		<!-- <h3>READ MANGA ONLINE</h3>
    		<p>Manga is the Japanese comics with a unique story line and style. In Japan people of all ages read manga, manga does not target younger audiences like american comics. Here you will find 1000s of free english translated manga scans to read online. Discover the world of otaku! Naruto 701, Naruto Gaiden: The Seventh Hokage 11, Bleach 635, One Piece 794, Fairy Tail 444, will coming next!</p> -->
    	</div>
    </div>

    <!-- /.Start Main Container -->
    <div class="container">

        <div class="row">
        
            <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 content">
            
            <c:if test="${viewType eq 'list' }">
	            <c:if test="${not empty pageableLastestManga}">
	                <section class="section-new-releases list-view">               
	                	<div class="wrapper">
	                		<div class="section-header">          		
		        				<h1 class="pull-left">New Releases</h1>	        				
		        				<div class="btn-group btn-layout-view pull-right">
		                        	<span class="btn btn-default btn-xs list active"><span class="glyphicon glyphicon-th-list"></span><span class="hidden-xs">&nbsp;List</span></span>
		                        	<a href="/?viewType=grid" class="btn btn-default btn-xs grid"><span class="glyphicon glyphicon-th"></span><span class="hidden-xs">&nbsp;Grid</span></a>
		                        </div>
	                        </div> 
	                                        				
	    					<ul class="list-group">
	    					
	                      		<c:forEach var="manga" items="${pageableLastestManga.content }">
	                       		<li class="list-group-item">
	                                <div class="img-thumb-wrap">
	                                    <a href="/${manga.requestName }/chapter-list/1"><img src="${manga.originalPicUrl }" /></a>
	                                </div>
	                                <div class="manga-data">
	                                    <div class="manga-name"><a href="/${manga.requestName }/chapter-list/1">${manga.name }</a></div>
	                                    
	                                    <c:if test="${not empty manga.mangaEpsList }">
										<c:forEach var="mangaEp" items="${manga.mangaEpsList }">
		                                    
		                                    <div class="manga-chapters"> 
		                                        <div class="title pull-left"><a href="/${manga.requestName }/chapter/${mangaEp.epNo}">Chapter ${mangaEp.epNo} : ${mangaEp.epName }</a></div>
		                                        <div class="opt pull-right">
		                                            <span class="date hidden-xs">${mangaEp.releaseDateStr }</span>
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
            <c:if test="${not empty pageableLastestMangaEp}">
            	<section class="section-new-releases grid-view">
            		<div class="wrapper">           		
                		<div class="section-header">          		
	        				<h1 class="pull-left">New Releases</h1>	        				
	        				<div class="btn-group btn-layout-view pull-right">
	                        	<a href="?viewType=list" class="btn btn-default btn-xs list"><span class="glyphicon glyphicon-th-list"></span><span class="hidden-xs">&nbsp;List</span></a>
	                        	<span class="btn btn-default btn-xs grid active"><span class="glyphicon glyphicon-th"></span><span class="hidden-xs">&nbsp;Grid</span></span>
	                        </div>
                        </div> 
        				
        				<div class="grid-group">
		        				        			        				
      				    	<c:forEach var="mangaEp" items="${pageableLastestMangaEp.content }">
      				    		
      				          	<div class="grid-group-item col-xs-6 col-sm-3 col-md-4 col-lg-3">
	      				          	<div class="border-box">		    	       				    	        					
			        					<div class="img-wrap wrap-aspect-ratio" data-ratio="1.337349397590361">
			        						
			                            	<a href="/${mangaEp.requestName }/chapter/${mangaEp.epNo }"><img  src="${mangaEp.picUrl }"  /></a>
			                            	
			                            	<div class="release-date">${mangaEp.releaseDateStr }</div>
			                            	<div class="manga-data"> 			                            		                     		
				                            	<div class="manga-name"><a href="/${mangaEp.requestName }/chapter-list/1" class="ellip-line">${mangaEp.name }</a></div>
				                            	<div class="manga-chapters"><a href="/${mangaEp.requestName }/chapter/${mangaEp.epNo }"><div class="ep-no">Chapter ${mangaEp.epNo }</div><div class="ellip-line ep-name">${mangaEp.epName }</div></a></div>
		                                	</div>
			                            </div> 			                            
                                	</div>                      
		        				</div> 
		        				   				
       						</c:forEach>
        						        					
	        			</div>
        				
        			</div>           	
            	</section>
            </c:if>
            </c:if>

			<a href="#" class="btn btn-more col-xs-12 col-sm-12 col-md-12 col-lg-12">View All</a>

            </div>

            
		<c:import url="_aside.jsp"></c:import>


        </div>

    </div>
    <!-- /.End Main Container -->

<c:import url="_footer.jsp"></c:import>
