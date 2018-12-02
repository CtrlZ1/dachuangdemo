<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>房屋信息管理系统</title>


	<link href="../static/resources/Hplus-v.3.2.0/css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
	<link href="../static/resources/Hplus-v.3.2.0/css/font-awesome.min.css?v=4.3.0" rel="stylesheet">
	<link href="../static/resources/Hplus-v.3.2.0/css/animate.css" rel="stylesheet">
	<link href="../static/resources/Hplus-v.3.2.0/css/plugins/sweetalert/sweetalert.css" rel="stylesheet">
	<link href="../static/resources/Hplus-v.3.2.0/css/style.css?v=3.2.0" rel="stylesheet">
	<link href="../static/resources/Hplus-v.3.2.0/css/index.css" rel="stylesheet">
	<link href="../static/resources/jQuery.filer-1.2/css/jquery.filer.css" rel="stylesheet" type="text/css"/>
	<link href="../static/resources/jQuery.filer-1.2/css/custom.css" rel="stylesheet" type="text/css"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

	<script src="../static/resources/Hplus-v.3.2.0/js/jquery-2.1.1.min.js"></script>
	<script src="../static/resources/jQuery.filer-1.2/js/jquery.filer.js" type="text/javascript"></script>
	<script src="../static/resources/jquery-easyui/jquery.easyui.min.js" type="text/javascript"></script>
	<script src="../static/resources/Hplus-v.3.2.0/js/bootstrap.min.js?v=3.4.0"></script>
	<script src="../static/resources/login.js"></script>
</head>
<body class="signin">
<%--<img style="position:absolute;left:2%;top:3%;z-index:100" src="../static/resources/Hplus-v.3.2.0/img/yangxindian.png"/>--%>

<div style="position:absolute;z-index:1">
	<canvas id="canvas" style="width:5%;height:5%"></canvas>
</div>
<div class="signinpanel">
	<div class="row">
		<div class="col-sm-7">
			<div class="signin-info">

				<div class="m-b"></div>
				<h1><strong>管理员登陆</strong></h1>
				<h4>房屋信息管理系统</h4>
				<ul class="m-b">
					<li style="font-size: 16px"><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势一 &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp;稳定可靠
					</li>
					<li style="font-size: 16px"><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势二 &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp;简单易用
					</li>
					<li style="font-size: 16px"><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势三 &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp;长久维护
					</li>
					<li style="font-size: 16px"><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 优势四 &nbsp; &nbsp;
						&nbsp; &nbsp; &nbsp;提供售后
					</li>
				</ul>
				<strong>还没有账号？ <a href="/zhu/ce">立即注册&raquo;</a></strong>
			</div>
		</div>
		<div class="col-sm-5">
			<form id="loginForm">
				<h4 class="no-margins">管理员登录</h4>
				<input type="text" class="form-control uname" name="number" id="number" placeholder="学号" required=""/>
				<input type="password" class="form-control pword m-b" name="password" id="password" placeholder="密码"
					   required=""/>
				<div id="errorDiv" style="color:red;font-family:monospace;font-size:small"/>


				<button id="loginBtn" class="btn btn-success btn-block">登录</button>
			</form>
		</div>
	</div>
	<div class="signup-footer">
		<div class="pull-left">
			&copy; 2018 All Rights Reserved. 南区二舍养心殿
		</div>
	</div>
</div>




</body>

</html>
