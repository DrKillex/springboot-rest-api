package com.example.demo.note;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class NoteService {

	private final NoteRepository noteRepository;

	@Autowired
    public NoteService(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}

	public List<Note> getNotes() {
		return noteRepository.findAll();			
	}

    public void addNewNote(Note note) {
		noteRepository.save(note);
    }

    public void deleteNote(Long noteId) {
		boolean exists = noteRepository.existsById(noteId);
		if (!exists) {
			throw new IllegalStateException("la nota con id " + noteId + " non esiste");
		}
		noteRepository.deleteById(noteId);
    }

	@Transactional
    public void updateNote(Long noteId, String note) {
		boolean exists = noteRepository.existsById(noteId);
		if (!exists) {
			throw new IllegalStateException("la nota con id " + noteId + " non esiste");
		}
		Optional<Note> optionalNote = noteRepository.findById(noteId);
		if (optionalNote.isPresent()) {
			Note saved = optionalNote.get();
			saved.setText(note);
		}
	}	
}
