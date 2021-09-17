<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/9/16
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="//cdn.bootcss.com/vue/2.5.2/vue.min.js"></script>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<div id="app">
    <select  v-on:change="showhuluwa()" id="a">
        <option >请选择</option>
        <option v-for="(item,index) in hulus" :key="hulus.id" >{{item.name}} </option>
    </select>
    技能：<span id="c"></span></br>
        <%--v-show 如果 为false 那么 前端界面 是不显示代码的--%>
    <%--v-show 不支持<template></template>元素--%>
    <span v-show="ok">你看到我了吗</span>
</div>
<script>
    var vm=new Vue({
        el:'#app',
        data:{
            hulus:[{
                id:1,
                name:'大娃',
                spell:'变大，力大无穷'
            },{
                id:2,
                name:'二娃',
                spell:'千里眼，顺风耳'
            },{
                id:3,
                name:'三娃',
                spell:'铜头铁臂'
            },{
                id:4,
        name:'四娃',
        spell:'喷火'
    },
                {
                    id:5,
                    name:'五娃',
                    spell:'吐水'
                },
                {
                    id:6,
                    name:'六娃',
                    spell:'隐身'
                }]
        },
        methods:{
            showhuluwa:function () {
                // alert("大娃")
                var b= $("#a :selected").val();
                if(b=='大娃'){
                    $("#c").empty();
                    $("#c").append("力大无穷")
                    //console.log(this.hulus)
                }else if(b=="二娃"){
                    $("#c").empty();
                    $("#c").append("千里眼，顺风耳")
                }else if(b=='三娃'){
                    $("#c").empty();
                    $("#c").append("铜头铁臂")
                }else if(b=='四娃'){
                    $("#c").empty();
                    $("#c").append("喷火")
                }else if(b=='五娃'){
                    $("#c").empty();
                    $("#c").append("吐水")
                }else if(b=='六娃'){
                    $("#c").empty();
                    $("#c").append("隐身")
                }else if(b=='请选择'){
                    $("#c").empty();
                }
                console.log(b)


            }
        }
    })
</script>
</body>
</html>

