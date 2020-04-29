package com.ruyonga.notekeep

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initialzeCourses()
        initializeNotes()
    }


    fun addNote(course: CourseInfo, noteTitle: String, noteText: String): Int {
       val  note = NoteInfo(course, noteTitle, noteText)
        notes.add(note)
        return notes.lastIndex
    }

     fun initialzeCourses() {
        var course = CourseInfo("android_intents", "Android programming with intents")
        courses.put(course.courseId, course)


        course = CourseInfo(courseId = "android_sync", title = "Lorem ipsum contnent")
        courses.put(course.courseId, course)

        course = CourseInfo("java_core", "The fundamental The core platform")
        courses.put(course.courseId, course)
    }


     fun initializeNotes() {
        var mynote = NoteInfo(courses["android_intents"]!!, "Learning Intents", "Thi is  along text")
        notes.add(mynote)


         mynote = NoteInfo(courses["android_sync"]!!, "Learning Async", "Thi is  along text")
        notes.add(mynote)
    }

    fun findNote(course: CourseInfo, noteTitle: String, noteText: String): NoteInfo? {
        for (note in notes)
            if (course == note.course && noteTitle == note.title && noteText == note.text)
                return  note

        return  null
    }
}