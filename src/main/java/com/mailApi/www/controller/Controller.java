package com.mailApi.www.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mailApi.www.model.UserModel;
import com.mailApi.www.service.UserService;

@RestController
@RequestMapping("/mail")
public class Controller {

	private final UserService userService;
	
	public Controller(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/getUserList")
	public List<UserModel> getUserList(){
		System.out.println("ㅇㅇ");
		return userService.getUserList(52);
	}
	
	@GetMapping("/getList")
	public List<UserModel> getList(){
		System.out.println("ㅇㅇ");
		return userService.getList(11, 1);
	}
	
	@GetMapping("/getListAll")
	public List<UserModel> getListAll(){
		List<Integer> teams = new ArrayList<Integer>();
		teams.add(10);
		teams.add(4);
		return userService.getListAll(teams, 1);
	}
	
	@GetMapping("/postMail")
	public int postMail() {
		return 0;
	}
}
