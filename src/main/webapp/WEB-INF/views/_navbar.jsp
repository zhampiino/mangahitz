<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
   
    <!-- /.Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/">MangaHit<span>z</span></a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden-lg hidden-md"><a href="#">Naruto</a></li>
                    <li class="hidden-lg hidden-md"><a href="#">One Piece</a></li>
                    <li class="hidden-lg hidden-md"><a href="#">Bleach</a></li>
                    <li class="hidden-lg hidden-md"><a href="#">Toriko</a></li>
                    <li class="hidden-lg hidden-md"><a href="#">Fairy Tail</a></li>
                    <li class="hidden-lg hidden-md"><a href="#">Shokugeki no Soma</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Manga  <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#">Popular Manga</a></li>
                            <li><a href="#">Manga List</a></li>
                            <li><a href="#">Latest Releases</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>