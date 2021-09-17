<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/9/16
  Time: 16:20
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
    <%--Vue 需要一个 根目录的标签--%>
    <%--讲解一个概念 双向绑定 数据和页面的 展示的数据效果 是一起的保持一致的--%>
    姓名（以前的这么写）<input type="text" value="孙乾力"><br>
        <%--vue 核心是 把数据渲染的到HTML中 分为 标签 和文本 那么文本 是用插值表达式--%>

        姓名：{{name}}<br>
        <%--v-bind 是绑定标签的属性的 已经绑定 数据就是动态的 就要写data 的key--%>
        vue -- 姓名 （以前这么写的）：<input type="text" v-bind:value="name"><br>
                <%--以上是数据的单向绑定  数据绑定到了 显示效果--%>
        vue -- 姓名 双项绑定：<input type="text" v-model="name"><br>
        v-model 双项绑定 作用在 4个范围上 input 标签  select标签 textarea标签 
            <%--v-model 是 v-bind的升级版 其本质是一个语法糖 什么是 语法糖 --%>
    <%--java中 for 循环就是一个语法糖 for循环的本质就是while 循环 语法糖就是简化了书写--%>

</div>
<script>
    var vm=new Vue({
        el:'#app',
        data:{
            name:'孙乾力1'
        }
    });
</script>
</body>
</html>
