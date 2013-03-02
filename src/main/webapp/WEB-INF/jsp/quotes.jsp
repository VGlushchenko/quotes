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
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/quotes-view.js"></script>

        <title>Quotes</title>
    </head>
    <body>

        <div class="quote-box">
            <div>
                <div style="height: 75px">
                    <p class="quote"><c:out value="${randomQuote.quote}" /></p>

                    <div class="quotes-author" style="text-align: right">
                        <c:out value="${randomQuote.author.name}" />
                    </div>
                </div>

                <div class="quote-category">
                    <c:out value="${randomQuote.category}" />
                </div>
            </div>
        </div>

        <p><a class="new-random-quote" href="/quotes"></a></p>
        <div class="new-random-quote"></div>
    </body>
</html>