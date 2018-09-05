<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Formulario</title>
</head>

<body>
<form action="Autenticador" method="post">

<label for="nome">nome</label> <input type="text" name="nome"><br>
			<%=request.getParameter("Nome")%>
	

			<label for="senha">senha</label> <input type="password" name="senha"><br>
			<%=request.getParameter("Senha")%>

			<input type="submit" value="Submit">
</form>


</body>
</html>