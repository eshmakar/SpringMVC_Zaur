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
<h1>Your name: ${employee.name}</h1>
<h1>Your surname: ${employee.surname}</h1>
<h1>Your salary: ${employee.salary}</h1>

</body>
</html>
