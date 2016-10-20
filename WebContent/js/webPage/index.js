$(document).ready(function() {
	searchReport(1);
});

function searchReport(page) {
	$("#list tr").remove();
	$.ajax({
		url : "test/showListByAjax",
		success : function(msg) {
			$.each(msg, function(i, n) {
				var trHTML = "<tr>";
				trHTML += "<td>" + n.id + "</td>";
				trHTML += "<td>" + n.username + "</td>";
				trHTML += "<td>" + n.password + "</td>";
				trHTML += "<td>" + n.age + "</td>";
				trHTML += "<td><a onclick=\"show(" + n["id"]
						+ ")\" href=\"javascript:void(0)\">浏览</a></td>";
				trHTML += "</tr>";
				$("#list").append(trHTML);
			});
		},
		error : function(result) {
			alert(result.responseText);
		}
	});
}

function show(id) {
	layer.open({
		type : 2,
		title : 'layer mobile页',
		moveType : 1,
		scrollbar : false,// 禁止父层滚动条
		shadeClose : false,// 点击遮罩不许关闭
		shade : 0.8,
		maxmin : false, // 开启最大化最小化按钮
		area : [ '893px', '600px' ],
		content : 'test/showHello?id=' + id
	});
}

function demo(curr) {
	$.getJSON('test/demo1.json', {
		page : curr || 1
	//向服务端传的参数，此处只是演示
	}, function(res) {
		//此处仅仅是为了演示变化的内容
		var demoContent = (new Date().getTime() / Math.random() / 1000) | 0;
		document.getElementById('view1').innerHTML = res.content + demoContent;
		//显示分页
		laypage({
			cont : 'page1', //容器。值支持id名、原生dom对象，jquery对象。【如该容器为】：<div id="page1"></div>
			pages : res.pages, //通过后台拿到的总页数
			curr : curr || 1, //当前页
			jump : function(obj, first) { //触发分页后的回调
				if (!first) { //点击跳页触发函数自身，并传递当前页：obj.curr
					demo(obj.curr);
				}
			}
		});
	});
};