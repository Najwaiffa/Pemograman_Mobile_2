package com.example.apidimas.model

import com.google.gson.annotations.SerializedName

data class DataItem(

    @field:SerializedName("gambar")
    val gambar: String? = null,

    @field:SerializedName("first_name")
    val firstName: String? = null,

    @field:SerializedName("last_name")
    val lastName: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("alamat_rumah")
    val alamatrumah: String? = null
)