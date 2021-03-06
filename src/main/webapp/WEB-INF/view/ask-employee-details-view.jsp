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
    <form:errors path="name"/> <%--если имя меньше 2 символов, выводится ошибка--%>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
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
    <br><br>
    <%--    <form:radiobutton path="carBrand" value="BMW"/>BMW<br>--%>
    <%--    <form:radiobutton path="carBrand" value="Audi"/>Audi<br>--%>
    <%--    <form:radiobutton path="carBrand" value="Mercedes-Benz"/>MD<br>--%>

    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carList}"/>
    <br><br>

    Foreign language(s):
    <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br><br>

    Phone number:
    <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>

    Email:
    <form:input path="email"/>
    <form:errors path="email"/>

    <br><br>
    <input type="submit" value="OK">


</form:form>


</body>
</html>
