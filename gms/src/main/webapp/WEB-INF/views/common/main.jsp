<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!doctype html>
<html lang="en">
<head>
<title>Home</title>
	<link rel="shortcut icon" href="${ctx}/resources/img/favicon.ico" />
    <link href="${ctx}/resources/vendor/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${ctx}/resources/vendor/fontawesome-free/css/all.min.css" type="text/css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Varela+Round" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"  rel="stylesheet">
    <link href="${ctx}/resources/css/grayscale.min.css" type="text/css" rel="stylesheet">
    
    <link href="${ctx}/resources/other_resources/dist/css/skins/AdminLTE.min.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/resources/other_resources/dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />
    
    <%-- <script src="${ctx}/resources/js/app.js"></script> --%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <script src="${ctx}/resources/vendor/jquery/jquery.min.js"></script>
    <script src="${ctx}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>    
<body>
<div id="wrapper">
	<div id="header">
        <tiles:insertAttribute name="header"/>
    </div>
    <div id="about">
        <tiles:insertAttribute name="about"/>
    </div>
    <div id="contact">
        <tiles:insertAttribute name="contact"/>
    </div>
    <div id="navigation">
        <tiles:insertAttribute name="navigation"/>
    </div>
    <div id="projects">
        <tiles:insertAttribute name="projects"/>
    </div>
    <div id="footer">
        <tiles:insertAttribute name="footer"/>
    </div>
    <div id="retrieve">
        <tiles:insertAttribute name="retrieve"/>
    </div>
    <div id="register">
        <tiles:insertAttribute name="register"/>
    </div>
    <div id="read">
        <tiles:insertAttribute name="read"/>
    </div>
    <div id="retrieve">
        <tiles:insertAttribute name="retrieve"/>
    </div>
    <div id="modify">
        <tiles:insertAttribute name="modify"/>
    </div>
    
</div>

<script>app.init('${ctx}')</script>
</body>
</html>