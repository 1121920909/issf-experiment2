<%--
  Created by IntelliJ IDEA.
  User: ZYP
  Date: 2018/4/28
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Dictionary" %>
<%@ page import="java.util.Hashtable" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Info</title>
</head>
<body>
<div>
    <form action="insert.jsp" method="post">
        <div>
            <label for="name">姓名：</label>
            <input type="text" name="name" id="name">
        </div>
        <div>
            <label>年龄</label>
            <input type="text" name="age" id="age">
        </div>
        <div>
            <label>性别</label>
            <label>
                <input type="radio" name="sex" id="sex_nan" value="0">男
            </label>
            <label>
                <input type="radio" name="sex" id="sex_nv" value="1">女
            </label>
        </div>
        <div>
            <label>爱好</label>
            <label>
                <input type="checkbox" name="hobby" id="hobby_game" value="game">游戏
            </label>
            <label>
                <input type="checkbox" name="hobby" id="hobby_sport" value="sport">体育
            </label>
            <label>
                <input type="checkbox" name="hobby" id="hobby_music" value="music">音乐
            </label>
            <label>
                <input type="checkbox" name="hobby" id="hobby_travel" value="travel">旅游
            </label>
        </div>
        <div>
            <label>学院</label>
            <select id="college" name="college">
                <%
                    for (String name : collegeList) {
                %>
                <option value="<%=name%>"><%=name%></option>
                <%
                    }
                %>
            </select>
        </div>
        <div>
            <label>专业</label>
            <select id="major" name="major">
                <%
                    for (String name : majorList) {
                %>
                <option value="<%=name%>"><%=name%></option>
                <%
                    }
                %>
            </select>
        </div>
        <div>
            <input type="submit">xxxxx
        </div>
    </form>
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
        <%
            for (Dictionary<String, String> student : studentInfoList) {
        %>
        <tr>
            <td><%=student.get("name")%></td>
            <td><%=student.get("age")%></td>
            <td><%=student.get("sex")%></td>
            <td><%=student.get("hobby")%></td>
            <td><%=student.get("college")%></td>
            <td><%=student.get("major")%></td>
            <td>
                <a href="delete.jsp?id=<%=student.get("id")%>">删除</a>
                <a href="update.jsp?id=<%=student.get("id")%>">修改</a>
            </td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>

