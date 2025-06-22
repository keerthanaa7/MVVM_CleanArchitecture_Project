package com.example.mvvm_cleanarchitecture_project.data.model.people


import com.google.gson.annotations.SerializedName

data class PeopleList(

    @SerializedName("results")
    val people: List<People>,
)