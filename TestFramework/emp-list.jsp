<%@page import="java.util.Vector"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Emp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    //out.println(request.getAttributeNames());
   
    Emp emp = (Emp)request.getAttribute("liste");
   
    Vector<Emp> empl = (Vector<Emp>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EMPLOYE</title>
    </head>
    <body>
        <h1>Hello World!</h1>       
        <% 
            for (int idx = 0; idx < empl.size(); idx++) {
                    out.println("<p>"+ empl.get(idx).getName()+"</p>" );
                    
                }
        %>
    </body>
</html>
