package com.shaun.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.shaun.entity.User;
import com.shaun.service.UserService;
import com.shaun.util.PageModel;

@Controller
@RequestMapping("/test")
public class userController {

	@Resource
	private UserService userService;

	/**
	 * 跳转到WEB-INF/view/showUsers.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/showUsers")
	public String showUsers() {
		System.out.println("showUsers");
		return "user/showUsers";
	}

	/**
	 * 使用Ajax返回数据。需要@ResponseBody标签，并引入jackson相关包
	 * 
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/showListByAjax")
	public List<User> showAll(HttpServletRequest request) {
		System.out.println("showListByAjax");
		List<User> users = userService.getAllUser();
		return users;
	}

	@ResponseBody
	@RequestMapping("/showPagingUsers/{pageNo}")
	public PageModel<User> showAllPaging(@PathVariable("pageNo") int pageNo) {
		System.out.println("showAllPaging");
		PageModel<User> pageUsers = userService.getAll(pageNo);
		return pageUsers;
	}

	/**
	 * 返回页面（方法1）
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/showUser1", method = RequestMethod.GET)
	public ModelAndView showUser1(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("showUser1");
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		ModelAndView result = new ModelAndView("showUser");
		result.addObject("user", user);
		return result;
	}

	/**
	 * 返回页面（方法2）
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/showUser2/{id}")
	public String showUser2(@PathVariable("id") Integer id, Model model) {
		System.out.println("showUser2");
		User user = this.userService.getUserById(id);
		model.addAttribute("user", user);
		return "user/showUser"; // 返回页面
	}

	@ResponseBody
	@RequestMapping("/updateUser")
	public String updateUser(String dataJson) {
		System.out.println("updateUser");
		System.out.println(dataJson);
		User user = JSON.parseObject(dataJson, User.class);
		userService.updateUser(user);
		return "SUCCESS";
	}

	@RequestMapping("/deleteUser")
	public String deleteUser() {
		System.out.println("deleteUser");
		userService.deleteUser(2);
		return "showUsers";
	}

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setAge(123);
		user.setPassword("123123");
		user.setUsername("123123");

		String str = JSON.toJSONString(user);
		System.out.println(str);
	}
}
