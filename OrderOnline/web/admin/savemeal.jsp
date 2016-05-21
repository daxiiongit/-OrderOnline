<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/20 0020.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="/admin/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">表单</a></li>
    </ul>
</div>

<div class="formbody">

    <div class="formtitle"><span>基本信息</span></div>

    <form action="saveMeal.action" method="post" target="rightFrame">
        <ul class="forminfo">
            <li><label>菜系列表</label>
               <%-- <form:select items="${msList}" path="mealseries.id" id="mealseries" itemValue="id" itemLabel="id"/>--%>

                <select name="mealseriesid" id="mealseriesid">
                    <c:forEach items="${msList }" var="msList">
                        <option value="${msList.id }"> ${msList.seriesname }</option>
                    </c:forEach>
                </select>
                <i>只可以选择一种菜系</i></li>
            <li><label>菜品名称</label><input name="mealname" type="text" class="dfinput" /><i>菜品</i></li>
            <li><label>价格</label><input name="mealprice" type="text" class="dfinput" /><i>价格</i></li>
            <li><label>描述</label><input name="mealdescription" type="text" class="dfinput" /><i>描述</i></li>
            <li><label>摘要</label><input name="mealsummarize" type="text" class="dfinput" /><i>摘要</i></li>
            <li><label>图片</label><input name="mealimage" type="text" class="dfinput" /><i>图片</i></li>
            <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存"/></li>
        </ul>
    </form>

</div>


</body>

</html>

