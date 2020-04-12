<html>
<body>
<h2>Hello World!</h2>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="account/findAll">测试一下啊</a>
<h3>测试保存</h3>
<form action="account/save" method="post">
    姓名:<input type="text" name="name"/><br/>
    金额:<input type="text" name="money"/><br/>
    <input type="submit" value="保存"/><br/>
</form>

</body>
</html>
