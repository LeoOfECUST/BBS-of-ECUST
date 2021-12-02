<%--
  Created by IntelliJ IDEA.
  User: 19362
  Date: 2021/11/24
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<script>
    window.onload = function () {

        //步骤一:创建异步对象
        var ajax = new XMLHttpRequest();
        //步骤二:设置请求的url参数,参数一是请求的类型,参数二是请求的url,可以带参数,动态的传递参数starName到服务端
        ajax.open('get', '/ssm');
        //步骤三:发送请求
        ajax.send();
        //步骤四:注册事件 onreadystatechange 状态改变就会调用
        ajax.onreadystatechange = function () {
            if (ajax.readyState == 4 && ajax.status == 200) {
                //步骤五 如果能够进到这个判断 说明 数据 完美的回来了,并且请求的页面是存在的
                console.log(ajax.responseText);//输入相应的内容
                console.log(JSON.parse(ajax.responseText).title);
                console.log(document.getElementsByTagName("h2")[0])
                document.getElementsByTagName("h2")[0].innerText = JSON.parse(ajax.responseText).title;
            }
        }
    }
</script>
</body>
</html>