<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="renderer" content="webkit">
  		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>网站后台管理模版</title>
		<link rel="stylesheet" type="text/css" href="../../static/admin/layui/css/layui.css"/>
		<link rel="stylesheet" type="text/css" href="../../static/admin/css/admin.css"/>
		<script src="static/js/echarts.js"></script>
	</head>
	<body>
		<div class="wrap-container welcome-container">
			<div class="row">
				<div class="welcome-left-container col-lg-9">
					<div class="data-show">
						<ul class="clearfix">
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg bg-org f-l">
										<span class="iconfont">&#xe606;</span>
									</div>
									<div class="right-text-con">
										<p class="name">评论数</p>
										<p><span class="color-org">8987</span>数据<span class="iconfont">&#xe628;</span></p>
									</div>
								</a>
							</li>
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg bg-blue f-l">
										<span class="iconfont">&#xe602;</span>
									</div>
									<div class="right-text-con">
										<p class="name">房屋数</p>
										<p><span class="color-blue">4444</span>数据<span class="iconfont">&#xe628;</span></p>
									</div>
								</a>
							</li>
							<li class="col-sm-12 col-md-4 col-xs-12">
								<a href="javascript:;" class="clearfix">
									<div class="icon-bg bg-green f-l">
										<span class="iconfont">&#xe605;</span>
									</div>
									<div class="right-text-con">
										<p class="name">小区数</p>
										<p><span class="color-green">2596</span>数据<span class="iconfont">&#xe60f;</span></p>
									</div>
								</a>
							</li>
						</ul>
					</div>
					<!--图表-->
					<div class="chart-panel panel panel-default">
						<div class="panel-body" id="chart" style="height: 376px;">
							<div id="main" style="width:800px;height:400px"></div>

							<script type="text/javascript">
                                // 基于准备好的dom，初始化echarts实例，设置颜色风格
								getData=${data}
                                var myChart = echarts.init(document.getElementById('main'),'light');

                                // 指定图表的配置项和数据
                                var option = {
                                    title: {
                                        text: 'ECharts 入门示例'
                                    },
                                    tooltip: {
                                    },
                                    legend: {
                                        data: ['销量']
                                    },
                                    xAxis: {
                                        data: getData[0].xName//data: [5, 20, 36, 10, 10, 20, 100, 58]
                                    },
                                    yAxis: {},
                                    series: [{
                                        name: '销量',
                                        type: 'bar',
                                        data: getData[0].yValue
                                    }]
                                };
                                // 使用刚指定的配置项和数据显示图表。
                                myChart.setOption(option);
							</script>
						</div>
					</div>
					<!--服务器信息-->
					<div class="server-panel panel panel-default">
						<div class="panel-header">服务器信息</div>
						<div class="panel-body clearfix">
							<div class="col-md-2">
								<p class="title">服务器环境</p>
								<span class="info">Apache/2.4.4 (Win32) PHP/5.4.16</span>
							</div>
							<div class="col-md-2">
								<p class="title">服务器IP地址</p>
								<span class="info">127.0.0.1   </span>
							</div>
							<div class="col-md-2">
								<p class="title">服务器域名</p>
								<span class="info">localhost </span>
							</div>
							<div class="col-md-2">
								<p class="title"> PHP版本</p>
								<span class="info">5.4.16</span>
							</div>
							<div class="col-md-2">
								<p class="title">数据库信息</p>
								<span class="info">5.6.12-log </span>
							</div>
							<div class="col-md-2">
								<p class="title">服务器当前时间</p>
								<span class="info">2018-11-22 11:37:35</span>
							</div>
						</div>
					</div>
				</div>
				<div class="welcome-edge col-lg-3">
					<!--最新留言-->
					<!--联系-->
					<div class="panel panel-default contact-panel">
						<div class="panel-header">联系我们</div>
						<div class="panel-body">
							<p>QQ：8888888</p>
							<p>E-mail:8888888@qq.com</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="../../static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../static/admin/lib/echarts/echarts.js"></script>
		<%--<script type="text/javascript">--%>
			<%--layui.use(['layer','jquery'], function(){--%>
				<%--var layer 	= layui.layer;--%>
				<%--var $=layui.jquery;--%>
				<%--//图表--%>
				<%--var myChart;--%>
				<%--require.config({--%>
				    <%--paths: {--%>
				        <%--echarts: '../../static/admin/lib/echarts'--%>
				    <%--}--%>
				<%--});--%>
				<%--require(--%>
				    <%--[--%>
				        <%--'echarts',--%>
				        <%--'echarts/chart/bar',--%>
				        <%--'echarts/chart/line',--%>
				        <%--'echarts/chart/map'--%>
				    <%--],--%>
				    <%--function (ec) {--%>
				        <%--//--- 折柱 -----%>
				        <%--myChart = ec.init(document.getElementById('chart'));--%>
				        <%--myChart.setOption(--%>
				        	<%--{--%>
						     <%--title: {--%>
						        <%--text: "数据统计",--%>
						        <%--textStyle: {--%>
						            <%--color: "rgb(85, 85, 85)",--%>
						            <%--fontSize: 18,--%>
						            <%--fontStyle: "normal",--%>
						            <%--fontWeight: "normal"--%>
						        <%--}--%>
						    <%--},--%>
						    <%--tooltip: {--%>
						        <%--trigger: "axis"--%>
						    <%--},--%>
						    <%--legend: {--%>
						        <%--data: ["会员", "文章", "评论"],--%>
						        <%--selectedMode: false,--%>
						    <%--},--%>
						    <%--toolbox: {--%>
						        <%--show: true,--%>
						        <%--feature: {--%>
						            <%--dataView: {--%>
						                <%--show: false,--%>
						                <%--readOnly: true--%>
						            <%--},--%>
						            <%--magicType: {--%>
						                <%--show: false,--%>
						                <%--type: ["line", "bar", "stack", "tiled"]--%>
						            <%--},--%>
						            <%--restore: {--%>
						                <%--show: true--%>
						            <%--},--%>
						            <%--saveAsImage: {--%>
						                <%--show: true--%>
						            <%--},--%>
						            <%--mark: {--%>
						                <%--show: false--%>
						            <%--}--%>
						        <%--}--%>
						    <%--},--%>
						    <%--calculable: false,--%>
						    <%--xAxis: [--%>
						        <%--{--%>
						            <%--type: "category",--%>
						            <%--boundaryGap: false,--%>
						            <%--data: ["周一", "周二", "周三", "周四", "周五", "周六", "周日"]--%>
						        <%--}--%>
						    <%--],--%>
						    <%--yAxis: [--%>
						        <%--{--%>
						            <%--type: "value"--%>
						        <%--}--%>
						    <%--],--%>
						     <%--grid: {--%>
						        <%--x2: 30,--%>
						        <%--x: 50--%>
						    <%--},--%>
						    <%--series: [--%>
						        <%--{--%>
						            <%--name: "会员",--%>
						            <%--type: "line",--%>
						            <%--smooth: true,--%>
						            <%--itemStyle: {--%>
						                <%--normal: {--%>
						                    <%--areaStyle: {--%>
						                        <%--type: "default"--%>
						                    <%--}--%>
						                <%--}--%>
						            <%--},--%>
						            <%--data: [10, 12, 21, 54, 260, 830, 710]--%>
						        <%--},--%>
						        <%--{--%>
						            <%--name: "文章",--%>
						            <%--type: "line",--%>
						            <%--smooth: true,--%>
						            <%--itemStyle: {--%>
						                <%--normal: {--%>
						                    <%--areaStyle: {--%>
						                        <%--type: "default"--%>
						                    <%--}--%>
						                <%--}--%>
						            <%--},--%>
						            <%--data: [30, 182, 434, 791, 390, 30, 10]--%>
						        <%--},--%>
						        <%--{--%>
						            <%--name: "评论",--%>
						            <%--type: "line",--%>
						            <%--smooth: true,--%>
						            <%--itemStyle: {--%>
						                <%--normal: {--%>
						                    <%--areaStyle: {--%>
						                        <%--type: "default"--%>
						                    <%--},--%>
						                    <%--color: "rgb(110, 211, 199)"--%>
						                <%--}--%>
						            <%--},--%>
						            <%--data: [1320, 1132, 601, 234, 120, 90, 20]--%>
						        <%--}--%>
						    <%--]--%>
						<%--}--%>
				        <%--);--%>
					<%--}--%>
				<%--);--%>
				<%--$(window).resize(function(){--%>
					<%--myChart.resize();--%>
				<%--})--%>
			<%--});--%>
		<%--</script>--%>
	</body>
</html>
