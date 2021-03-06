<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/28 0028.
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

    <script type="text/javascript">
        /** 请求json，输出json **/
        function requestJson(){
            alert(1);
            $.ajax({
                /** 请求方式，post/get **/
                type:'post',
                /** 请求地址 **/
                url:'${pageContext.request.contextPath }/requestJson.action',
                /** 请求内容格式，json或者key/value **/
                contentType:'application/json;charset=utf-8',
                /** 请求数据内容 **/
                data:'{"mealname":"牛肉","mealsummarize":"很好处","mealprice":105.23}',
                /** 放回数据处理方法 **/
                success:function(data){
                    alert("菜品名称：" + data.mealname + "摘要：" + data.mealsummarize + "价格：" + data.mealprice);
                }
            });
        }

        /** 请求key/value，输出json **/
        function responseJson(){
            alert(1);
            $.ajax({
                /** 请求方式，post/get **/
                type:'post',
                /** 请求地址 **/
                url:'${pageContext.request.contextPath }/responseJson.action',
                /** 请求内容格式，json或者key/value **/
                /*contentType:'application/Json;charset=utf-8',*/
                /** 请求数据内容 **/
                data:'mealname=牛肉&mealsummarize=摘要&mealprice=120.3',
                /** 放回数据处理方法 **/
                success:function(data){
                    alert("菜品名称：" + data.mealname + "摘要：" + data.mealsummarize + "价格：" + data.mealprice);
                }
            });
        }

    </script>

</head>


<body>


<br>
<br>
<br>

<%--
    测试json数据交互
--%>

<input type="button" name="requestJson" onclick="requestJson();" value="接口方式">
<br><br>
<input type="button" name="responseJson" onclick="responseJson();" value="html方式">
<br><br>
<br>

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
        <c:forEach var="listMeal" items="${mealVo.mealCustomList}">
            <tr>
                    <%-- <td><input name="" type="checkbox" value="" /></td>--%>
                <td>${listMeal.id}</td>
                <td>${listMeal.mealname}</td>
                <td>${listMeal.mealprice}</td>
                <td>${listMeal.mealseriesCustom.seriesname}</td>
                <td><a href="toUpdateMeal.action?id=${listMeal.id}" class="tablelink" target="rightFrame">修改</a>
                    <a href="javascript:void(0)" class="tablelink" name="deleteml" onclick="deleteml(${listMeal.id});">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <tr align="center">
            <a href="meal_page.action?currentPage=1">首页</a>
            <a href="meal_page.action?currentPage=${mealCustom.page.prePage}">上页</a>
            <a href="meal_page.action?currentPage=${mealCustom.page.nextPage}">下页</a>
            <a href="meal_page.action?currentPage=${mealCustom.page.pageCount}">末页</a>
            当前页${mealCustom.page.currentPage}/${mealCustom.page.pageCount}
            &nbsp;
            总记录数${mealCustom.page.totalCount}
        </tr>
    </div>

</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');

    // 验证是否删除菜系
    function deleteml(id){
        if(confirm("确定要删除么？")){
            window.location.href = "delete_meal.action?id=" + id;
            return true;
        }else{
            return false;
        }
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

