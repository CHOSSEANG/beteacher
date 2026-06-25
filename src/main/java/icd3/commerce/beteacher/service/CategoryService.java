package icd3.commerce.beteacher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import icd3.commerce.beteacher.entity.Category;
import icd3.commerce.beteacher.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {

	private final CategoryRepository categoryRepository;

	public Category save(Category category){
		return categoryRepository.save(category);
	}

	public Category findById(long id) {
		return categoryRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Category not found"));
	}

	public List<Category> findAll(){
		return categoryRepository.findAll();
	}


}
