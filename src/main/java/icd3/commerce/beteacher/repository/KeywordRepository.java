package icd3.commerce.beteacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import icd3.commerce.beteacher.entity.Keyword;

@Repository
public interface KeywordRepository extends JpaRepository<Keyword, Long> {

}
