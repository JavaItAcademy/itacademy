<%@page import="java.util.ArrayList" %>
<%@page import="Models.Application"%>
<html>
<head>
	<title>List of Applications</title>
</head>
<body>

	<table>
		<tr>
			<th>Id</th>
			<th>fio</th>
			<th>email</th>
			<th>courses</th>
			<th>isOnline</th>
		</tr>
		<% ArrayList<Application> apps = ((ArrayList<Application>) request.getAttribute("applications")); %>
            <% for(Application s:apps){ %>
                <tr>
                    <td><%=s.getId()%></td>
                    <td><%=s.getFio()%></td>
                    <td><%=s.getEmail()%></td>
                    <td><%=s.getCourse()%></td>
                    <td><%=s.isOnline()%></td>
                </tr>
                <%}%>
	</table>
	<br>
	<a href="index.jsp">Back</a>
</body>
</html>