<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>Student Registrations</title>

</head>
<body>
<%--@elvariable id="student" type=""--%>
<form:form action="save" modelAttribute="student" method="post">

    <table>
        <tr>
            <td>Name :</td>
            <td><form:input path="name"/></td>
        </tr>

        <tr>
            <td>Email :</td>
            <td><form:input path="email"/></td>
        </tr>


        <tr>
            <td>Gender :</td>
            <td><form:radiobutton path="gender" value="male"/>
                <form:radiobutton path="gender" value="female"/>
            </td>
        </tr>

        <tr>
            <td>Course:</td>
            <td><form:select path="course">
                <form:option value="">-Select-</form:option>
                <form:options items="${courseList}"/>
            </form:select></td>
        </tr>

        <tr>
            <td>Timings:</td>
            <td><form:checkboxes items="${timingList}" path="timings"/></td>
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>


</form:form>

</body>
</html>