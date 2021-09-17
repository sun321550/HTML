<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/9/17
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<div id="box">
    <!--绑定send方法-->
    <button @click="send">发送ajax请求</button>
</div>


<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
    new Vue({
        el:"#box",
        methods:{
            send(){
                axios({
                    method: "get",  //请求方法get
                    url: "user.json"  //在同等目录下创建一个user.json => {"name":"帅高高","age":23}
                }).then(resp => {    //请求成功后返回
                    console.log(resp);
            }).catch(error => {   //请求失败后的返回
                    console.log(error);
            }).then(function(){    //相当于finally，一定执行
                    console.log("不管怎么样都要执行");
                });
            }
        }
    })
</script>
</body>

</html>
