<!--
Author: Mado

-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
   <head>
<title>Sa33er.com | Login</title>
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
       
       <jsp:include page="/menu"/> 
        <div class="login">
            <div class="wrap">
                <div class="col_1_of_login span_1_of_login">
                    <h4 class="title">New Account</h4>
                   
                    <div class="button1">
                        <a href="./registration"><input type="submit" name="Submit" value="Create an Account"></a>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="col_1_of_login span_1_of_login">
                    <div class="login-title">
                        <h4 class="title">ALREADY HAVE ONE !</h4>
                        <div id="loginbox" class="loginbox">
                            <form action="./Login-Auth" method="post" name="login" id="login-form">
                                <fieldset class="input">
                                    <p id="login-form-username">
                                        <label for="modlgn_username">Email</label>
                                        <input id="modlgn_username"  type="Email" name="email" class="inputbox" size="18" autocomplete="off">
                                    </p>
                                    <p id="login-form-password">
                                        <label for="modlgn_passwd">Password</label>
                                        <input id="modlgn_passwd" type="password" name="password" class="inputbox" size="18" autocomplete="off">
                                    </p>
                                    <div class="remember">
                                        <p id="login-form-remember">
                                            <label for="modlgn_remember"><a href="#">Forget Your Password ? </a></label>
                                        </p>
                                        <input type="submit" name="Submit" class="button" value="Login"><div class="clear"></div>
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <jsp:include page="/footer"/> 
    </body>
</html>