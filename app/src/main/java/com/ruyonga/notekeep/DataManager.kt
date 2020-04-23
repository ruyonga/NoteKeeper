package com.ruyonga.notekeep

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initialzeCourses()
    }

    private fun initialzeCourses() {
        var course = CourseInfo("android_intents", "Android programming with intents")
        courses.set(course.courseId, course)


        course = CourseInfo(courseId = "android_sync", title = "Lorem ipsum contnent")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "The fundamental The core platform")
        courses.set(course.courseId, course)
    }
}