<%-- 
    Document   : Mado
    Created on : Jan 26, 2016, 12:19:31 PM
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
<script src='<c:url value="/resources/js/calander.js"/>'></script>


</head>
<body>
     <jsp:include page="/menu"/> 
	
  <!-- start slider -->
<div class="banner-slider">
				<div class="callbacks_container">
					<ul class="rslides" id="slider4">
					    <li>
						  <div class="banner-img">
                                                      <img src="<c:url  value="http://res.cloudinary.com/sa33er/image/upload/panel.jpg" />" class="img-responsive"  alt="" />
						  </div>
						    <h4 >Sa333er.com</h4>
						     <h5>Priceless</h5>
						</li>
					
					
					</ul>
			  </div>
	    </div>
		<!--banner Slider starts Here-->
	  	<script src="js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager:false,
			        nav: true,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script>

    <!--/slider -->
<div class="main">
	<div class="wrap">
           
		<div class="section group">
		  <div class="cont span_2_of_3">
		  	<h2 class="head">Weekly best price</h2>
			<div class="top-box">
			
                             <c:forEach var="product"  items="${product}">
                                       
				            
				           
                            <div class="col_1_of_3 span_1_of_3"> 
			   <a href="./single?product_id=${product.getProductId()}">
				<div class="inner_content clearfix">
                                    
					<div class="product_image">
                                            <img src="<c:url   value="http://res.cloudinary.com/sa33er/image/upload/w_478,h_595/${product.getImageUrl()}.jpg"/>" alt=""/>
					</div>
                  
                    <div class="price">
					   <div class="cart-left">
							<p class="title">${product.getProductName()}</p>
							<div class="price1">
							  <span class="actual">${product.getPrice()} JOD</span>
							</div>
						</div>
						
						<div class="clear"></div>
					 </div>				
                   </div>
                 </a>
				</div>
			  </c:forEach>
				
				<div class="clear"></div>
			</div>	
		
	        		 						 			    
		  </div>
                     <div class="rsingle span_1_of_single">
				<h5 class="m_1">Categories</h5>
					
					<ul class="kids">
						  <c:forEach var="category"  items="${category}">
                                        <li value= "${category.getCategoryId()}"><a href="./sub-category?category_id=${category.getCategoryId()}"> ${category.getCategoryName()}</a></li>
				            
				             </c:forEach>
					</ul>
                  
		   
		    
		  
		     
		     
		       <script src="js/jquery.easydropdown.js"></script>
                        </div>
	   <div class="clear"></div>
	</div>
	</div>
	</div>
     <jsp:include page="/footer"/> 
  
</body>
</html>
