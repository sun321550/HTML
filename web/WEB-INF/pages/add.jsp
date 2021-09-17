
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面</title>
    <script src="/layui-v2.5.6/layui/layui.js"></script>
    <link rel="stylesheet" href="/layui-v2.5.6/layui/css/layui.css">
</head>
<body>

<div class="layui-row">

    <form class="layui-form" action="" lay-filter="testform" onsubmit="return false">

        <div class="layui-form-item">
            <label class="layui-form-label">业务类型</label>
            <div class="layui-input-inline">
                <select name="interest" lay-filter="type" id="sel">
                    <option value="">请选择</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">排队号</label>
            <div class="layui-input-inline">
                <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入排队号" class="layui-input">
            </div>

        </div>
            <div class="layui-form-item layui-form-text">
                <label class="layui-form-label">备注信息</label>
                <div class="layui-input-block">
                    <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
                </div>
            </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
<%--                <button class="layui-btn" lay-submit lay-filter="formLogin">登录</button>--%>
                <button class="layui-btn" lay-submit lay-filter="formAdd">确认添加</button>
                <div class="layui-form-item">
                    <!--<input id="butt" type="button" value="注册" /><br><br><br>-->
                </div>
            </div>
        </div>

    </form>
</div>

<script type="text/javascript">
    layui.use(['form' ,'jquery' ],function(args){

        var form = layui.form;
        var $ = layui.jquery;

        $(document).ready(function () {
            $.ajax({
                elem:'#test',
                url:'/type/selectAll',
                type:'POST',
                dataType:'JSON',
                success: function(res) {
                    console.log(res);
                    $.each(res.data, function(index, value) {
                        console.log(value.typeId)
                        console.log(value.typeName)
                        // $("#").append("<option value="+value.typeId+">"+value.typeName+"</option>")
                        $("#sel").append("<option value="+value.typeId+">"+value.typeName+"kkk</option>")
                    })

                }
            })
        });
    })
</script>
</body>
</html>
