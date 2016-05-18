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
<script language="JavaScript" src="/admin/js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson .header").click(function(){
		var $parent = $(this).parent();
		$(".menuson>li.active").not($parent).removeClass("active open").find('.sub-menus').hide();
		
		$parent.addClass("active");
		if(!!$(this).next('.sub-menus').size()){
			if($parent.hasClass("open")){
				$parent.removeClass("open").find('.sub-menus').hide();
			}else{
				$parent.addClass("open").find('.sub-menus').show();	
			}
			
			
		}
	});
	
	// 三级菜单点击
	$('.sub-menus li').click(function(e) {
        $(".sub-menus li.active").removeClass("active")
		$(this).addClass("active");
    });
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('.menuson').slideUp();
		if($ul.is(':visible')){
			$(this).next('.menuson').slideUp();
		}else{
			$(this).next('.menuson').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>系统数据菜单</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="/admin/images/leftico01.png" /></span>菜系管理
    </div>
    	<ul class="menuson">
        
       <%-- <li>
            <div class="header">
            <cite></cite>
            <a href="/admin/index.jsp" target="rightFrame">首页模版</a>
            <i></i>
            </div>
            <ul class="sub-menus">
            <li><a href="javascript:;">文件管理</a></li>
            <li><a href="javascript:;">模型信息配置</a></li>
            <li><a href="javascript:;">基本内容</a></li>
            <li><a href="javascript:;">自定义</a></li>
            </ul>
        </li>--%>
        
        <li>
            <div class="header">
            <cite></cite>
            <a href="/admin/index.jsp" target="rightFrame">菜系列表</a>
            <i></i>
            </div>                
            <ul class="sub-menus">
            <li><a href="${pageContext.request.contextPath }/query_mealseries.action" target="rightFrame">显示所有菜系</a></li>
            <li><a href="javascript:;">接口设置</a></li>
            </ul>
        </li>
        
        <%--<li class="active"><cite></cite><a href="/admin/right.jsp" target="rightFrame">数据列表</a><i></i></li>
        <li><cite></cite><a href="/admin/imgtable.jsp" target="rightFrame">图片数据表</a><i></i></li>
        <li><cite></cite><a href="/admin/form.jsp" target="rightFrame">添加编辑</a><i></i></li>
        <li><cite></cite><a href="/admin/imglist.jsp" target="rightFrame">图片列表</a><i></i></li>
        <li><cite></cite><a href="/admin/imglist1.jsp" target="rightFrame">自定义</a><i></i></li>
        <li><cite></cite><a href="/admin/tools.jsp" target="rightFrame">常用工具</a><i></i></li>
        <li><cite></cite><a href="/admin/filelist.jsp" target="rightFrame">信息管理</a><i></i></li>
        <li><cite></cite><a href="/admin/tab.jsp" target="rightFrame">Tab页</a><i></i></li>
        <li><cite></cite><a href="/admin/error.jsp" target="rightFrame">404页面</a><i></i></li>--%>
        </ul>    
    </dd>
        
    
  <%--  <dd>
    <div class="title">
    <span><img src="/admin/images/leftico02.png" /></span>其他设置
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="/admin/flow.jsp" target="rightFrame">流程图</a><i></i></li>
        <li><cite></cite><a href="/admin/project.jsp" target="rightFrame">项目申报</a><i></i></li>
        <li><cite></cite><a href="/admin/search.jsp" target="rightFrame">档案列表显示</a><i></i></li>
        <li><cite></cite><a href="/admin/tech.jsp" target="rightFrame">技术支持</a><i></i></li>
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="/admin/images/leftico03.png" /></span>编辑器</div>
    <ul class="menuson">
        <li><cite></cite><a href="#">自定义</a><i></i></li>
        <li><cite></cite><a href="#">常用资料</a><i></i></li>
        <li><cite></cite><a href="#">信息列表</a><i></i></li>
        <li><cite></cite><a href="#">其他</a><i></i></li>
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="/admin/images/leftico04.png" /></span>日期管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="#">自定义</a><i></i></li>
        <li><cite></cite><a href="#">常用资料</a><i></i></li>
        <li><cite></cite><a href="#">信息列表</a><i></i></li>
        <li><cite></cite><a href="#">其他</a><i></i></li>
    </ul>
    
    </dd>   --%>
    
    </dl>
    
</body>
</html>
