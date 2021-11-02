package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8081/root/ 까지는 서버가 찾고 나머지는 컨트롤러에서 찾아감

@Controller
public class MyController {
	@RequestMapping(value = "index")//url경로
	public String memberIndex() {
		return "member/index";//file경로
	}
	
	@RequestMapping("logout")//값을 1개만 넣을때는 value를 생략가능
	public String memberLogout(Model model) {
		model.addAttribute("key","로그아웃 되었습니다.");
		//model.addAttribute("key","값")
		//모델은 다음 페이지로 값을 전달해주는것/그냥 전달해주는 역할
		return "member/logout";
	}
	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		//ModelAndView를 썼지만 위에꺼랑 똑같은 결과를 냄(방식의 차이)
		//ModelAndView는 ()가 지원이 안돼서 따로 객체를 만들어야함
		//Model은 ()를 지원해서 안에 넣어서객체 만들기 가능
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("login","로그인 성공");
		mv.setViewName("member/login");
		return mv;
	}
}
