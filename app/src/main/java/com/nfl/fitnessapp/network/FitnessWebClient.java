package com.nfl.fitnessapp.network;

import com.nfl.fitnessapp.apiManager.AppConstants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FitnessWebClient {

    private static FitnessWebClient instance = null;
    private static FitnessApi fitnessApi;
    private static Retrofit retrofit;

    private FitnessWebClient(){

        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(30,TimeUnit.SECONDS)
                .connectTimeout(30,TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public static FitnessWebClient getInstance(){
        if (instance == null){
            instance = new FitnessWebClient();
        }
        return instance;
    }

    public static FitnessApi fitnessApi(){
        if (fitnessApi == null){
            fitnessApi = retrofit.create(FitnessApi.class);
        }
        return fitnessApi;
    }
}
