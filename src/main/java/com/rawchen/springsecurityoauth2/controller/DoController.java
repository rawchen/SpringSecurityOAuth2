package com.rawchen.springsecurityoauth2.controller;

import com.rawchen.springsecurityoauth2.entities.Result;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author RawChen
 * @date 2021/10/6 20:52
 */
@Controller
public class DoController {

	@GetMapping("/admin/hello")
	public String admin(){
		return "hello admin";
	}

	@GetMapping("/user/hello")
	public String user(){
		return "hello user";
	}

	@GetMapping("/hello")
	public Result hello(){
		return Result.ok("hello");
	}

	@GetMapping("/login")
	public Result login(@RequestParam(value = "userId") String id,
						@RequestParam(value = "password")String password) {
		if ("1".equals(id) && "1".equals(password)) {
			return Result.ok("成功登陆");
		} else {
			return Result.create(404, "登录失败");
		}

	}

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
	}
}
