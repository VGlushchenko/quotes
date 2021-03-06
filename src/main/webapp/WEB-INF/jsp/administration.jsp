<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/quotes-view.js"></script>

        <title></title>
    </head>
    <body>
        <div>
            <form action="add" method="POST">
                <p>Quote</p>
                <p><textarea rows="10" cols="45" name="quote" ch></textarea></p>
                <div>
                    <select name="author">
                        <c:forEach var="author" items="${authors}">
                            <option value="<c:out value="${author.id}" />"><c:out value="${author.name}" /></option>
                        </c:forEach>
                    </select>
                    <div>
                        Category:
                        <input type="text" name="category">
                    </div>
                </div>
                <p><input type="submit" value="Отправить"></p>
            </form>

            <form action="newAuthor"method="POST">
                <p>New Author</p>
                <p><input type="text" name="newAuthor"></p>
                <input type="submit" value="add">
            </form>
        </div>
    </body>
</html>