<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/9/15
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
<html>
<head>
    <title>第一个 vue demo</title>
</head>
<body>
<div>
    学习 插值表达式 {{}}
    vue 常用在 单个页面项目中， 什么叫做单个页面项目， 常用于手机移动端， 指的是 整个项目 只有1个 页面，
    通过  锚点 来 跳转。没有a标签， 这个锚点的跳转叫做 路由。
    单个页面项目 的优缺点
    优点： 都是html 代码运行流畅 ， 可以 有很多组件 可以重复使用。
    缺点： 不利于seo 百度的收录

</div>


        <h1>讲解jquery 和 我们的 vue 的不同</h1>
        <div>
            jquery:  他是 dom 驱动的， 所有看到页面 都要 一行一行的把 代码 写出来。 不是自动的。 手动的
                <h2 id="jq-helloWord">
                     <%--// 对比一下，在 div中 插入数据  你好，世界  --%>
                </h2>
        </div>

    <div id="app">
        vue 因为是单页面的， 所以 必须只有1个 根标签。 以上的 h1 和 div 都不归vue负责。 <br>
        插值表达式   他可以 直接 调用 js 中的  方法
        2. 他可以 进行计算
        3. 可以 拼接 就是和 计算 做相反的 事情
        4.插值表达式 显示 对象的格式 是 xxx点yyy
        5.插值表达式 可以做（三木）三元运算 非常重要
        <h2>
                    {{sayHello}} <br>
            {{sayHello}}  的 长度是 {{sayHello.length}}<br>
                    {{sayEating}} <br>
                    {{lightLine}} <br>
                    {{apple.pname}}的价格是：{{apple.price / 100}} 元/斤<br>
            当前{{apple.pname}}的价格是：{{apple.price / 100 +''+/ 100}} 元/斤<br>
            当前{{apple.pname}}的价格我  <br>

            <div v-if=" apple.price>2.5 ">
                <span style="color: red">太贵了</span>
            </div>
            <div v-else>
                <span style="color:green"> 好便宜啊</span>
            </div>

            当前{{apple.pname}}的价格我{{apple.price>2.5 ? '太贵了' ： '好便宜买买买' }}<br>
            <%--刚刚学完 Vue 的插值表达式 那么 知道  Vue 的 根本核心 是这样的 吧数据显示到前端--%>
            <%--如果 只是用 插值表达式 显示数据 那么 他的  显示数据的内容 大概就是4种如果想要--%>
            <%--达到效果更加.强的效果，那么插值表达式是.不能够满足的。.所以.就有了新的.方式，叫做﹒指令。--%>
            <%--因为前端界面是html的，插值表达式.他只能.对.文本信息.做出.数据的渲染。。。.没有.对.标签.--%>
            <%--做出数据的增强。那么我们就要学习更强的。.就是叫做指令!!!!! .用来弥补和增强.插值表达式的不足!!--%>
            <%--上边的 改变颜色 不太好做就使用 v- 前缀的特殊 attribute 指令 attribute 的值预期是单个--%>
            <%--JavaScript 表达式 v- for 是例外--%>
            <%--指令的职责 是 当 表达式的值改变时 将其产生 的连带影响 响应式的作用于DOM--%>
                <%--学习下面的 指令  v-text v-html--%>
            <%--v-text其实就是 插值表达式--%>
            <span v-text="apple.pname"></span>的价格是：{{apple.price / 100 +''+/ 100}} 元/斤<br>
            <span v-text="vtext"></span>
            <%--v-text 不编译 文本中的HTML 的信息--%>
            <span v-html="vhtml"></span>
            <%--v-html  编译 文本中的 HTML信息一般常用  场景是  年龄  等--%>
            <span>{{vtext}}</span><br>
            <%--也不编译--%>

        </h2>
    </div>

    <script>
        // 使用 jquery
        $(function () {
            $("#jq-helloWord").text("你好，世界") // jq 缺点： 数据没有统一的地方存储。
        })

        // 学习 vue ， vue 和 java 很像很像，
        var vue = new Vue({
            // new vue() 括弧中，小括弧中，一般放的都是 {} ， 而大括号就是 json ， 对象 ， k-v结构
            // 这个大括弧中 放的 就是  vue 的 选项，  选项在 vue 官网可以看到。 选项 有多少种呢 ？ 作业！
            // 作业： 写出  vue 选项的 思维导图！！
            el:'#app'  // 把html中的 div id 为 app 的 dom 元素 作为了 挂载点
                      // 什么叫做挂载点： vue 是以数据驱动的， new vue中都是诞生数据
                      // 有了数据， 就需要 一个 dom 元素，显示数据，  张三是元数据。
            ,data:{
                sayHello:'你好世界',
                sayEating:'加油，干饭',
                lightLine:'发射东东波',
                apple:{
                    pid:15,
                    pname:'红富士',
                    price:250//单价是元 显示前端后  显示 成 多少 分
                },
                vtext:'<h1>你看我是标题吗<h1>',
                vhtml:'<h1>你看我是标题吗<h1>',
            }
        });


    </script>

</body>
</html>
