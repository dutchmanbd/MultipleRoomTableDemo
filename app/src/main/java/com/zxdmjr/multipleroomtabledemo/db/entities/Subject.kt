package com.zxdmjr.multipleroomtabledemo.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subjects")
data class Subject(
    @PrimaryKey(autoGenerate = false)
    val subjectName: String,

)