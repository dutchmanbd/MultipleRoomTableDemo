package com.zxdmjr.multipleroomtabledemo.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "schools")
data class School(
    @PrimaryKey(autoGenerate = false)
    val schoolName: String,
)