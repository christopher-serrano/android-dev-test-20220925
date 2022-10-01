package com.example.rappipaytest.data.model

import com.google.gson.annotations.SerializedName

data class BasicMovieListResponse(
    @SerializedName("page")
    val page: Int?,
    @SerializedName("results")
    val results: List<BasicMovieModel?>?,
    @SerializedName("total_pages")
    val totalPages: Int?,
    @SerializedName("total_results")
    val totalResults: Int?
)