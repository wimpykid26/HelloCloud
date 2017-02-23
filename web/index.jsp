<%-- 
    Document   : index
    Created on : 23 Feb, 2017, 7:11:42 PM
    Author     : mera_naam_dwaipayan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/login.css">
        <title>Login</title>
    </head>
    <hgroup>
        <h1>Login</h1>
    </hgroup>
    <form>
        <div class="group">
            <input type="text"><span class="highlight"></span><span class="bar"></span>
            <label>Name</label>
        </div>
        <div class="group">
            <input type="email"><span class="highlight"></span><span class="bar"></span>
            <label>Email</label>
        </div>
        <button type="button" class="button buttonBlue">Subscribe
            <div class="ripples buttonRipples"><span class="ripplesCircle"></span></div>
        </button>
    </form>
    <footer><a href="http://www.polymer-project.org/" target="_blank"><img src="https://www.polymer-project.org/images/logos/p-logo.svg"></a>
        <p>New User <a href="http://www.polymer-project.org/" target="_blank">Signup here</a></p>
        <p>Powered By <a href="http://www.polymer-project.org/" target="_blank">Java EE</a></p>
    </footer>
</html>
