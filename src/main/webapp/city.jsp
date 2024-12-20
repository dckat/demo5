<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 20.
  Time: 오후 3:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
    <h1>Enter City Information</h1>
    <a href="tour?cityName=busan&cityPopulation=5000">busan</a>
    <hr>
    <form action="tour" method="post">
      City Name: <input name="cityName" value="ulsan"><br>
      City Population: <input name="cityPopulation" value="3000"><br>
      <button type="submit">Submit</button>
    </form>
  </body>
</html>
