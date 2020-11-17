package com.zxdmjr.multipleroomtabledemo.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "directors")
data class Director(
    @PrimaryKey(autoGenerate = false)
    val directorName: String,
    val schoolName: String
)