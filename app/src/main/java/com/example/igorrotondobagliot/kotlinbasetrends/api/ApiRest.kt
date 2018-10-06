package com.example.igorrotondobagliot.kotlinbasetrends.api

import com.example.igorrotondobagliot.kotlinbasetrends.models.Album
import com.example.igorrotondobagliot.kotlinbasetrends.models.Post
import com.example.igorrotondobagliot.kotlinbasetrends.models.User
import com.example.igorrotondobagliot.kotlinbasetrends.util.Constants
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Igor Rotondo Bagliot on 19/09/2018.
 */
interface ApiRest {

    @GET("albums")
    fun getAlbumList(): Deferred<List<Album>>

    @GET("albums/{id}")
    fun getAlbum(@Path("id") id: Int): Deferred<Album>

    @DELETE("albums/{id}")
    fun deleteAlbum(@Path("id") id: Int)

    @GET("posts")
    fun getPostList(): Deferred<Response<Post>>

    @GET("posts/{id}")
    fun getPost(@Path("id") id: Int): Deferred<Post>

    @DELETE("albums/{id}")
    fun deletePost(@Path("id") id: Int)

    @GET("users")
    fun getUserList(): Deferred<Response<User>>

    @GET("posts/{id}")
    fun getUser(@Path("id") id: Int): Deferred<User>

    @DELETE("albums/{id}")
    fun deleteUser(@Path("id") id: Int)

    companion object Factory {
        fun create(): ApiRest {
            val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .baseUrl(Constants.BASE_URL)
                    .build()
            return retrofit.create(ApiRest::class.java)
        }
    }

}