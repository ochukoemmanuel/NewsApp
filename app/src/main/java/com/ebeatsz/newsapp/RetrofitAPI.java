package com.ebeatsz.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    retrofit2.Call<NewsModal> getAllNews(@Url String url);

    @GET
    retrofit2.Call<NewsModal> getNewsByCategory(@Url String url);
}
