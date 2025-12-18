package com.example.questapi.apiservice

import com.example.questapi.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {
    @GET("basicTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

}