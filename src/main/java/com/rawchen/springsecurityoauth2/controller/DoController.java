package com.rawchen.springsecurityoauth2.controller;

import com.rawchen.springsecurityoauth2.entities.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author RawChen
 * @date 2021/10/6 20:52
 */
@Controller
public class DoController {

	@ResponseBody
	@GetMapping("/admin/hello")
	public Result admin(){
		return Result.ok("hello admin");
	}

	@ResponseBody
	@GetMapping("/user/hello")
	public Result user(){
		return Result.ok("hello user");
	}

	@ResponseBody
	@GetMapping("/hello")
	public Result hello(){
		return Result.ok("hello");
	}
}
