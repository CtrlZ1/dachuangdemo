<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="iframe-h">

	<head>
		<meta charset="UTF-8">
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>网站后台管理模版</title>
		<link rel="stylesheet" type="text/css" href="../../static/admin/layui/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="../../static/admin/css/admin.css" />
		<%--<script src="../../static/admin/lib/echarts/echarts.js"></script>--%>
		<script src="../../static/js/echarts.js"></script>
		<script src="../../static/js/echarts-wordcloud.js"></script>
		<script src="../../static/js/echarts-wordcloud.min.js"></script>
	</head>

	<body>
		<div class="wrap-container clearfix">
				<div class="column-content-detail">
					<form class="layui-form" action="">
						<div class="layui-form-item">
								<div class="layui-inline">
									<select name="states" lay-filter="status">
										<option value="">请选择属性</option>
										<option value="010">价格</option>
										<option value="021">位置</option>
										<option value="0571">热度</option>
									</select>
								</div>
							<div class="layui-inline">
								<select name="states" lay-filter="status">
									<option value="">请选择图形类型</option>
									<option value="010">饼状图</option>
									<option value="021">柱状图</option>
									<option value="0571">分布图</option>
								</select>
							</div>
							<button class="layui-btn layui-btn-normal" lay-submit="search">生成</button>
						</div>
					</form>

					<div id="main" style="width:700px;height:500px"></div>
					<div id="main2"  style="width:700px;height:500px"></div>
					<div id="main3"  style="width:700px;height:500px"></div>
					<div id="main4"  style="width:700px;height:500px"></div>

					<script type="text/javascript">
						 getPies=${pies}
                        var myChart = echarts.init(document.getElementById('main'));
                        myChart.setOption({
                            title: {
                                text: '房屋销售状态'
                            },
                            series: [
                                {
                                    type: 'pie',
                                    radius: '50%',//半径
                                    //{"name": '待售',"value": 83},
                                    data:getPies,
                                    label: {
                                        normal: {
                                            show: true,
                                            formatter: '{b}: {c}({d}%)'
                                        }
                                    },
                                    itemStyle: {
                                        textStyle: {
                                            color: 'rgba(255, 255, 255, 0.3)'
                                        },
                                        //阴影的大小
                                        shadowBlur: 500,
                                        //阴影颜色
                                        shadowColor: 'rgba(0,0,0,0.5)',
                                        // 阴影水平方向上的偏移
                                        shadowOffsetX: 0,
                                        // 阴影垂直方向上的偏移
                                        shadowOffsetY: 0,
                                        //鼠标移动到图上时的样式
                                        emphasis: {
                                            shadowBlur: 200,
                                            shadowColor: 'rgba(1,255,0,0.5)'
                                        }
                                    }
                                }
                            ]
                        });
					</script>

					<script type="text/javascript">
                        var myChart = echarts.init(document.getElementById('main2'), 'light');
                        features=${features}
                        var option = {
                            title: {
                                text: '楼盘特征词云'
                            },
                            series: [
                                {
                                    type: 'wordCloud',
                                    gridSize: 2,
                                    sizeRange: [12, 50],
                                    rotationRange: [-90, 90],

                                    shape: 'pentagon',
                                    textStyle: {
                                        normal: {
                                            color: function () {
                                                return 'rgb(' + [
                                                    Math.round(Math.random() * 255),
                                                    Math.round(Math.random() * 255),
                                                    Math.round(Math.random() * 255)
                                                ].join(',') + ')';
                                            }
                                        },
                                        emphasis: {
                                            shadowBlur: 10,
                                            shadowColor: '#333'
                                        }
                                    },
                                    data: features
                                }]
                        };
                        myChart.setOption(option);
					</script>

					<script type="text/javascript">
                        locations=${locations}
                        var myChart = echarts.init(document.getElementById('main3'));
                        myChart.setOption({
                            title: {
                                text: '楼盘地区分布'
                            },
                            series: [
                                {
                                    type: 'pie',
                                    radius: '50%',//半径
                                    //{"name": '待售',"value": 83},
                                    data:locations,
                                    label: {
                                        normal: {
                                            show: true,
                                            formatter: '{b}: {c}({d}%)'
                                        }
                                    },
                                    itemStyle: {
                                        textStyle: {
                                            color: 'rgba(255, 255, 255, 0.3)'
                                        },
                                        //阴影的大小
                                        shadowBlur: 500,
                                        //阴影颜色
                                        shadowColor: 'rgba(0,0,0,0.5)',
                                        // 阴影水平方向上的偏移
                                        shadowOffsetX: 0,
                                        // 阴影垂直方向上的偏移
                                        shadowOffsetY: 0,
                                        //鼠标移动到图上时的样式
                                        emphasis: {
                                            shadowBlur: 200,
                                            shadowColor: 'rgba(1,255,0,0.5)'
                                        }
                                    }
                                }
                            ]
                        });
					</script>

					<script type="text/javascript">
                        // 基于准备好的dom，初始化echarts实例，设置颜色风格
                        prices=${prices}
                        var myChart = echarts.init(document.getElementById('main4'),'light');

                        // 指定图表的配置项和数据
                        var option = {
                            title: {
                                text: '房屋单价统计'
                            },
                            tooltip: {
                            },
                            legend: {
                                data: ['房屋数量']
                            },
                            xAxis: {
                                data: ['<7000元','7000-9000元','9000-11000元','11000-13000元','>13000元']
                            },
                            yAxis: {},
                            series: [{
                                name: '房屋数量',
                                type: 'bar',
                                data: prices
                            }]
                        };
                        // 使用刚指定的配置项和数据显示图表。
                        myChart.setOption(option);
					</script>

				</div>

		</div>

		<script src="../../static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../static/admin/js/common.js" type="text/javascript" charset="utf-8"></script>

	</body>
</html>