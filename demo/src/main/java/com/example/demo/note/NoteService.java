package com.example.demo.note;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NoteService {
    public List<Note> getNotes() {
		return List.of(
			new Note(
				1L,
				LocalDate.of(2024, 11, 14),
				"ciao"
			)
		);
	}
}
