<!DOCTYPE html>
<html>
<body>
<h2>Dear employee, you are welcome!!!</h2>
<br>
<br>
<br>

<%--${param.employeeName} - после param берем переменную employeeName (то есть то, что ввел пользователь)--%>
<%--<h1>Your name: ${param.employeeName}!!!</h1>--%>

<%--выводим то что сохраняли в модель nameAttribute и description --%>
<h1>Your name: ${nameAttribute} ${description}</h1>

</body>
</html>
