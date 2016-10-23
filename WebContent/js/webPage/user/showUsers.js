$(document).ready(function() {
	initJqPaginator();
	searchReport(1);
	
});

function searchReport(page) {
	$("#list tr").remove();
	$.ajax({
		url : "test/showPagingUsers/" + page,
		success : function(pageModel) {
			//总页数
			var totalPages = pageModel.totalPages;
			var datas = pageModel.pageList;
			$.each(datas, function(i, n) {
				var trHTML = "<tr>";
				trHTML += "<td>" + n.id + "</td>";
				trHTML += "<td>" + n.username + "</td>";
				trHTML += "<td>" + n.password + "</td>";
				trHTML += "<td>" + n.age + "</td>";
				trHTML += "<td><a onclick=\"show(" + n["id"]
						+ ")\" href=\"javascript:void(0)\">修改</a></td>";
				trHTML += "</tr>";
				$("#list").append(trHTML);
			});
			$('#pagination').jqPaginator('option', {
				totalPages: totalPages,
				currentPage: page
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
		content : 'test/showUser2/' + id
	});
}

