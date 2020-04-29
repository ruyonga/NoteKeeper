package com.ruyonga.notekeep

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DataManagerTest {

    @Before
    fun setUp() {
        DataManager.notes.clear()
        DataManager.initializeNotes()
    }

    @Test
    fun addNote() {
        val course = DataManager.courses.get("android_intents")!!
        val noteTitle = "This is a test title"
        val noteText = "This is a a body"

        val  index = DataManager.addNote(course, noteTitle, noteText)
        val  note = DataManager.notes[index]

        assertEquals(course, note.course)
        assertEquals(noteText, note.text)
        assertEquals(noteTitle, note.title)
    }

    @Test
    fun findNote() {
        val course = DataManager.courses.get("android_intents")!!
        val noteTitle = "This is a test title"
        val noteText = "This is a a body"
        val noteText1 = "This is a a second test body"

        val index1 = DataManager.addNote(course, noteTitle, noteText)
        val index2 = DataManager.addNote(course,noteTitle, noteText1)

        val note1 = DataManager.findNote(course, noteTitle, noteText)

        val foundIndex1 = DataManager.notes.indexOf(note1)
        assertEquals(index1, foundIndex1)

        val  note2 = DataManager.findNote(course, noteTitle, noteText1)
        val  foundIndex2 = DataManager.notes.indexOf(note2)
        assertEquals(index2, foundIndex2)

    }


}