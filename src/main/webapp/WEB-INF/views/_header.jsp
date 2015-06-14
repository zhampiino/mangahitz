<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<c:import url="_scopevar.jsp"></c:import>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta name="author" content="">
    <meta name="description" content="การ์ตูน อ่านการ์ตูน อ่านการ์ตูนออนไลน์ อัพเดทตอนใหม่ๆทุกวันที่ CartoonClub-TH">
    <meta name="keywords" content="การ์ตูน,อ่านการ์ตูน,อ่านการ์ตูนออนไลน์,แฟรี่เทล Fairy Tail,วันพีช One Piece,OnePiece,นารูโตะ Naruto,บลีช Bleach,รีบอร์น Reborn,โทริโกะ Toriko,ฮันเตอร์ X ฮันเตอร์,Hunter X Hunte">

    <title>MangaHitz - Online Manga Reader ${mangaName }</title>

    <!-- Bootstrap Core CSS -->
    <!--link href="css/bootstrap.min.css" rel="stylesheet"-->
    <link href="${defaultPath}/css/flaty-bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${defaultPath}/css/custom.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<c:import url="_navbar.jsp"></c:import>
