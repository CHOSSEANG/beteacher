package icd3.commerce.beteacher.service;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import icd3.commerce.beteacher.entity.Keyword;
import icd3.commerce.beteacher.repository.KeywordRepository;

class KeywordServiceTest {

	@Mock
	KeywordRepository keywordRepository;

	@InjectMocks
	KeywordService keywordService;

	@Test
	void 키워드_저장_성공() {
		Keyword keyword = new Keyword();
		given(keywordRepository.save(keyword)).willReturn(keyword);

		Keyword result = keywordService.save(keyword);

		assertThat(result).isEqualTo(keyword);
	}

	@Test
	void update() {
	}

	@Test
	void read() {
	}

	@Test
	void delete() {
	}
}
