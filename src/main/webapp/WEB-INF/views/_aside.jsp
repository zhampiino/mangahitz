<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 widget">
	<c:if test="${not empty popularManga}">
     <div class="wrapper">
         <aside class="popular-manga">
             <h3>Popular Manga</h3>
             <ul class="list-group">
             	<c:forEach var="manga" items="${popularManga.content }">
             	
              	<li class="list-group-item">
              		<div class="img-thumb-wrap">
                          <a href="/${manga.requestName }/chapter-list/1"/><img src="${manga.originalPicUrl }" /></a> 
                      </div>
                      <div class="manga-name"><a href="/${manga.requestName }/chapter-list/1"><b>${manga.name }</b></a></div>   	                                
              	</li>
             	</c:forEach>
             </ul>
         </aside>                   
     </div>
    </c:if>
    <c:if test="${not empty popularMangaEp }">
     <div class="wrapper">
         <aside class="popular-manga-chapter">
             <h3>Popular Chapter</h3>
             <ul class="list-group">
            
             	<c:forEach var="mangaEp" items="${popularMangaEp.mangaEpList }">
              	<li class="list-group-item"> 
              		<div class="img-thumb-wrap">
                          <a href="/${mangaEp.manga.requestName }"><img src="${mangaEp.manga.picUrl }" /></a> 
                      </div>                       		
                      <div class="manga-name"><a href="/${mangaEp.manga.requestName }/chapter-list/1">${mangaEp.manga.name }</a></div>
                         <div class="manga-chapters"><a href="/${mangaEp.manga.requestName }/${mangaEp.epNo}">Chapter ${mangaEp.epNo} : ${mangaEp.epName }</a></div>
              	</li>
             	</c:forEach>
             
             </ul>
         </aside>
     </div>
    </c:if>	
    <div class="wrapper">
        <aside class="Social">
            <h3>Social</h3>
            
        </aside>
    </div>
    
</div>