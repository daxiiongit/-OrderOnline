<%--
    Description: 代码

    Created by daxiongit on 2016/5/15 0015.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="/admin/css/style.css" rel="stylesheet" type="text/css" />

    <link href="/admin/css/select.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/admin/js/jquery.js"></script>
    <script type="text/javascript" src="/admin/js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="/admin/js/select-ui.min.js"></script>
    <script type="text/javascript" src="/admin/editor/kindeditor.js"></script>

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

    <ul class="seachform1">
        <li><label>菜品名称</label><input name="mealname" type="text" class="scinput1" id="mealname" value="${mealname}"/>
            &nbsp;&nbsp; 菜系名称<input name="seriesname" type="text" class="scinput1" id="seriesname" value="${seriesname}"/>
        </li>
        <li class="sarchbtn"><label>&nbsp;</label><input name="" type="button" class="scbtn" value="查询" onclick="queryByName();"/></li>
    </ul>

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
            <th>价格</th>
            <th>菜系名称</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="listMeal" items="${mealList}">
            <tr>
                <td>${listMeal.id}</td>
                <td>${listMeal.mealname}</td>
                <td>${listMeal.mealprice}</td>
                <td>${listMeal.mealseriesCustom.seriesname}</td>
                <td>
                    <%--<a href="toUpdateMeal.action?id=${listMeal.id}" class="tablelink" target="rightFrame">修改</a>--%>
                    <a href="javascript:void(0)" class="tablelink" target="rightFrame" name="editml" onclick="editml(${listMeal.id},${mealCustom.page.currentPage});">修改</a>
                    <a href="javascript:void(0)" class="tablelink" name="deleteml" onclick="deleteml(${listMeal.id},${mealCustom.page.currentPage});">删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
        <%-- 分页公共页面 --%>
        <%--<tr align="center">
            <td colspan="5">
                <a href="query_meal.action?currentPage=1">首页</a>
                <a href="query_meal.action?currentPage=${mealCustom.page.prePage}">上页</a>
                <a href="query_meal.action?currentPage=${mealCustom.page.nextPage}">下页</a>
                <a href="query_meal.action?currentPage=${mealCustom.page.pageCount}">末页</a>
                当前页${mealCustom.page.currentPage}/${mealCustom.page.pageCount}
                &nbsp;
                总记录数${mealCustom.page.totalCount}
            </td>
        </tr>--%>
        <jsp:include page="/admin/common.jsp"/>
    </table>

</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');

    // 验证是否删除菜系
    function deleteml(id,currentPage){
        if(confirm("确定要删除么？")){
            window.location.href = "delete_meal.action?id=" + id + "&" + "currentPage" + "=" + currentPage ;
            return true;
        }else{
            return false;
        }
    }

    // 更新菜品
    function editml(id,currentPage){
        window.location.href = "toUpdateMeal.action?id=" + id + "&" + "currentPage" + "=" + currentPage;
    }

    // 模糊查询菜品
    function queryByName(){
        var mealname = $("#mealname").val();
        var seriesname = $("#seriesname").val();

        if ((mealname != '' && mealname != null) || (seriesname != '' && seriesname != null)) {
            window.location.href = "query_mealname.action?mealname=" + mealname + "&" + "seriesname" + "=" + seriesname;
        }else{
            window.location.href = "query_meal.action";
        }
    }

</script>

</body>

</html>
