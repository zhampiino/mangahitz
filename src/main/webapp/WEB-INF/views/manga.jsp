<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:import url="_header.jsp"></c:import>


    <!-- Page Content -->
    <div class="jumbotron">
    
	    <div class="container">	    
		    <div class="row">
		    	<div class="col-sm-12 col-lg-12 col-md-12">
		    	
                   <div class="thumbnail">

                       <div class="caption">
                           <h5 class="pull-right">ตอนที่ #700</h5>
                           <h5>
                               <a href="#">Naruto Gaiden: The Seventh Hokage </a>
                           </h5>
                           <p>Naruto Gaiden: The Seventh Hokage 7</p>
                       </div>
                       <div class="ratings">
                           <p class="pull-right">15 reviews</p>
                           <p>
                               <span class="glyphicon glyphicon-star"></span>
                               <span class="glyphicon glyphicon-star"></span>
                               <span class="glyphicon glyphicon-star"></span>
                               <span class="glyphicon glyphicon-star"></span>
                               <span class="glyphicon glyphicon-star"></span>
                           </p>
                       </div>
                   </div>
	       	    	
		    	
		    	
		    	</div>
		    </div>	    
	    </div>
	    
	</div>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-lg-12 col-md-12">	
				<div class="panel panel-success">
					<div class="panel-heading">
						<h3 class="panel-title">Chapter</h3>
					</div>
		
					<ul class="list-group">
						<c:forEach var="i" begin="1" end="10">
						   <li class="list-group-item">
						    <span class="badge">05/05/2015</span>
						    <a class="text-capitalize" href="/naruto/${i}">${mangaName } : chapter ${i}</a>						    
						  </li>
						</c:forEach>				 
					</ul>
		 		</div> 
 		
 			</div>
 		</div>
	</div>
			



<c:import url="_footer.jsp"></c:import>
