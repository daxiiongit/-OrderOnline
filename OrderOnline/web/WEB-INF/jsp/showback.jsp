<%--
    Description: 代码

    Created by daxiongit on 2016/5/15 0015.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>网上订餐系统</title>

    <script type="text/javascript">
        //菜单展开收起控制
        var obj = null;
        $(function () {
            $('.nav-header').click(function () {
                if (obj != $(this).html()) {
                    $('.sidebar-nav > ul').each(function () {
                        $(this).removeClass("in");
                        $(this).attr('style', 'height: 0;');
                    });
                    obj = $(this).html();
                }
            });
        });
    </script>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <include file="Common/common"/>

    <!-- Demo page code -->

    <style type="text/css">
        #line-chart {
            height: 300px;
            width: 800px;
            margin: 0px auto;
            margin-top: 1em;
        }

        .brand {
            font-family: georgia, serif;
        }

        .brand .first {
            color: #ccc;
            font-style: italic;
        }

        .brand .second {
            color: #fff;
            font-weight: bold;
        }

        .dropdown-submenu-page:hover > a {
            background-color: transparent;
            background-image: linear-gradient(to bottom, transparent, transparent);
            background-repeat: repeat-x;
            color: #ffffff;
            text-decoration: none;
        }
    </style>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->

</head>

<!--[if lt IE 7 ]>
<body class="ie ie6"> <![endif]-->
<!--[if IE 7 ]>
<body class="ie ie7 "> <![endif]-->
<!--[if IE 8 ]>
<body class="ie ie8 "> <![endif]-->
<!--[if IE 9 ]>
<body class="ie ie9 "> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<body class="">
<!--<![endif]-->

<div class="navbar">
    <div class="navbar-inner">
        <a class="brand" href="#">
            <span class="second">网上订餐系统</span>
        </a>
        <div style="float: right;">
            <ul class="nav nav-pills" style="float: right;margin-right: 30px;">
                <li class="dropdown"><a href="#" data-toggle="dropdown" style="border-radius:0px;margin: 2px 0px;"
                                        class="dropdown-toggle"><i
                        class="icon-user"></i> <%--管理员{{$_SESSION['userInfo']['nickname']}}{{$_SESSION['userInfo']['name']}}--%>
                </a>
                    <ul class="dropdown-menu" style="width: 120px;min-width: 90px;">
                        <!-- <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li> -->
                        <%--<li><a href="__APP__/Login/detailOpenCity" class="touch"><i class="icon-off"></i>切换城市</a></li>--%>
                        <li><a href="__APP__/Login/loginOut" class="touch"><i class="icon-off"></i>退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>


<div class="sidebar-nav" style="height: 600px;overflow-y:auto;">
    <!-- <a href="#dashboard-menu" class="nav-header" data-toggle="collapse"><i
        class="icon-gift"></i>奖品管理</a>
    <ul id="dashboard-menu" class="nav nav-list collapse ">
        <li><a href="__APP__/Prize/prizeList" target="mainFrame">奖品列表</a></li>
        <li><a href="__APP__/TopPrize/topPrizeList" target="mainFrame">大奖列表</a></li>
    </ul> -->
    <a href="#dashboard-menu" class="nav-header" data-toggle="collapse">&nbsp;<i class="icon-eye-open"></i>管理员管理</a>
    <ul id="dashboard-menu" class="nav nav-list collapse ">
        <li><a href="__APP__/SysUser/init" target="mainFrame">用户列表</a></li>
        <li><a href="__APP__/Role/init" target="mainFrame">用户组管理</a></li>
        <li><a href="__APP__/Privilege/init" target="mainFrame">权限管理</a></li>

    </ul>

    <a href="#icon-user" class="nav-header" data-toggle="collapse">&nbsp;<i
            class="icon-user"></i>菜品管理</a>
    <ul id="icon-user" class="nav nav-list collapse">
        <li><a href="__APP__/Duty/dutyList" target="mainFrame">菜品列表</a></li>
    </ul>

</div>


<div class="content">
    <iframe id="mainFrame" name="mainFrame" scrolling="yes" height="100%"
            style="width: 100%; overflow-x: hidden; overflow-y: hidden; background-color: transparent;"
            frameborder="0" src="welcome.html"></iframe>

    <!-- 		  <footer> -->
    <!--                         <hr> -->

    <!--                         Purchase a site license to remove this link from the footer: http://www.portnine.com/bootstrap-themes -->
    <!--                         <p class="pull-right">A <a href="#" target="_blank">Free Bootstrap Theme</a> by <a href="http://www.portnine.com" target="_blank">Portnine</a></p> -->

    <!--                         <p>© 2012 <a href="#" target="_blank">Portnine</a></p> -->
    <!--                     </footer> -->

</div>
</body>
</html>