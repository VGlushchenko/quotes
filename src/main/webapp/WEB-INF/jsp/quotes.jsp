<%--
  User: Администратор
  Date: 26.02.13
  Time: 21:41
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Quotes</title>
    </head>
    <body>

        <div style="padding: 20px">
            <c:forEach var="quote" items="${quotes}">
                <div><c:out value="${quote.quote}" /></div>
                <div><c:out value="${quote.category}" /></div>
                <div><c:out value="${quote.author.name}" /></div>
            </c:forEach>
        </div>

        To be developed...
    </body>
</html>