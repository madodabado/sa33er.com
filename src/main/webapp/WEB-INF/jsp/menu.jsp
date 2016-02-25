<%-- 
    Document   : menu
    Created on : Feb 25, 2016, 5:12:10 PM
    Author     : Mado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Sa33er.com</title>
<link rel="apple-touch-icon" sizes="57x57" href="<c:url  value="/resources/images/apple-icon-57x57.png" />">
<link rel="apple-touch-icon" sizes="60x60" href="<c:url    value="/resources/images/apple-icon-60x60.png"/>">
<link rel="apple-touch-icon" sizes="72x72" href="<c:url    value="/resources/images/apple-icon-72x72.png"/>">
<link rel="apple-touch-icon" sizes="76x76" href="<c:url    value="/resources/images/apple-icon-76x76.png"/>">
<link rel="apple-touch-icon" sizes="114x114" href="<c:url    value="/resources/images?apple-icon-114x114.png"/>">
<link rel="apple-touch-icon" sizes="120x120" href="<c:url    value="/resources/images/apple-icon-120x120.png"/>">
<link rel="apple-touch-icon" sizes="144x144" href="<c:url    value="/resources/images/apple-icon-144x144.png"/>">
<link rel="apple-touch-icon" sizes="152x152" href="<c:url    value="/resources/imagesapple-icon-152x152.png"/>">
<link rel="apple-touch-icon" sizes="180x180" href="<c:url    value="/resources/images/apple-icon-180x180.png"/>">
<link rel="icon" type="image/png" sizes="192x192"  href="<c:url    value="/resources/images/android-icon-192x192.png"/>">
<link rel="icon" type="image/png" sizes="32x32" href="<c:url    value="/resources/images/favicon-32x32.png"/>">
<link rel="icon" type="image/png" sizes="96x96" href="<c:url    value="/resources/images/favicon-96x96.png"/>">
<link rel="icon" type="image/png" sizes="16x16" href="<c:url    value="/resources/imagesfavicon-16x16.png"/>">
<link rel="manifest" href="<c:url    value="/resources/images/manifest.json"/>">
<meta name="msapplication-TileColor" content="#ffffff">
<meta name="msapplication-TileImage" content="/ms-icon-144x144.png">
<meta name="theme-color" content="#ffffff">


<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">
 <link rel='stylesheet' href='<c:url value="//fonts.googleapis.com/css?family=Exo+2"/>' type='text/css' media='all' />
 <script src='<c:url value="/resources/js/jquery1.min.js"/>'></script>

<!-- start menu -->
<link href="<c:url value="/resources/css/megamenu.css" />" rel="stylesheet">
<script src='<c:url value="/resources/js/megamenu.js"/>'></script>

<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
<!--start slider -->
<script src='<c:url value="/resources/js/jquery-ui.min.js"/>'></script>
    
    <script src='<c:url value="/resources/js/css3-mediaqueries.js"/>'></script>
   
<!--end slider -->
<script src='<c:url value="/resources/js/jquery.easydropdown.js"/>'></script>

</head>
    <body>
          <div class="header-top">
	   <div class="wrap"> 
			  <div class="header-top-left">
			  	   <div class="box">
   				      <select tabindex="4" class="dropdown">
							<option value="" class="label" value="">Language :</option>
							<option value="1">English</option>
							<option value="2">Arabic |العربية </option>
							
					  </select>
   				    </div>
   				    <div class="box1">
   				        <select tabindex="4" class="dropdown">
							<option value="" class="label" value="">Currency :</option>
							<option value="1">JOD</option>
							
						</select>
   				    </div>
   				    <div class="clear"></div>
   			 </div>
			 <div class="cssmenu">
				<ul>
					
					
					
					<li><a href="./login">Log In</a></li> |
					<li><a href="./registration">Sign Up</a></li>
				</ul>
			</div>
			<div class="clear"></div>
 		</div>
	</div>
	<div class="header-bottom">
	    <div class="wrap">
			<div class="header-bottom-left">
				<div class="logo">
                                    <a href="/"><img src="<c:url value="/resources/images/logo.png" />" alt="" height="70px"/></a>
				</div>
                                <div class="menu" style="margin-left: 100px">
	            <ul class="megamenu skyblue">
			<li class="active grid" > <a href="/">Home</a></li>
			<li><a class="color4" href="#">Categories</a>
				<div class="megapanel" >
                                    <div class="row" >
						<div class="col1" >
							<div class="h_nav"  >
								<h4>Categories </h4>
								<ul >
									 <c:forEach var="category"  items="${category}">
                                        <li style="width:2000px " value= "${category.getCategoryId()}"><a href="#"> ${category.getCategoryName()}</a></li>
				            
				             </c:forEach>
								</ul>	
							</div>							
						</div>
						
						
					  </div>
					</div>
				</li>				
				
			</ul>
			</div>
		</div>
	   <div class="header-bottom-right">
         <div class="search">	  
				<input type="text" name="s" class="textbox" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
				<input type="submit" value="Subscribe" id="submit" name="submit">
				<div id="response"> </div>
		 </div>
	
    </div>
   
    </body>
</html>
