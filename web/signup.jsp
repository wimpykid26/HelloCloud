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
        <title>Signup</title>
    </head>
    <hgroup>
        <h1>Signup</h1>
    </hgroup>
    <form method="POST" action="${pageContext.request.contextPath}/ControllerServlet">
        <div class="group">
            <input type="text" name="username"><span class="highlight"></span><span class="bar"></span>
            <label>Name</label>
        </div>
        <div class="group">
            <input type="text" name="password"><span class="highlight"></span><span class="bar"></span>
            <label>Password</label>
        </div>
        <div class="group">
            <input type="text"><span class="highlight"></span><span class="bar"></span>
            <label>Re-enter Password</label>
        </div>
        <button type="submit" class="button buttonBlue">Subscribe
            <div class="ripples buttonRipples"><span class="ripplesCircle"></span></div>
        </button>
    </form>
</html>
