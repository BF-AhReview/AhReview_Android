package com.hackathon.ahreview.data.model.response


import com.google.gson.annotations.SerializedName

data class ReviewInfo(
    val address: String,
    val name: String,
    val url: String,
    val review: String,
    @SerializedName("star_score")
    val starScore: Int,
)