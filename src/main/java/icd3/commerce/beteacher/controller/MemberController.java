package icd3.commerce.beteacher.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import icd3.commerce.beteacher.entity.Member;
import icd3.commerce.beteacher.service.MemberService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {

	private final MemberService memberService;

	@PostMapping("/signup")
	public Member signUp(@RequestBody MemberJoinRequest request) {

		Member member = request.toEntity();

		return memberService.save(member);
	}
}
