package icd3.commerce.beteacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import icd3.commerce.beteacher.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
