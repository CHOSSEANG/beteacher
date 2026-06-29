package icd3.commerce.beteacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import icd3.commerce.beteacher.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	Member findByName(String name);
}
