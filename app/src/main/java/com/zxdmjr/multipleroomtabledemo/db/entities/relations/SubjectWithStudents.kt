package com.zxdmjr.multipleroomtabledemo.db.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.zxdmjr.multipleroomtabledemo.db.entities.Student
import com.zxdmjr.multipleroomtabledemo.db.entities.Subject

data class SubjectWithStudents(
    @Embedded
    val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)