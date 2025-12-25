package com.example.questapi.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.questapi.modeldata.UIStateSiswa
import com.example.questapi.repositori.RepositoryDataSiswa

class EditViewModel (savedStateHandle: SavedStateHandle, private val respositoryDataSiswa:
RepositoryDataSiswa): ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set
}