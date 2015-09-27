<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:import url="_header.jsp"></c:import>

<c:set var="servletPath" value="${requestScope['javax.servlet.forward.servlet_path']}"></c:set>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!-- /.Page Content -->
<div class="jumbotron common-jumbotron">
	<div class="container">
		<h4 class="pull-left"><a href="/" title="Home"><span class="glyphicon glyphicon-home"></span></a>
			<span> / </span><span><a href="/${manga.requestName }/chapter-list/1" title="One Piece">${manga.name}</a></span>
		</h4>
	</div>
</div>

<div class="context-header">
	<div class="container">
	
		<div class="manga-cover hidden-xs">	
			<div class="border-box">
				<div class="img-wrap">
					<img width="100%" src="${manga.uploadPicUrl }" />
				</div>
			</div>
		</div>	
		 
		<div class="manga-description">												
			<ul class="list-group">
				<li class="list-group-item intro">${manga.description }</li>
				<li class="list-group-item"><b>ชื่อภาษาไทย  :</b> ${manga.alternateName }</li>
				<li class="list-group-item"><b>ผู้แต่ง :</b> ${manga.author }</li>
				<li class="list-group-item"><b>ผู้เขียน :</b> ${manga.artist }</li>
				<li class="list-group-item"><b>สำนักพิมพ์ :</b> ${manga.publishing }</li>
				<li class="list-group-item"><b>หมวดหมู่ :</b> ${manga.categories }</li>
				<li class="list-group-item"><b>Tagges as :</b> ${manga.tagges }</li>
				<li class="list-group-item"><b>วันที่เพิ่ม :</b> ${manga.createDate }</li>
				<li class="list-group-item"><b>ตีพิมพ์เมื่อ :</b> ${manga.yearRelease }</li>
				<li class="list-group-item"><b>สถานะ :</b> ${manga.status }</li>
			</ul>
		</div>	
			
	</div>
</div>	


<!-- /.Start Main Container -->
<div class="container">

    <div class="row">
   
        <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 content">     
	    	<section class="section-relate-chapters">               
	        	<div class="wrapper">
	        		<div class="section-header">          		
     					<h1 class="pull-left">Chapters</h1>	        				
                    </div> 
	        		<ul class="list-group">
	        			<c:forEach var="mangaEp" items="${mangaEps.content }" varStatus="mangaEpObj">
		        			<li class="list-group-item">
		        				<div class="manga-chapters"> 
		                            <div class="title pull-left"><a href="/${mangaEp.requestName }/chapter/${mangaEp.epNo}">Chapter ${mangaEp.epNo} : ${mangaEp.epName }</a></div>
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
		        			</li>
	        			</c:forEach>
	        		</ul>
	        		
	        	</div>
	    	</section> 
	    	<div class="pull-right">
	    		<ul class="pagination pagination-sm">
				    <li><a href="/${manga.requestName }/chapter-list/1">First</a></li>
				</ul>
				<c:forEach var="i" begin="1" end="${mangaEps.totalPages }">
						<c:if test="${fn:endsWith(servletPath,i) }">
							<c:if test="${mangaEps.totalPages eq i }">
								<c:set var="prevPage" value="${i - 1}"></c:set>
							</c:if>
							<c:if test="${fn:endsWith(servletPath,1) }">
								<c:set var="prevPage" value="1"></c:set>
							</c:if>
						</c:if>
				</c:forEach>
				<ul class="pagination pagination-sm">
				    <li><a href="/${manga.requestName }/chapter-list/${prevPage}">Prev</a></li>
				</ul>
				<ul class="pagination pagination-sm">
					<c:forEach var="i" begin="1" end="${mangaEps.totalPages }">
						<c:if test="${fn:endsWith(servletPath,i) }">
							<li class="active">
							
							<c:if test="${mangaEps.totalPages eq i }">
								<c:set var="nextPage" value="${i}"></c:set>
							</c:if>
							<c:if test="${mangaEps.totalPages ne i }">
								<c:set var="nextPage" value="${i + 1 }"></c:set>
							</c:if>
						</c:if>
						<c:if test="${not fn:endsWith(servletPath,i) }">
							<li>
						</c:if>
						 <a href="/${manga.requestName }/chapter-list/${i}"><span>${i }</span></a></li>
					</c:forEach>
				</ul>
				<ul class="pagination pagination-sm">
				    <li><a href="/${manga.requestName }/chapter-list/${nextPage}">Next</a></li>
				</ul> 
				<ul class="pagination pagination-sm">
				    <li><a href="/${manga.requestName }/chapter-list/${mangaEps.totalPages}">Last</a></li>
				</ul>
			</div>          
        </div>

        <div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 widget">
            <div class="wrapper">
                <aside class="popular-manga">
                    <h3>Popular Manga</h3>
                    
                    <c:if test="${not empty lastestManga}">
                    
                    <ul class="list-group">
                    
                    	<c:forEach var="manga" items="${lastestManga.mangaList }">
                    	
                     	<li class="list-group-item">
                     		<div class="img-thumb-wrap">
                                 <a href="/${manga.name }"><img src="${manga.picUrl }" /></a> 
                             </div>
                             <div class="manga-name"><a href="/${manga.name }"><b>${manga.name }</b></a></div>   	                                
                     	</li>
                     	
                    	</c:forEach>
                    	
                    </ul>
                    
                    </c:if>
                </aside>                   
            </div>
            
            <div class="wrapper">
                <aside class="popular-manga-chapter">
                    <h3>Popular Chapter</h3>
                    
                    <c:if test="${not empty lastestMangaEp}">
                    
                    <ul class="list-group">
                                           	
                    	<c:forEach var="mangaEp" items="${lastestMangaEp.mangaEpList }">
			
                     	<li class="list-group-item"> 
                     		<div class="img-thumb-wrap">
                                 <a href="/${mangaEp.manga.name }"><img src="${mangaEp.manga.picUrl }" /></a> 
                             </div>                       		
                             <div class="manga-name"><a href="/">${mangaEp.manga.name }</a></div>
                                <div class="manga-chapters"><a href="/${mangaEp.manga.name }/${mangaEp.epNo }">Chapter ${mangaEp.epNo } : ${mangaEp.epName }</a></div>
                     	</li>
                     	 
                    	</c:forEach>		                                          	
                    	
                    </ul>
                    
                    </c:if>
                    
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
<!-- /.End Main Container -->
    

	

			



<c:import url="_footer.jsp"></c:import>
