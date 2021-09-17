<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/9/17
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="app">
    <%--form:post 加tab键--%>
    <form action="https://www.baidu.com" method="post"@Submit.prevent="onSubmit" id="myForm">
        账号：<input type="text" name="adminName"><br>
        密码：<input type="text" name="adminPwd"><br>
        <input type="submit" value="登录"><br>
    </form>

    <script>
        var vm = new Vue({
            el:'#app',
            methods:{
                //凡是事件都有个e
                onSubmit:function (e) {
                    console.log(e)
                    console.log(e.target)

                  var  form =  document.getElementById("myForm")
                    console.log(form)
                    //拿去form 表单中的数据
                    var formData = new FormData(form);//课下学习自己
                    console.log(formData.get('adminName'))//脱离了jQuery

                    //练习 引入axios 写个 Ajax 发送到  通过post 发送给百度


                    return false;
                }
            }
        });
    </script>
</div>

</body>
</html>
