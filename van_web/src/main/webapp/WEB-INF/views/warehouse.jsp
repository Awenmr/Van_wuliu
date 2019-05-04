<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="${ctx}/static/common/layui/css/layui.css">
</head>
<style>

    .table_order{
        width: 600px;
        height: 300px;
        margin: 60px auto;
        border: 1px solid black;
    }
    .table_order td{
        width: 50px;
        height: 30px;
        border: 1px solid black;
    }
    .bottom{
        margin: 0 auto;
    }
</style>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <jsp:include page="${ctx}/model/header.jsp"/>


    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">仓库查询</div>
        <table class="table_order">
            <tr>
                <td>仓库编号</td>
                <td>仓库名称</td>
                <td>仓库容量</td>
            </tr>

            <c:forEach items="${warelist}" var="ware">
                <tr>
                    <td>${ware.ckId}</td>
                    <td>${ware.ckName}</td>
                    <td>${ware.ckSize}</td>
                </tr>
            </c:forEach>
        </table>
        <div class="bottom">
            <a href="${pageContext.request.contextPath}/warehouse/findAllWarehouse?param=${currentPage-1}">上一页</a>
            <span>${currentPage}</span>
            <span>/</span>
            <span>${totalpage}</span>
            <a href="${pageContext.request.contextPath}/warehouse/findAllWarehouse?param=${currentPage+1}">下一页</a>
        </div>
    </div>

    <jsp:include page="${ctx}/model/footer.jsp"/>
</div>
<script src="${ctx}/static/common/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>