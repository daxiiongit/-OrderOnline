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
                    <a href="javascript:void(0)" class="tablelink" name="deleteml" onclick="deleteml(${listMeal.id});">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <%--    <div class="pagin">
            <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
            <ul class="paginList">
                <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
                <li class="paginItem"><a href="javascript:;">1</a></li>
                <li class="paginItem current"><a href="javascript:;">2</a></li>
                <li class="paginItem"><a href="javascript:;">3</a></li>
                <li class="paginItem"><a href="javascript:;">4</a></li>
                <li class="paginItem"><a href="javascript:;">5</a></li>
                <li class="paginItem more"><a href="javascript:;">...</a></li>
                <li class="paginItem"><a href="javascript:;">10</a></li>
                <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
            </ul>
        </div>--%>


    <%--    <div class="tip">
            <div class="tiptop"><span>提示信息</span><a></a></div>

            <div class="tipinfo">
                <span><img src="/admin/images/ticon.png" /></span>
                <div class="tipright">
                    <p>是否确认对信息的修改 ？</p>
                    <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
                </div>
            </div>

            <div class="tipbtn">
                <input name="" type="button"  class="sure" value="确定" />&nbsp;
                <input name="" type="button"  class="cancel" value="取消" />
            </div>

        </div>--%>


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

</script>

</body>

</html>
