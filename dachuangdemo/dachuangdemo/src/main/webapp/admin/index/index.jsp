<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
	<head>
		<meta charset="UTF-8">
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>网站后台管理模版</title>
		<link rel="stylesheet" type="text/css" href="../../static/admin/layui/css/layui.css"/>
		<link rel="stylesheet" type="text/css" href="../../static/admin/css/admin.css"/>
		<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=bsxCBvP3AGUAR1nksyvfawk6ebI7IqWr"></script>
		<script type="text/javascript" src="http://api.map.baidu.com/library/Heatmap/2.0/src/Heatmap_min.js"></script>
	</head>
	<script type="text/javascript">hotData=${hot}</script>
	<body>
		<div class="main-layout" id='main-layout'>
			<!--侧边栏-->
			<div class="main-layout-side">
				<div class="m-logo">
				</div>
				<ul class="layui-nav layui-nav-tree" lay-filter="leftNav">
				  <li class="layui-nav-item layui-nav-itemed">
				    <a href="javascript:;"><i class="iconfont">&#xe607;</i>数据管理</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;" data-url="/page1_1" data-id='1' data-text="楼盘基本数据"><span class="l-line"></span>楼盘基本数据</a></dd>
				      <dd><a href="javascript:;" data-url="/page1_2" data-id='2' data-text="用户点评数据"><span class="l-line"></span>用户点评数据</a></dd>
				    </dl>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe608;</i>图形化展示</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;" data-url="/page2_1" data-id='3' data-text="楼盘基本数据"><span class="l-line"></span>楼盘基本数据</a></dd>
				      <dd><a href="javascript:;" data-url="/page2_2" data-id='9' data-text="散点图"><span class="l-line"></span>用户点评数据</a></dd>
						<dd><a href="javascript:;" data-url="/page2_3" data-id='10' data-text="城市房价热力图"><span class="l-line"></span>城市房价热力图</a></dd>
					</dl>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe604;</i>推荐位管理</a>
				  </li>
				   <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe60c;</i>友情链接</a>
				  </li>
				   <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe60a;</i>RBAC</a>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;" data-url="/email" data-id='4' data-text="邮件系统"><i class="iconfont">&#xe603;</i>邮件系统</a>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe60d;</i>生成静态</a>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;"><i class="iconfont">&#xe600;</i>备份管理</a>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;" data-url="/person" data-id='5' data-text="个人信息"><i class="iconfont">&#xe606;</i>个人信息</a>
				  </li>
				  <li class="layui-nav-item">
				  	<a href="javascript:;" data-url="/system" data-id='6' data-text="系统设置"><i class="iconfont">&#xe60b;</i>系统设置</a>
				  </li>
				</ul>
			</div>
			<!--右侧内容-->
			<div class="main-layout-container">
				<!--头部-->
				<div class="main-layout-header">
					<div class="menu-btn" id="hideBtn">
						<a href="javascript:;">
							<span class="iconfont">&#xe60e;</span>
						</a>
					</div>
					<ul class="layui-nav" lay-filter="rightNav">
					  <li class="layui-nav-item"><a href="javascript:;" data-url="/email" data-id='4' data-text="邮件系统"><i class="iconfont">&#xe603;</i></a></li>
					  <li class="layui-nav-item">
					    <a href="javascript:;" data-url="/person" data-id='5' data-text="个人信息">超级管理员</a>
					  </li>
					  <li class="layui-nav-item"><a href="javascript:;">退出</a></li>
					</ul>
				</div>
				<!--主体内容-->
				<div class="main-layout-body">
					<!--tab 切换-->
					<div class="layui-tab layui-tab-brief main-layout-tab" lay-filter="tab" lay-allowClose="true">
					  <ul class="layui-tab-title">
					    <li class="layui-this welcome">后台主页</li>
					  </ul>
					  <div class="layui-tab-content">
					    <div class="layui-tab-item layui-show" style="background: #f5f5f5;">
							<jsp:include page="welcome.jsp"></jsp:include>
					    </div>
					  </div>
					</div>
				</div>
			</div>
			<!--遮罩-->
			<div class="main-mask">
				
			</div>
		</div>
		<%--<script type="text/javascript">--%>
			<%--var scope={--%>
				<%--link:'./welcome.jsp'--%>
			<%--}--%>
		<%--</script>--%>
		<script src="../../static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../static/admin/js/common.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../static/admin/js/main.js" type="text/javascript" charset="utf-8"></script>
		
	</body>
</html>
