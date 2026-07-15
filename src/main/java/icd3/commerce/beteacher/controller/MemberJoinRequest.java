package icd3.commerce.beteacher.controller;

import icd3.commerce.beteacher.entity.Member;
import icd3.commerce.beteacher.entity.Role;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberJoinRequest {
	private String email;
	private String password;
	private String name;

	public Member toEntity() {
		return Member.builder()
			.email(email)
			.password(password)
			.name(name)
			.role(Role.USER)
			.build();
	}
}
