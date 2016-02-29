<%-- 
    Document   : single
    Created on : Feb 25, 2016, 4:41:26 PM
    Author     : Mado
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
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
 <script src='<c:url   value="http://code.jquery.com/jquery-latest.js"/>'></script>
<!-- start menu -->
<link href="<c:url value="/resources/css/megamenu.css" />" rel="stylesheet">
<script src='<c:url value="/resources/js/megamenu.js"/>'></script>

<script>
    $(document).ready(function(){
        $(".megamenu").megamenu();
      
        
    });
</script>


<!--start slider -->
<script src='<c:url value="/resources/js/jquery-ui.min.js"/>'></script>
    
    <script src='<c:url value="/resources/js/css3-mediaqueries.js"/>'></script>
   
<!--end slider -->
<script src='<c:url value="/resources/js/jquery.easydropdown.js"/>'></script>

</head>
    <body>
   
	
	<jsp:include page="/menu"/> 
            
	
        <div class="clear"></div>
         <c:forEach var="product"  items="${product}">
<div class="mens">    
  <div class="main">
     <div class="wrap">
     	
		<div class="cont span_2_of_3">
		  	<div class="grid images_3_of_2">
						<!-- FlexSlider -->
						<script src="js/imagezoom.js"></script>
							<script defer src="js/jquery.flexslider.js"></script>
							<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
							<script>
							// Can also be used with $(document).ready()
								$(window).load(function() {
									$('.flexslider').flexslider({
										animation: "slide",
										controlNav: "thumbnails"
									 });
								});
							</script>
						<!-- //FlexSlider-->
						<div class="flexslider">
							  <ul class="slides">
								<li data-thumb="images/s1.jpg">
									<div class="thumb-image"> <img src="<c:url   value="http://res.cloudinary.com/sa33er/image/upload/w_478,h_595/${product.getImageUrl()}.jpg"/>" alt=""/> </div>
								</li>
								
							  </ul>
							<div class="clearfix"></div>
					</div>		



	            </div>
		         <div class="desc1 span_3_of_2">
		         	<h3 class="m_3">${product.getProductName()}</h3>
		             <p class="m_5">${product.getPrice()}</p>
		         	
					
				     <p class="m_text2">${product.getProductDescription()}</p>
			     </div>
			   <div class="clear"></div>	
	    <div class="clients">
	    
		
	<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo1").flexisel();
			$("#flexiselDemo2").flexisel({
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		
			$("#flexiselDemo3").flexisel({
				visibleItems: 5,
				animationSpeed: 1000,
				autoPlay: false,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	</script>
	<script type="text/javascript" src="js/jquery.flexisel.js"></script>
     </div>
     <div class="toogle">
     	<h3 class="m_3">Product Details</h3>
        <p>${product.getProductDescription()}</p>
     </div>
    
      </div>
			<div class="rsingle span_1_of_single">
				<h5 class="m_1">Categories</h5>
					
					<ul class="kids">
						  <c:forEach var="category"  items="${category}">
                                        <li value= "${category.getCategoryId()}"><a href="#"> ${category.getCategoryName()}</a></li>
				            
				             </c:forEach>
					</ul>
                  
		   
		    
		  
		     
		     
		       <script src="js/jquery.easydropdown.js"></script>
                        </div>
		      <div class="clear"></div>
                      
			</div>
			 <div class="clear"></div>
		   </div>
		</div>
                                                                </c:forEach>
	 <jsp:include page="/footer"/> 
</body>
</html>
</html>
