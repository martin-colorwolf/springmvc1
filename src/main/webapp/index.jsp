<html>
<body>


<br><br>

<form action="/springmvc/testPojo" method="get">

    username: <input type="text" name="username">
    <br>
    password: <input type="password" name="password">
    <br>
    province<input type="text" name="address.province">
    <br>
    city<input type="text" name="address.city">
    <br>
    <input type="submit" value="提交">

</form>



<br><br>
<a href="/springmvc/testRequestParam?username=wang&age=10 ">Test RequestParam Get</a>

<br><br>

<form action="/springmvc/testRest/1" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="testRest PUT"/>
</form>

<br><br>

<form action="/springmvc/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="testRest DELETE"/>
</form>

<br><br>

<form action="/springmvc/testRest" method="post">
    <input type="submit" value="testRest post"/>
</form>

<br><br>
<a href="/springmvc/testRest/1">Test Rest Get</a>
<br><br>

<br><br>
<a href="/springmvc/testPathVariabel/1">testPathVariabel</a>
<br><br>
<form action="/springmvc/testMethod" method="post">
    <input type="submit" value="submit"/>
</form>
<br><br>
<a href="/springmvc/testRequestMapping"> Test RequestMapping</a>
<br><br>
<a href="helloworld">Hello World!</a>
</body>
</html>
