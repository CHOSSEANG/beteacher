package icd3.commerce.beteacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import icd3.commerce.beteacher.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
