<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<%
    if (request.getSession().getAttribute("token") == null ) {
%>


<form method="post" target="<%=request.getContextPath()%>/index.jsp" action="<%=request.getContextPath()%>/login/">

  <table>
    <tr>
      <td>username :  <input type="text" name="username"> </td>
    </tr>
    <tr>
      <td>password :  <input type="password" name="password"> </td>
    </tr>
    <tr>
      <td><input type="submit"> </td>
    </tr>

  </table>

</form>

<%
    }
    else {


%>

User Token is :
<%= (String)request.getSession().getAttribute("token")%>

<%
    }
%>
</body>

</html>
