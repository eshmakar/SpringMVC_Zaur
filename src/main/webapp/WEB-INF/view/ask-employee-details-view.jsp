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

<%--  Вариант №1 - записать все варианты в файл jsp
<form:select path="department"> - это выпадающее меню для выбора из нескольких вариантов--%>
<%--    Department <form:select path="department">--%>
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Human Resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>
<%--    </form:select>--%>
<%--    <br><br>--%>

<%--Вариант №2 - все департаменты берем из списка Мар--%>
    Department <form:select path="department">
        <form:options items="${employee.departmentsList}"/>
    </form:select>


    <input type="submit" value="OK">


</form:form>



</body>
</html>
