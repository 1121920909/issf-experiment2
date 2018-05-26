<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ZYP
  Date: 2018/5/24
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <s:form action="update" method="POST">
        <s:textfield label="id" name="id" value="%{student.id}" readonly="true"/>
        <s:textfield label="姓名" name="name" value="%{student.name}" />
        <s:textfield label="年龄" name="age" value="%{student.age}"/>
        <s:radio label="性别" list="{'男','女'}" name="sex" value="student.sex"/>
        <s:select label="学院" list="collegeList" name="college" value="studen.major.college.name"/>
        <s:select label="专业" list="majorList" name="major" value="student.major.name"/>
        <s:checkboxlist label="爱好" list="{'体育','游戏','音乐','旅游'}" name="hobby" value="hobbyChoose"/>
        <s:submit key="修改"/>
    </s:form>
</div>
</body>
</html>
