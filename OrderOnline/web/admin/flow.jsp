<%--
    Description: 代码

    Created by daxiongit on 2016/5/15 0015.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

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

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">流程图</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
   
   <div class="formtitle1"><span>流程图</span></div>
   
   
   <ul class="flow">
   <li><span><img src="/admin/images/lc01.png" alt="1111" /></span><a href="#">立项信息登记</a><i>(21)</i><div class="flowjt"></div></li>
   <li><span><img src="/admin/images/lc02.png" alt="1111" /></span><a href="#">学院审核</a><i>(3)</i><div class="flowjt"></div></li>
   <li><span><img src="/admin/images/lc03.png" alt="1111" /></span><a href="#">科研处审核</a><i>(0)</i><div class="flowjt"></div></li>
   <li><span><img src="/admin/images/lc04.png" alt="1111" /></span><a href="#">过程信息填报</a><i>(3)</i><div class="flowjt"></div></li>
   <li><span><img src="/admin/images/lc05.png" alt="1111" /></span><a href="#">验收信息填报</a><i>(2)</i><div class="flowjt"></div></li>
   <li><span><img src="/admin/images/lc06.png" alt="1111" /></span><a href="#">项目结项</a><i>(1)</i></li>
   </ul>
    
    
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>

</html>
