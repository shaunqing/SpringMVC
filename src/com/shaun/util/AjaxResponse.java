package com.shaun.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class AjaxResponse {

	public static void renderData(HttpServletResponse response, String data) {
		PrintWriter printWriter = null;
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/json;charset=utf-8");
			printWriter = response.getWriter();
			printWriter.print(data);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (null != printWriter) {
				printWriter.flush();
				printWriter.close();
			}
		}
	}
}
