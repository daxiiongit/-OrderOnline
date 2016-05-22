<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/22 0022.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="/admin/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/admin/js/jquery.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>


</head>


<body>

<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">
            <li class="click"><span><img src="/admin/images/t01.png"/></span>
                <a href="toSaveMeal.action" target="rightFrame">添加</a></li>
            <li class="click"><span><img src="/admin/images/t02.png" /></span>修改</li>
            <li><span><img src="/admin/images/t03.png" /></span>删除</li>
            <li><span><img src="/admin/images/t04.png" /></span>统计</li>
        </ul>


        <ul class="toolbar1">
            <li><span><img src="/admin/images/t05.png" /></span>设置</li>
        </ul>

    </div>

    <table class="tablelist">
        <thead>
        <tr>
            <th>编号<i class="sort"><img src="/admin/images/px.gif" /></i></th>
            <th>菜品名称</th>
            <th>单价</th>
            <th>数量</th>
            <th>总价</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="listOrderdts" items="${ordersVo.orderdtsCustomList}">
            <tr>
                <td>${listOrderdts.id}</td>
                <td>${listOrderdts.mealCustom.mealname}</td>
                <td>${listOrderdts.price}</td>
                <td>${listOrderdts.mealcount}</td>
                <td>${listOrderdts.ordersCustom.orderprice}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');

</script>

</body>

</html>

