package com.shaun.util;

import java.util.List;

public class PageModel<E> {
	private static int pageSize = 2; // 每页显示记录数
	private int totalRecords;// 记录总个数
	private List<E> pageList;

	public static int getPageSize() {
		return pageSize;
	}

	// 总页数
	public int getTotalPages() {
		return (totalRecords + pageSize - 1) / pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public List<E> getPageList() {
		return pageList;
	}

	public void setPageList(List<E> pageList) {
		this.pageList = pageList;
	}

}
