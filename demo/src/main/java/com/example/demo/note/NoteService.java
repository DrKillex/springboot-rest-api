package com.example.demo.note;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
