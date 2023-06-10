package com.tecsup.municipalidad.reportes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.tecsup.municipalidad.reportes.Information
import com.tecsup.municipalidad.reportes.InformationRepository
import kotlinx.coroutines.launch

class InformationViewModel(application: Application): AndroidViewModel(application){

    private val repository = InformationRepository(application)

    val informations = repository.getNotes()

    fun saveInformations(information: Information) {
        viewModelScope.launch {
            repository.insertNoteWithCoroutines(information)
        }
    }


}