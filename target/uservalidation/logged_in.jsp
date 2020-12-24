<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:choose>
            <c:when test="${not empty username}">
                <h1>Welcome to your Dashboard <%=session.getAttribute("username")%> !</h1>
                <br>
                <br>
                <br>
                <form action="Logout" method="post">
                    <button>Logout</button>
                </form>
            </c:when>
            <c:otherwise>
                <h1>Please login to view this page</h1>
                <br>
                <br>
                <br>
                <a href="index.jsp"><button>Login</button></a>
            </c:otherwise>
        </c:choose>

</html>