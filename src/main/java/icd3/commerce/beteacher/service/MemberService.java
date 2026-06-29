package icd3.commerce.beteacher.service;

import org.springframework.stereotype.Service;

import icd3.commerce.beteacher.entity.Member;
import icd3.commerce.beteacher.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	public Member findByUsername(String username) {
		return memberRepository.findByName(username);
	}

	public Member findById(Long id) {
		return memberRepository.findById(id).orElse(null);
	}

	public Member save(Member member) {
		return memberRepository.save(member);
	}

	public Member update(Member member) {
		return memberRepository.save(member);
	}

	public String delete(Member member) {
		memberRepository.delete(member);
		return "Deleted";
	}
}
