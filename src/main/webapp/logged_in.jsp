<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <h1>Welcome to your Dashboard <%=session.getAttribute("username")%> !</h1>
        <br>
        <br>
        <br>

        <form action="Logout" method="post">
            <button>Logout</button>
        </form>

</html>