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
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/quotes-view.js"></script>

        <title>Quotes</title>
    </head>
    <body>
        <div id="main">
            <div id="header">

            </div>

            <div id="nav">
                <ul style="list-style:none">
                    <li>
                        <div>
                            <a href="/quotes">Главная</a>
                        </div>
                    </li>
                    <li>
                        <div>
                            <a href="/quotes/administration">Administration</a>
                        </div>
                    </li>
                    <li>
                        <div>
                            <a href="/quotes">quotes</a>
                        </div>
                    </li>
                    <li>
                        <div>
                            <a href="/quotes">quotes</a>
                        </div>
                    </li>
                </ul>
            </div>

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

            <div class="new-random-quote">Show new quote</div>

        </div>
    </body>
</html>