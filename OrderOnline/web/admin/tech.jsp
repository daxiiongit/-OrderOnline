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

<script language="javascript">
	$(function(){
    $('.error').css({'position':'absolute','left':($(window).width()-490)/2});
	$(window).resize(function(){  
    $('.error').css({'position':'absolute','left':($(window).width()-490)/2});
    })  
});  
</script> 


</head>


<body style="background:#edf6fa;">

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">技术支持</a></li>
    </ul>
    </div>
    
    <div class="tech">
        
    <dl>    
    <dt>技术支持</dt>
    <dd><b>官方网站uimaker.com</b>&nbsp;&nbsp;&nbsp;&nbsp; QQ：32534386</dd>
    <dd><b>电子邮件</b>&nbsp;&nbsp;&nbsp;&nbsp;admin@uimaker.com</dd>
    <dd>交流QQ群：274722250</dd>
    </dl>
    
        
    </div>
    


</body>

</html>
