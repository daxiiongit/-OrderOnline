<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/15 0015.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>登录页面</title>
    <link rel="stylesheet" media="screen" href="/WEB-INF/css/screen.css">
    <script src="/WEB-INF/js/jquery-2.2.1.js"></script>
    <script src="/WEB-INF/js/jquery.validate.js"></script>
    <script>
        $(function() {
            // highlight
            var elements = $("input[type!='submit'], textarea, select");
            elements.focus(function() {
                $(this).parents('li').addClass('highlight');
            });
            elements.blur(function() {
                $(this).parents('li').removeClass('highlight');
            });

            $("#forgotpassword").click(function() {
                $("#password").removeClass("required");
                $("#login").submit();
                $("#password").addClass("required");
                return false;
            });

            $("#login").validate()
        });
    </script>
</head>
<body>
<div id="page">
    <div id="header">
        <h1>登录</h1>
    </div>
    <div id="content">
        <p id="status"></p>
        <form action="${pageContext.request.contextPath }/loginAdmin.action" method="post" id="login">
            <fieldset>
                <legend>User details</legend>
                <ul>
                    <li>
                        <label for="loginname">
                            <span class="required">用户名</span>
                        </label>
                        <input id="loginname" name="loginname" class="text required" type="text">
                        <label for="loginname" class="error">用户名必须填写！请输入</label>
                    </li>
                    <li>
                        <label for="loginpwd">
                            <span class="required">密码</span>
                        </label>
                        <input name="loginpwd" type="password" class="text required"
                               id="loginpwd" minlength="4" maxlength="20">
                    </li>
                    <li>
                        <label class="centered info"><a id="forgotpassword" href="#">Email my password...</a>
                        </label>
                    </li>
                </ul>
            </fieldset>
            <fieldset class="submit">
                <input type="submit" class="button" value="提交">
            </fieldset>
            <div class="clear"></div>
        </form>
    </div>
</div>
</body>
</html>
