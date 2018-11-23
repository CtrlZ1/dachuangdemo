<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>网站后台管理模版</title>
		<link rel="stylesheet" type="text/css" href="../../static/admin/layui/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="../../static/admin/css/admin.css" />
	</head>

	<body>
		<div class="page-content-wrap">
					<form class="layui-form" action="">
						<div class="layui-form-item">
							<div class="layui-inline">
								<input type="text" name="title" required lay-verify="required" placeholder="请输入小区名、街道名等" autocomplete="off" class="layui-input">
							</div>
							<div class="layui-inline">
								<select name="states" lay-filter="status">
									<option value="">请选择一个状态</option>
									<option value="010">在售</option>
									<option value="021">待售</option>
								</select>
							</div>
							<button class="layui-btn layui-btn-normal" lay-submit="search">搜索</button>
						</div>
					</form>
					<div class="layui-form" id="table-list">
						<table class="layui-table" lay-skin="line">
							<colgroup>
								<col width="50">
								<col  width="100">
								<col  width="100">
								<col  width="200">
								<col width="100">
								<col width="100">
								<col width="100">
								<col width="100">
								<col width="100">
							</colgroup>
							<thead>
								<tr>
									<th><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose"></th>
									<th >楼盘名</th>
									<th>销售状态</th>
									<th>特征点</th>
									<th>单价</th>
									<th>总价</th>
									<th>类型</th>
									<th>开发商</th>
									<th>行政区</th>
									<th>详细地址</th>
								</tr>
							</thead>

							<tbody>
								<tr id='node-1' class="parent collapsed">
									<td><input type="checkbox" name="" lay-skin="primary" data-id="1"></td>
									<td >1</td>
									<td >待售</td>
									<td>123</td>
									<td>单价</td>
									<td>总价</td>
									<td>类型</td>
									<td>开发商</td>
									<td>行政区</td>
									<td>详细地址</td>
								</tr>


								<c:forEach items="${baseInfo}" var="baseInfo" varStatus="vs">
									<tr>
										<%--<td>--%>
											<%--<s:property value="#vs.index+1"/>--%>
										<%--</td>--%>
										<td><input type="checkbox" name="" lay-skin="primary" data-id="1"></td>
										<td >${baseInfo.name}</td>
										<td >${baseInfo.saleState}</td>
										<td >${baseInfo.feature}</td>
										<td >${baseInfo.price}</td>
										<td >${baseInfo.sumPrice}</td>
										<td >${baseInfo.propertise}</td>
										<td >${baseInfo.developer}</td>
										<td >${baseInfo.region}</td>
										<td >${baseInfo.location}</td>

									</tr>
								</c:forEach>


							</tbody>

						</table>
					</div>
		</div>


		<script src="../../static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
		<script src="../../static/admin/js/common.js" type="text/javascript" charset="utf-8"></script>

		<script>
			layui.use(['jquery'], function() {
				var $=layui.jquery;
				//修改状态
				$('#table-list').on('click', '.table-list-status', function() {
					var That = $(this);
					var status = That.attr('data-status');
					var id = That.parent().attr('data-id');
					if(status == 1) {
						That.removeClass('layui-btn-normal').addClass('layui-btn-warm').html('隐藏').attr('data-status', 2);
					} else if(status == 2) {
						That.removeClass('layui-btn-warm').addClass('layui-btn-normal').html('显示').attr('data-status', 1);

					}
				})
				//栏目展示隐藏
				$('.showSubBtn').on('click', function() {
					var _this = $(this);
					var id = _this.attr('data-id');
					var parent = _this.parents('.parent');
					var child = $('.child-node-' + id);
					var childAll = $('tr[parentid=' + id + ']');
					if(parent.hasClass('collapsed')) {
						_this.html('-');
						parent.addClass('expanded').removeClass('collapsed');
						child.css('display', '');
					} else {
						_this.html('+');
						parent.addClass('collapsed').removeClass('expanded');
						child.css('display', 'none');
						childAll.addClass('collapsed').removeClass('expanded').css('display', 'none');
						childAll.find('.showSubBtn').html('+');
					}

				})
			});
		</script>
	</body>

</html>