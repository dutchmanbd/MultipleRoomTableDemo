package com.zxdmjr.multipleroomtabledemo.db.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.zxdmjr.multipleroomtabledemo.db.entities.Student
import com.zxdmjr.multipleroomtabledemo.db.entities.Subject


data class StudentWithSubjects(
    @Embedded
    val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>

)