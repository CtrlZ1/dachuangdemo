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
	</head>

	<body>
		<div class="wrap-container clearfix">
				<div class="column-content-detail">
					<form class="layui-form" action="">
						<div class="layui-form-item">
							<%--<div class="layui-inline tool-btn">--%>
								<%--<button class="layui-btn layui-btn-small layui-btn-normal addBtn" data-url="article-add.html"><i class="layui-icon">&#xe654;</i></button>--%>
								<%--<button class="layui-btn layui-btn-small layui-btn-danger delBtn"  data-url="article-add.html"><i class="layui-icon">&#xe640;</i></button>--%>
								<%--<button class="layui-btn layui-btn-small layui-btn-warm listOrderBtn hidden-xs" data-url="article-add.html"><i class="iconfont">&#xe656;</i></button>--%>
							<%--</div>--%>
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

					<div id="main" style="width:800px;height:400px"></div>
					<image src="../../static/admin/images/l-line.png"></image>
					<script type="text/javascript">
                        var myChart = echarts.init(document.getElementById('main'));
                        myChart.setOption({
                            title: {
                                text: '房屋状态分布'
                            },
                            series: [
                                {
                                    type: 'pie',
                                    radius: '50%',//半径
                                    data: [
                                        {value: 83, name: '待售'},
                                        {value: 73, name: '期房在售'},
                                        {value: 191, name: '售罄'},
                                        {value: 37, name: '现房在售'},
                                        {value: 15, name: '尾盘'}
                                    ],
                                    //南丁格尔图,通过半径表示数据的大小。
                                    // roseType: 'angle',
                                    //阴影
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
				</div>

		</div>

		<script src="../../static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../static/admin/js/common.js" type="text/javascript" charset="utf-8"></script>

	</body>
</html>