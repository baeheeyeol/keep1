package com.keep;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keep.member.dto.MemberDTO;
import com.keep.member.repository.MemberRepository;
import com.keep.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
public class HomeController {

	// 회원가입 페이지 출력 요청
	@GetMapping("/")
	public String saveForm() {
		return "login"; 
	}

}
