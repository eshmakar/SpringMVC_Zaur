<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h1>Dear Employee, please enter your details</h1>
<br>
<br>

<%--форма с полями ввода--%>
<%--при нажатии на ОК сработает метод showDetails--%>
<form:form action="showDetails" modelAttribute="employee">
<%--по умолчанию для name, surname, salary сработает геттеры, поэтому везде будет null, в salary будет 0--%>
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    <input type="submit" value="OK">


</form:form>



</body>
</html>
