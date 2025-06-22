package com.example.mvvm_cleanarchitecture_project.data.model.tvshow

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "popular_tvshow")
data class TvShow(
    @SerializedName("first_air_date")
    val firstAirDate: String?,
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val originalName: String?,
    @SerializedName("overview")
    val popularity: Double?,
    @SerializedName("poster_path")
    val posterPath: String?
)
