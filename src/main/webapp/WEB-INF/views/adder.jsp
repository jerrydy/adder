<%--
  Created by IntelliJ IDEA.
  User: Jerry
  Date: 12/27/2015
  Time: 11:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adder</title>
</head>
<body>
<h1>Lean Mean Adding Machine</h1>

<form method="post">
    <div><label for="addend1">Addend 1 : </label><input name="addend1" type="text"/></div>
    <div><label for="addend2">Addend 2 : </label><input name="addend2" type="text"/></div>
    <div><label>Sum : </label><span>${sum}</span></div>
    <button type="submit">Add</button>
</form>

</body>
</html>
