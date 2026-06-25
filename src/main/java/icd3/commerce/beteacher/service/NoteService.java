package icd3.commerce.beteacher.service;

import org.springframework.stereotype.Service;

import icd3.commerce.beteacher.entity.Note;
import icd3.commerce.beteacher.repository.NoteRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoteService {

	private final NoteRepository noteRepository;

	public Note save(Note note){
		return noteRepository.save(note);
	}

	public Note findById(long id){
		return noteRepository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Note not found"));
	}

	public Note patch(Note note){
		return noteRepository.save(note);
	}
}
