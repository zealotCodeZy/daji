<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list category</title>
</head>
<body>
<div class="workingArea">
	<h1 class="label label-info" >category admin</h1>
	<br>
	<br>
	
	<div class="listDataTableDiv">
		<table class="table table-striped table-bordered table-hover  table-condensed">
			<thead>
				<tr class="success">
					<th>ID</th>
<!--					<th>image</th>          -->
					<th>name</th>
<!-- 					<th>property admin</th> -->
<!-- 					<th>product admin</th>  -->
<!--					<th>edit</th>           -->
<!--					<th>delete</th>         -->
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cs}" var="c">
				<tr>
					<td>${c.id}</td>
<!--			    <td><img height="40px" src="img/category/${c.id}.jpg"></td>   -->
					<td>${c.name}</td>
<!-- 					<td><a href="admin_property_list?cid=${c.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>					 -->
<!-- 					<td><a href="admin_product_list?cid=${c.id}"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>				 -->
<!--					<td><a href="admin_category_edit?id=${c.id}"><span class="glyphicon glyphicon-edit"></span></a></td>                         -->
<!--					<td><a deleteLink="true" href="admin_category_delete?id=${c.id}"><span class=" 	glyphicon glyphicon-trash"></span></a></td>  -->
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
<!--	<div class="pageDiv">                                   -->
<!--		<%@include file="../include/admin/adminPage.jsp" %> -->
<!--	</div>                                                  -->
</div>

</body>
</html>