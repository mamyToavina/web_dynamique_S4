<%@page import="java.util.Vector"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Emp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //out.println(request.getAttributeNames());
   
    Emp emp = (Emp)request.getAttribute("emp");
   
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.println(emp.getName());
        %>
    </body>
</html>