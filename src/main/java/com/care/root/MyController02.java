package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController02 {
	@RequestMapping("mc/index")
	public String index(Model model) {
		model.addAttribute("index","기본페이지입니다.");
		return "member02/index";
	}
	
	@RequestMapping("mc/login")
	public String login(Model model) {
		model.addAttribute("login","로그인 페이지입니다");
		return "member02/login";
	}
	
	@RequestMapping("mc/logout")
	public String logout(Model model) {
		model.addAttribute("logout","로그아웃 페이지입니다");
		return "member02/logout";
	}
}
