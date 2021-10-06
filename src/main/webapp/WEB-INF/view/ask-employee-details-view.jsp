<!DOCTYPE html>
<html>
<body>
<h1>Dear Employee, please enter your details</h1>
<br>
<br>


<%--action - означает,какую ссылку открывать при нажатии на кнопки--%>
<%--name="employeeName" - все что будет введено, будет сохранятся в переменной employeeName --%>
<form action="/showDetails" method="get">
    <input type="text" name="employeeName" placeholder="Write your name"/>
    <input type="submit"/>
</form>
</body>
</html>
