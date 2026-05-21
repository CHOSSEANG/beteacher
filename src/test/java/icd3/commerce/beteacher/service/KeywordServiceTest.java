package icd3.commerce.beteacher.service;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import icd3.commerce.beteacher.entity.Keyword;
import icd3.commerce.beteacher.repository.KeywordRepository;

@SpringBootTest
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
	void 키워드_수정_성공() {
		Keyword keyword = Keyword.builder().id(1L).keyword("keyword1").content("content1").build();
		Keyword keyword2 = Keyword.builder().id(1L).keyword("keyword2").content("content2").build();

		given(keywordRepository.findById(1L)).willReturn(java.util.Optional.of(keyword));
		given(keywordRepository.save(keyword2)).willReturn(keyword2);

		assertThat(keywordService.update(keyword2)).isEqualTo(keyword2);
	}

	@Test
	void read() {
	}

	@Test
	void delete() {
	}
}
