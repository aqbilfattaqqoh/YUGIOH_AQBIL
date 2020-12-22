package com.example.yugioh;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("v7/cardinfo.php?level=4&attribute=water&sort=atk")
    Call<YuGiOhModel> getData();
}
