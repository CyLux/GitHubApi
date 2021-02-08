package com.example.gitbub;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface GitHubService {
    // GET /repos/:owner/:repo/contributors


    @GET("/users/{username}")
    Call<User> getUser(
            @Path("username") String userName
    );


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


}





//   @GET("/users/{username}")
//    Call <List<User>> getUser(
//            @Path("username") String userName);