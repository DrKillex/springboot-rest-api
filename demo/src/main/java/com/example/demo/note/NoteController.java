package com.example.demo.note;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/note")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
	public List<Note> getNotes() {
		return noteService.getNotes();
	}

    @PostMapping
    public void registerNewNote(@RequestBody Note note){
        noteService.addNewNote(note);
    }

    @DeleteMapping(path = "/{noteId}")
    public void deleteNote(@PathVariable("noteId") Long noteId) {
        noteService.deleteNote(noteId);
    }
    
    @PutMapping(path = "/{noteId}")
    public void updateNote(@PathVariable("noteId") Long noteId, @RequestBody String note) {
        noteService.updateNote(noteId, note);
    }
}
