<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/9/15
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>模拟一个单个项目！！！ 只有一个界面</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
</head>
<body>
<div style="width: 800px;height: 1024px;border: red solid 1px">
    <a href="#addBusiness">添加业务</a> <br>
    业务列表
</div>

<a id="addBusiness" name="addBusiness">
    <div style="width: 800px;height: 1024px;border: green solid 1px">
        <h1>新增业务</h1>
        <form action="" method="post">
            业务类型 <select id="typeSelect" name="">
            <option value="1">信用卡</option>
            <option value="2">储蓄卡</option>
            <option value="3">vip卡</option>
        </select>
            <br>
            排队号 : <input type="text" name=""> <br>
            备注信息: <textarea name="" cols="30" rows="10"></textarea>
            <br>
            <input type="submit" value="确认增加">
        </form>

        <div>
            请选择你的英雄：
            <select id="heroSelect" name="">
                <option value="1">韩信</option>
                <option value="2">赵云</option>
                <option value="3">赔钱货</option>
            </select>
        </div>

    </div>
</a>


</body>
</html>
