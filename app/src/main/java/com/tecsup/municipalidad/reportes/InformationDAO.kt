package com.tecsup.municipalidad.reportes

import androidx.lifecycle.LiveData
import androidx.room.*
import com.tecsup.municipalidad.reportes.Information

@Dao
interface InformationDAO {

    @Insert
    fun insert(information: Information)

    @Update
    fun update(information: Information)

    @Delete
    fun delete(information: Information)

    @Query("SELECT * FROM reportes_table")
    fun getNota(): LiveData<List<Information>>
}