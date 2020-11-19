package com.zxdmjr.multipleroomtabledemo.db.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.zxdmjr.multipleroomtabledemo.db.entities.School
import com.zxdmjr.multipleroomtabledemo.db.entities.Student

data class SchoolWithStudents(
    @Embedded
    val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)