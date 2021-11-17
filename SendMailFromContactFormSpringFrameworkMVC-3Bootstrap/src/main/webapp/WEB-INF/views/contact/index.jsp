<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" s crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

<style>
.form-container{
padding:20px;
}
.form-con{
background-color:#659B74;

}
</style>
</head>
<body>
	
	<div class="container form-container">
	<div class="row">
	<div class="col-md-6 form-con">
	<s:form  method="POST" modelAttribute="contact"
		action="${pageContext.request.contextPath }/contact/send">
		<h1>Contact Form</h1>
		
	 <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Name</label>
    <s:input class="form-control" path="name"/> 
  		</div>
	
	
	<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Mobile:</label>
    <s:input class="form-control" path="phone"/> 
  		</div>
  		<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">From Email:</label>
   <s:input class="form-control" path="email"/>
  		</div>
  		<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">To Email:</label>
   <s:input class="form-control" path="ToEmail"/>
  		</div>
  		<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Address:</label>
    <s:input class="form-control" path="Address"/> 
  		</div>
  		
  		<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Subject:</label>
   <s:input class="form-control" path="subject"/> 
  		</div>
  		<div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Message:</label>
   <s:textarea class="form-control" path="content" rows="5" cols="20"/>  
  		</div>
	 
	 <input  class="form-control" type="submit" value="Send" /> 
	 
	</s:form>
	</div>
	</div>
	 </div>
</body>
</html>