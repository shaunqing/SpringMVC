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
			},
			error : function(result) {
				alert(result.responseText);
			}
		});
	});
}

