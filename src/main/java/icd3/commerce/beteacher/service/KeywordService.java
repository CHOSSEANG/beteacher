package icd3.commerce.beteacher.service;

import org.springframework.stereotype.Service;

import icd3.commerce.beteacher.entity.Keyword;
import icd3.commerce.beteacher.repository.KeywordRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KeywordService {

	private final KeywordRepository keywordRepository;

	public Keyword save(Keyword keyword) {
		return keywordRepository.save(keyword);
	}

	public Keyword update(Keyword keyword) {
		keywordRepository.findById(keyword.getId())
			.orElseThrow(() -> new IllegalArgumentException("Keyword not found"));
		return keywordRepository.save(keyword);
	}

	public Keyword read(long keywordId){
		return keywordRepository.findById(keywordId)
			.orElseThrow(() -> new IllegalArgumentException("Keyword not found"));
	}

	public void delete(long keywordId){
		keywordRepository.findById(keywordId)
			.orElseThrow(() -> new IllegalArgumentException("Keyword not found"));
		keywordRepository.deleteById(keywordId);
	}
}
