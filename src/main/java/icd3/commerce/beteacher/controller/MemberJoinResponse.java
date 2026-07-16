package icd3.commerce.beteacher.controller;

import icd3.commerce.beteacher.entity.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class MemberJoinResponse {

	private String email;

	private String name;

	public static MemberJoinResponse from(Member member) {
		MemberJoinResponse response = new MemberJoinResponse();
		response.email = member.getEmail();
		response.name = member.getName();
		return response;
	}
}
