package com.zxdmjr.multipleroomtabledemo.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.zxdmjr.multipleroomtabledemo.db.entities.Director
import com.zxdmjr.multipleroomtabledemo.db.entities.School
import com.zxdmjr.multipleroomtabledemo.db.entities.Student
import com.zxdmjr.multipleroomtabledemo.db.entities.relations.SchoolAndDirector
import com.zxdmjr.multipleroomtabledemo.db.entities.relations.SchoolWithStudents

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)


    @Transaction
    @Query("SELECT * FROM schools WHERE schoolName = :schoolName")
    fun getSchoolAndDirectorWithSchoolName(schoolName: String): LiveData<List<SchoolAndDirector>>


    @Transaction
    @Query("SELECT * FROM schools WHERE schoolName = :schoolName")
    fun getSchoolWithStudents(schoolName: String): LiveData<List<SchoolWithStudents>>

}