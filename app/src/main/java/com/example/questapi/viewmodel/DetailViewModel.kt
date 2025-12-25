package com.example.questapi.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.questapi.modeldata.DataSiswa
import com.example.questapi.repositori.RepositoryDataSiswa

sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
class DetailViewModel(savedStateHandle: SavedStateHandle,private val repositoryDataSiswa:
RepositoryDataSiswa): ViewModel(){

}