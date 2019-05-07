<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>layout 后台大布局 - Layui</title>
    <link rel="stylesheet" href="${ctx}/static/common/layui/css/layui.css">

    <link rel="stylesheet" href="${ctx}/static/main/adduser.css">
    <script src="${ctx}/static/common/js/jquery-1.8.3.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">

    <jsp:include page="${ctx}/model/header.jsp"/>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div class="cont">
            <div class="user">
                <div>货物编号</div>
                <input id="id" type="text" name="gId"  placeholder="货物编号" maxlength="10">
            </div>

            <div class="user">
                <div>货物名称</div>
                <input id="name" type="text" name="gName" maxlength="11" placeholder="货物名称">
            </div>

            <div class="user">
                <div>货物类型</div>
                <input id="gkind" type="text" name="gKind" maxlength="50" placeholder="货物类型">
            </div>

            <div class="user">
                <div>货物重量</div>
                <input id="gweight" type="text" name="gWeight" maxlength="50" placeholder="货物重量">
            </div>

            <input type="button" value="添加货物" class="layui-btn layui-btn-primary" style="width: 330px" onclick="check()"/>
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

    function check() {
        var id=$("#id").val();
        var name=$("#name").val();
        var gkind=$("#gkind").val();
        var gweight=$("#gweight").val();

        if (id===''||name===''||gkind===''||gweight===''){
            alert("请填写信息");
        }

        var goods=JSON.stringify({
            "gId":id,
            "gName":name,
            "gKind":gkind,
            "gWeight":gweight
        });

        $.ajax({
            url:"${ctx}/good/add",
            type:"post",
            dataType:"json",
            contentType: "application/json; charset=utf-8",
            data:goods,
            success:function () {
                alert("添加成功");
                $("#id").val("");
                $("#name").val("");
                $("#gkind").val("");
                $("#gweight").val("");
            },
            error:function () {
                alert("添加失败");
            }
        })
    }
</script>
</body>
</html>