<%--
  Created by IntelliJ IDEA.
  User: ZYP
  Date: 2018/4/28
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Dictionary" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Student Info</title>
</head>
    <body>
        <div>
            <s:form action="insert" method="POST">
                <s:textfield label="姓名" name="name" value=""/>
                <s:textfield label="年龄" name="age" value=""/>
                <s:radio label="性别" list="{'男','女'}" name="sex"/>
                <s:select label="学院" list="collegeList" name="college"/>
                <s:select label="专业" list="majorList" name="major"/>
                <s:checkboxlist label="爱好" list="{'体育','游戏','音乐','旅游'}" name="hobby"/>
                <s:submit key="添加"/>
            </s:form>
        </div>
    </body>
</html>

