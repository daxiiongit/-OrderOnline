<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/21 0021.
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
    <script type="text/javascript" src="/admin/js/jquery.idTabs.min.js"></script>
    <script type="text/javascript" src="/admin/js/select-ui.min.js"></script>
    <script type="text/javascript" src="/admin/editor/kindeditor.js"></script>

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

    <ul class="seachform1">
        <li class="sarchbtn"><label>&nbsp;</label><input name="" type="button" class="scbtn" value="未接单" onclick="queryWJ();"/>
            <input name="" type="button" class="scbtn" value="已接单" onclick="queryWP();"/>
            <input name="" type="button" class="scbtn" value="已配送" onclick="queryYP();"/>
            <input name="" type="button" class="scbtn" value="已完成" onclick="queryYW();"/>
        </li>
        <%--<li class="sarchbtn"><label>&nbsp;</label><input name="" type="button" class="scbtn" value="已接单" onclick="queryWJ();" id="statewp"/></li>
        <li class="sarchbtn"><label>&nbsp;</label><input name="" type="button" class="scbtn" value="已配送" onclick="queryWJ();" id="stateyp"/></li>
        <li class="sarchbtn"><label>&nbsp;</label><input name="" type="button" class="scbtn" value="已完成" onclick="queryWJ();" id="stateyw"/></li>--%>
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
            <th>用户名</th>
            <th>订单时间</th>
            <th>价格</th>
            <th>订单状态</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="ordersList" items="${ordersVo.ordersList}">
            <tr>
                    <%-- <td><input name="" type="checkbox" value="" /></td>--%>
                <td>${ordersList.id}</td>
                <td>${ordersList.users.loginname}</td>
                <td>${ordersList.ordertime}</td>
                <td>${ordersList.orderprice}</td>
                <td>
                    <c:if test="${ordersList['orderstate'] == 0}" var="isOk">
                        未接单
                    </c:if>
                    <c:if test="${ordersList['orderstate'] == 1}">
                        已接单，未配送
                    </c:if>
                    <c:if test="${ordersList['orderstate'] == 2}">
                        正在配送
                    </c:if>
                    <c:if test="${ordersList['orderstate'] == 3}">
                        完成订单
                    </c:if>
                </td>
                <td>
                    <a href="alertState.action?id=${ordersList.id}&orderstate=${ordersList.orderstate}" class="tablelink" target="rightFrame">
                        <c:if test="${ordersList['orderstate'] == 0}">
                            接订单
                        </c:if>
                        <c:if test="${ordersList['orderstate'] == 1}">
                            开始配送
                        </c:if>
                        <c:if test="${ordersList['orderstate'] == 2}">
                            完成订单
                        </c:if>
                    </a>
                    <a href="query_orderdts.action?id=${ordersList.id}" class="tablelink" target="rightFrame">查看明细</a>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');

    // 模糊查询菜品
    function queryWJ(){
        window.location.href = "query_orderstate.action?orderstate=" + 0;
    }
    function queryWP(){
        window.location.href = "query_orderstate.action?orderstate=" + 1;
    }
    function queryYP(){
        window.location.href = "query_orderstate.action?orderstate=" + 2;
    }
    function queryYW(){
        window.location.href = "query_orderstate.action?orderstate=" + 3;
    }

</script>

</body>

</html>
