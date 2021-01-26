<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>

    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/account/main" method="post">
    账号<input name="name" type="text"></br>
    密码：<input type="text" name="pass">
    <c:if test="${error !=null}">
        提示：<span>${error}</span>
    </c:if>
    <input type="submit" value="登录">
</form>
</body>
</html>
