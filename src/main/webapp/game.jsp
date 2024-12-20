<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024. 12. 20.
  Time: 오후 3:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game Form</title>
    <script>
      function btnClick() {
          let gameName = document.getElementById("gameName").value;
          let gameType = document.getElementById("gameType").value;

          // 입력하지 않았을 경우 보내지 않기
          if (gameName.length > 0 && gameType.length > 0) {
              location.href = "/game?gameName=" + gameName + "&gameType=" + gameType;
          }
          else {
              alert("입력이 완료되지 않았음. 입력을 해주세요.");
          }
      }
    </script>
</head>
<body>
    <h1>Game Form</h1>

    <h2>자바 스크립트로 GET 요청</h2>

    <div>
      gameName: <input id="gameName" value="smileGame"><br>
      gameType: <input id="gameType" value="multi role"><br>
      <button onclick="btnClick()">자바 스크립트로 GET요청</button>
    </div>
    <hr>
    <form action="player" method="post">
      Player Name: <input name="playerName" value="king"><br>
      Player Score: <input name="playerScore" value="300"><br>
      <button type="submit">폼으로 POST 요청</button>
    </form>
</body>
</html>
