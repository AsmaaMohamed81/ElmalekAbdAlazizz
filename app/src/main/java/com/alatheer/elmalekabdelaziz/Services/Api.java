package com.alatheer.elmalekabdelaziz.Services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by elashry on 01/08/2018.
 */

public class Api {
    private static Retrofit retrofit=null;

    private static Retrofit getRetrofit(String base_url)
    {
        if (retrofit==null)
        {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .retryOnConnectionFailure(true)
                    .writeTimeout(1, TimeUnit.MINUTES)
                    .readTimeout(1,TimeUnit.MINUTES)
                    .connectTimeout(1,TimeUnit.MINUTES)
                    .build();

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();
            retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }

    public static Service getApiServices()
    {
        Retrofit retrofit = getRetrofit(Tags.BASE_URL);
        Service service = retrofit.create(Service.class);
        return service;
    }
}
