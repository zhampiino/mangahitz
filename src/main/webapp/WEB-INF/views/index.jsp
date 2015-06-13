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
		

            <div class="col-md-8">

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

                    <div class="row layout-view">
                    	<c:if test="${viewType eq 'list' }">
                        	<div class="item col-sm-12 col-lg-12 col-md-12 list-view">
                        </c:if>
                        <c:if test="${viewType eq 'grid' }">
                        	<div class="item col-sm-4 col-lg-4 col-md-4 grid-view">
                        </c:if>	
                            <div class="thumbnail">
                                <img src="http://s4.mangapanda.com/cover/naruto/naruto-l0.jpg" alt="">
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
                        
                    	<c:if test="${viewType eq 'list' }">
                        	<div class="item col-sm-12 col-lg-12 col-md-12 list-view">
                        </c:if>
                        <c:if test="${viewType eq 'grid' }">
                        	<div class="item col-sm-4 col-lg-4 col-md-4 grid-view">
                        </c:if>	
                            <div class="thumbnail">
                                <img src="http://s2.mangapanda.com/cover/one-piece/one-piece-l1.jpg" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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
                    	<c:if test="${viewType eq 'list' }">
                        	<div class="item col-sm-12 col-lg-12 col-md-12 list-view">
                        </c:if>
                        <c:if test="${viewType eq 'grid' }">
                        	<div class="item col-sm-4 col-lg-4 col-md-4 grid-view">
                        </c:if>	
                            <div class="thumbnail">
                                <img src="http://s4.mangapanda.com/cover/naruto/naruto-l0.jpg" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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
                    	<c:if test="${viewType eq 'list' }">
                        	<div class="item col-sm-12 col-lg-12 col-md-12 list-view">
                        </c:if>
                        <c:if test="${viewType eq 'grid' }">
                        	<div class="item col-sm-4 col-lg-4 col-md-4 grid-view">
                        </c:if>	
                            <div class="thumbnail">
                                <img src="http://s2.mangapanda.com/cover/one-piece/one-piece-l1.jpg" alt="">
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
                    	<c:if test="${viewType eq 'list' }">
                        	<div class="item col-sm-12 col-lg-12 col-md-12 list-view">
                        </c:if>
                        <c:if test="${viewType eq 'grid' }">
                        	<div class="item col-sm-4 col-lg-4 col-md-4 grid-view">
                        </c:if>	
                            <div class="thumbnail">
                                <img src="http://s4.mangapanda.com/cover/naruto/naruto-l0.jpg" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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
                    	<c:if test="${viewType eq 'list' }">
                        	<div class="item col-sm-12 col-lg-12 col-md-12 list-view">
                        </c:if>
                        <c:if test="${viewType eq 'grid' }">
                        	<div class="item col-sm-4 col-lg-4 col-md-4 grid-view">
                        </c:if>	
                            <div class="thumbnail">
                                <img src="http://s2.mangapanda.com/cover/one-piece/one-piece-l1.jpg" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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

                <div class="yesterday-manga">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <b>Latest Manga Updates</b>
                            <!--div class="pull-right">
                                <strong></strong>
                                <div class="btn-group btn-layout-view">
                                    <a href="#" class="btn btn-default btn-xs list"><span class="glyphicon glyphicon-th-list"></span> List</a>
                                    <a href="#" class="btn btn-default btn-xs grid"><span class="glyphicon glyphicon-th"></span> Grid</a>
                                </div>

                            </div-->
                        </div>
                    </div>

                    <div class="row layout-view">
                        <div class="item col-sm-4 col-lg-4 col-md-4">
                            <div class="thumbnail">
                                <img src="http://placehold.it/320x347" alt="">
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
                        <div class="item col-sm-4 col-lg-4 col-md-4">
                            <div class="thumbnail">
                                <img src="http://placehold.it/320x347" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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
                        <div class="item col-sm-4 col-lg-4 col-md-4">
                            <div class="thumbnail">
                                <img src="http://placehold.it/320x347" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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
                        <div class="item col-sm-4 col-lg-4 col-md-4">
                            <div class="thumbnail">
                                <img src="http://placehold.it/320x347" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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
                        <div class="item col-sm-4 col-lg-4 col-md-4">
                            <div class="thumbnail">
                                <img src="http://placehold.it/320x347" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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
                        <div class="item col-sm-4 col-lg-4 col-md-4">
                            <div class="thumbnail">
                                <img src="http://placehold.it/320x347" alt="">
                                <div class="caption">
                                    <h5 class="pull-right">#700</h5>
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

            <div class="col-md-4">
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
