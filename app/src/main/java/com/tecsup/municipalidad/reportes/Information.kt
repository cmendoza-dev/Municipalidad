package com.tecsup.municipalidad.reportes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reportes_table")
data class Information (

    @ColumnInfo(name="Lugar")
    var place: String,

    @ColumnInfo(name = "titulo")
    var title : String,

    @ColumnInfo(name = "comentario")
    var comment: String,


){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_title")
    var title_Id: Int = 0
}