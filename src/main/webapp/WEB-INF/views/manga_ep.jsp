<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:import url="_header.jsp"></c:import>


<!-- /.Page Content -->
<div class="jumbotron common-jumbotron">
	<div class="container">
		<h4 class="pull-left"><a href="/" title="Home"><span class="glyphicon glyphicon-home"></span></a>
			<span> / </span><span><a href="/${mangaEp.requestName }/chapter-list/1" title="${mangaEp.name }">${mangaEp.name }</a></span>
			<span> / </span><span><a href="/${mangaEp.requestName }/chapter/${mangaEp.epNo}" title="${mangaEp.name } - ${mangaEp.epNo }">${mangaEp.epNo }</a></span>
		</h4>
	</div>
</div>

<!-- /.Start Main Container -->
<div class="container">

    <div class="row">
   
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 content">     
	    	<section class="section-read-manga">               
	        	<div class="wrapper">
	        		<ul class="items">
	        			<c:forEach var="mangaEpPic" items="${mangaEpPics }">
	        				<li><img src="${mangaEpPic.originalPicUrl }" alt="${mangaEp.name }" /></li>
	        			</c:forEach>
	        		</ul>
	        	</div>
	    	</section> 
      
        </div>

        
    </div>

</div>
<!-- /.End Main Container -->
    

	

			



<c:import url="_footer.jsp"></c:import>
