$(document).ready(function() {
	initBtn();

});

function initBtn() {
	$("#updateBtn").click(function() {
		// 该方法已写在serializeUtil.js中
		var jsonStr = JSON.stringify($('#updateForm').serializeObject());
		$.ajax({
			type : "POST",
			url : 'test/updateUser',
			dataType : 'json',
			data : {
				dataJson : jsonStr
			},
			success : function(data) {
				if (data == "SUCCESS") {
					layer.alert('编辑成功!', {
						icon : 1,
						title : '开放交流与运行管理 > 大型设备使用情况',
						closeBtn : false,
						end : function() {
							var index = parent.layer.getFrameIndex(window.name);
							parent.layer.close(index);
						}
					});
				} else {
					layer.alert(data, {
						icon : 2,
						title : '开放交流与运行管理 > 大型设备使用情况'
					});
				}
			}
		});
	});
}

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
						+ ")\" href=\"javascript:void(0)\">修改</a></td>";
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
		content : 'test/showUser2?id=' + id
	});
}
