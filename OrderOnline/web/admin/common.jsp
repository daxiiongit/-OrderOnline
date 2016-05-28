<%--
    Description: 代码
     
    Created by daxiongit on 2016/5/28 0028.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<tr align="center">
    <td colspan="5">
        <a href="query_meal.action?currentPage=1">首页</a>
        <a href="query_meal.action?currentPage=${mealCustom.page.prePage}">上页</a>
        <a href="query_meal.action?currentPage=${mealCustom.page.nextPage}">下页</a>
        <a href="query_meal.action?currentPage=${mealCustom.page.pageCount}">末页</a>
        当前页${mealCustom.page.currentPage}/${mealCustom.page.pageCount}
        &nbsp;
        总记录数${mealCustom.page.totalCount}
    </td>
</tr>
