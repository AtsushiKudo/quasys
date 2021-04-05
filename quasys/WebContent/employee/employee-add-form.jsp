<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../common/header.html"%>
<%@include file="../common/menu.jsp"%>

<body>
<p>追加する商品を入力してください。</p>
<form action="EmployeeAdd.action" method="post">
社員コード<input type="text" name="id"><br>
メールアドレス<input type="text" name="mail-address"><br>
パスワード<input type="text" name="password"><br>
<input type="submit" value="登録">
</form>
</body>
</html>

<%@include file="../common/footer.html" %>
