<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/9/15
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<%--<script src="https://unpkg.com/axios/dist/axios.min.js"></script>--%>
<html>
<head>
    <title>新增业务</title>
</head>
<body>
<h1>新增业务</h1>
<form action="" method="post">
    业务类型:<select name="" id="typeSelect">
    <option value="1">信用卡</option>
    <option value="2">储蓄卡</option>
    <option value="3">VIP卡</option>
</select>
    <br>
    排队号:<input type="text" name=""><br>
    备注信息:<textarea name="" cols="30" rows="10"></textarea>
    <br>
    <input type="submit" value="确认增加">

</form>

<div>
    <h1>葫芦户口本</h1>
    <ul id="hulu">
        <li>葫芦老娃</li>
        <li>葫芦大娃</li>
    </ul>
</div>
<script>
    $(function () {
        //使用高级版的 ajax,  axios  异步请求
        // 为给定 ID 的 user 创建请求
    //     axios.get('/type/selectAll')
    //         .then(function (response) {  //ajax 中的 success
    //             console.log(response.data.data);  //vue !!!
    //         })
    //         .catch(function (error) {  //ajax 中的 error
    //             console.log(error);
    //         });
    // });





        $.ajax({
            url:'/type/selectAll',
            type:'get',
            dataType:'json',
            success:function (res) {
                console.log(res.data)
                $("#typeSelect").empty();//把下拉框下面的数据清空
                //给id 为 typeSelect 遍历 渲染 数据
                $.each(res.data,function (index,item) {
                    var typeName=item.typeName;
                    var optionDom =$("<option value='1'>"+typeName+"</option>");
                    $("#typeSelect").append(optionDom);//ajax异步下拉框
                });
            }
        });

        //jquery 的 数据遍历    $.each(数组,方法( 数组索引)){}
        var hulu = new Array();
            hulu.push("小大娃")
            hulu.push("小二娃")
            hulu.push("小三娃")
            hulu.push("小四娃")
    console.log(hulu)
    $("#hulu").empty();
    $.each(hulu , function (index,value) {
        console.log(index)
        console.log(value)
        console.log("=====")
        $("#hulu").append($("<option  value='3'>"+value+"</option>"));

    })    })
</script>
</body>
</html>