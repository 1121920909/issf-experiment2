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
        <div>
            <table>
                <thead>
                    <tr>
                        <th>姓名</th>
                        <th>年龄</th>
                        <th>性别</th>
                        <th>爱好</th>
                        <th>学院</th>
                        <th>专业</th>
                        <th>修改与删除</th>
                    </tr>
                </thead>
                <tbody>
                    <s:iterator value="studentsList" var="student">
                        <tr>
                            <th><s:property value="#student.name"/> </th>
                            <th><s:property value="#student.age"/> </th>
                            <th><s:property value="#student.sex"/> </th>
                            <th><s:property value="#student.hobby"/> </th>
                            <th><s:property value="#student.major.college.name"/> </th>
                            <th><s:property value="#student.major.name" /></th>
                            <s:url action="delete" var="deleteStu">
                                <s:param name="id" value="#student.id"/>
                            </s:url>
                            <s:url action="updateView" var="updateView">
                                <s:param name="id" value="#student.id"/>
                            </s:url>
                            <th><s:a href="%{deleteStu}">删除</s:a> <s:a href="%{updateView}">修改</s:a></th>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>
    </body>
</html>

