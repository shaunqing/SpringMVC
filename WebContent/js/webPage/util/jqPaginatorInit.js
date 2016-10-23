function initJqPaginator() {
	$.jqPaginator('#pagination', {
		totalPages : 1,
		currentPage : 1,
        visiblePages: 5,
        wrapper: '<ul class="pagination"></ul>',
        first: '<li class="first"><a href="javascript:void(0);">首页</a></li>',
        prev: '<li class="prev"><a href="javascript:void(0);">上一页</a></li>',
        next: '<li class="next"><a href="javascript:void(0);">下一页</a></li>',
        last: '<li class="last"><a href="javascript:void(0);">尾页</a></li>',
        page: '<li class="page"><a href="javascript:void(0);">{{page}}</a></li>',
        onPageChange: function (num, type) {
            if (type === "change") {
         	   searchReport(num);
            }
        }
    });
}