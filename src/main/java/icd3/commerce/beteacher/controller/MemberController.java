package icd3.commerce.beteacher.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import icd3.commerce.beteacher.entity.Member;
import icd3.commerce.beteacher.service.MemberService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class MemberController {

	private final MemberService memberService;
	private final PasswordEncoder passwordEncoder;

	@PostMapping("/signup")
	public MemberJoinResponse signUp(@RequestBody MemberJoinRequest request) {
		String encodedPassword = passwordEncoder.encode(request.getPassword());

		Member member = request.toEntity();

		member.setPassword(encodedPassword);

		return MemberJoinResponse.from(memberService.signUp(member));
	}
}
