package com.zxdmjr.multipleroomtabledemo.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.zxdmjr.multipleroomtabledemo.db.entities.Director
import com.zxdmjr.multipleroomtabledemo.db.entities.School
import com.zxdmjr.multipleroomtabledemo.db.entities.relations.SchoolAndDirector

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Transaction
    @Query("SELECT * FROM schools WHERE schoolName = :schoolName")
    fun getSchoolAndDirectorWithSchoolName(schoolName: String): LiveData<List<SchoolAndDirector>>


}