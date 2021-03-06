package com.gms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gms.web.domain.ArticleDTO;
import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/board")
public class BoardController {
	static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired ArticleDTO article;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute MemberDTO member) /*<<커맨드임* model은 값을 가져올떄 필요함*/ {
		memberService.add(member);
		System.out.println("멤버 : " + member);
		return "add__success";
	}
	@RequestMapping("/list")
	public void list() {}
	@RequestMapping("/search")
	public void search() {}
	@RequestMapping("/retrieve")
	public void retrieve() {}
	@RequestMapping("/count")
	public void count() {}
	@RequestMapping("/modyfy")
	public void modify() {}
	@RequestMapping("/remove")
	public void remove() {}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute MemberDTO member, Model model) {
		System.out.println("===MemberController login 진입===");
		boolean m = memberService.login(member);
		String result = "";
		if(m==true) {
			result="login__success";
			model.addAttribute("user", memberService.retrieve(member));
		}else {
			result="redirect:/";
		}
		return result;
	}
	@RequestMapping("/logout")
	public String logout() {
		return "redirect:/";
	}
	@RequestMapping(value="/register")
	public String register() {
		System.out.println("레지스터들어옴");
		return "register__success";
	}
	@RequestMapping("/read")
	public String read(){
		return "read__success";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}


