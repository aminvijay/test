<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Resource example</title>
 
 
<script type="text/javascript"
   src="../resources/js/common.js"></script>
    
    
<link rel="stylesheet" type="text/css"
   href="${pageContext.request.contextPath}/resources/css/commons.css">
 
</head>
<body>

path is ${pageContext.request.contextPath}
 
   <div class="red-text">Red text</div>
   <br>
   <div class="green-text">Green text</div>
   <br>
    
   <input type="button" class="button" onclick="sayHello();"
       value="Click me!">
 
</body>
</html>