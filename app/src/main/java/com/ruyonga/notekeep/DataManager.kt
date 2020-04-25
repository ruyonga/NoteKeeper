package com.ruyonga.notekeep

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initialzeCourses()
        initializeNotes()
    }

    private fun initialzeCourses() {
        var course = CourseInfo("android_intents", "Android programming with intents")
        courses.set(course.courseId, course)


        course = CourseInfo(courseId = "android_sync", title = "Lorem ipsum contnent")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "The fundamental The core platform")
        courses.set(course.courseId, course)
    }


    private fun initializeNotes() {
        var mynote = NoteInfo(courses["android_intents"]!!, "Learning Intents", "Thi is  along text")
        notes.add(mynote)


         mynote = NoteInfo(courses["android_sync"]!!, "Learning Async", "Thi is  along text")
        notes.add(mynote)
    }
}