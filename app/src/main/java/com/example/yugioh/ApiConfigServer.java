package com.example.yugioh;

public class ApiConfigServer {
        public static final String URL_API = "https://db.ygoprodeck.com/api/";

        public static ApiService getApiService(){
            return RetrofitApi.getClient(URL_API).create(ApiService.class);
        }
}

