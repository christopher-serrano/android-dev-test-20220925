package com.example.rappipaytest.network.api

import com.example.rappipaytest.data.model.BasicMovieListResponse
import com.example.rappipaytest.data.model.Movie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoints {


    //GET Movie Detail
    @GET("/movie/{movie_id}")
    suspend fun getMovieDetail(@Path(value = "movie_id") movieId: Int): Response<Movie?>

    //GET Trending List
    //option param accepts "day" (for the day) or "week"
    @GET("/trending/movie/{option}")
    suspend fun getTrendingMovieList(@Path(value = "option") option: String): Response<BasicMovieListResponse?>

    //GET Upcoming movie list
    @GET("/movie/upcoming")
    suspend fun getUpcomingMovieList(): Response<BasicMovieListResponse?>

}