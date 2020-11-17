package com.zxdmjr.multipleroomtabledemo.db.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.zxdmjr.multipleroomtabledemo.db.entities.Director
import com.zxdmjr.multipleroomtabledemo.db.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)