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
<script src="../../static/admin/js/jquery-3.3.1.js" type="text/javascript"></script>
<script type="text/javascript">
    $(function(){
        var Name;
        $(".chose1").click(function(){
            $("#LookInformation").show();
            var name=this.cells[1].innerHTML;
            Name=name;
            //alert(name);
        });
        $("#LookInformationButton").click(function(){
            var x="?name="+Name;
            //alert($("#LookInformation").attr("href"));
            $("#LookInformation").attr("href",$("#LookInformation").attr("href")+x)
            //this.attr("href",this.attr("href")+x);
            //this.href+=x;
            /*$.ajax({
                type:'POST',  //提交方法是POST
                url:'/LookInformation', //请求的路径
                data:{ObjectUser:JSON.stringify(Name)}, //以JSON字符串形式把 user 传到后台
                dataType:'text', //后台返回的数据类型是html文本
                timeout:1000,  //请求超时时间，毫秒
                error:function(){  //请求失败的回调方法
                    alert("跳转失败")
                },success:function(result){
                    //alert(result);
                    if(result != "" && result == "success"){
                        window.location.href='admin/index/aim.jsp';
                    }else if(result == "fail"){
                        alert("跳转失败了")
                    }
                }
            })*/

        })
    })
</script>
<body>
<div class="page-content-wrap" style="z-index: 100;top: 0;position: fixed;width: 100%;">
    <form class="layui-form" action="/search5">
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
            <div class="layui-inline">
                <a id="LookInformation" style="display: none; margin-left: 500px;" href="/LookInformation"><input class="layui-btn layui-btn-normal" id="LookInformationButton" type="button" value="详细信息"></a>
            </div>
        </div>
    </form>
</div>
<div class="page-content-wrap" style="margin-top: 70px;">
	<div class="layui-form" id="table-list">
		<table class="layui-table" lay-skin="line">
			<colgroup>
				<col width="50">
				<col  width="100">
				<col  width="100">
				<col width="100">
				<col width="100">
				<col width="100">
			</colgroup>
			<thead>
			<tr>
				<th><input type="checkbox" name="" lay-skin="primary" lay-filter="allChoose"></th>
				<th >楼盘名</th>
				<th>最低价格</th>
				<th>户型</th>
				<th>开盘时间</th>
				<th>交房时间</th>
			</tr>
			</thead>

			<tbody>

			<c:forEach items="${saleInfo}" var="saleInfo" varStatus="vs">
				<tr class="chose1">
					<td><input type="checkbox" name="" lay-skin="primary" data-id="1"></td>
					<td >${saleInfo.housename}</td>
					<td>${saleInfo.lowestPay}</td>
					<td>${saleInfo.houseType}</td>
					<td>${saleInfo.openTime}</td>
					<td>${saleInfo.handinTime}</td>
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