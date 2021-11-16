<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
</head>
<body>
	<h3>Contact Form</h3>
	
	<s:form method="POST" modelAttribute="contact"
		action="${pageContext.request.contextPath }/contact/send">
	<table>
	 <tr>
	 <td>Name</td>
	 <td><s:input path="name"/> </td>
	 </tr>
	 
	 <tr>
	 <td>phone</td>
	 <td><s:input path="phone"/> </td>
	 </tr>
	 
	 <tr>
	 <td>email</td>
	 <td><s:input path="email"/> </td>
	 </tr>
	 
	 <tr>
	 <td>Address</td>
	 <td><s:input path="Address"/> </td>
	 </tr>
	 
	 <tr>
	 <td>Subject</td>
	 <td><s:input path="subject"/> </td>
	 </tr>
	 
	 <tr>
	 <td>content</td>
	 <td><s:textarea path="content" rows="5" cols="20"/> </td>
	 </tr>
	 
	 <tr>
	 <td>&nbsp;</td>
	 <td> <input type="submit" value="Send" /> </td>
	 </tr>
	 
	 
	</table>

	</s:form>
</body>
</html>