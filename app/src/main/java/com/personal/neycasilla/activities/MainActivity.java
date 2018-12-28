package com.personal.neycasilla.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import glide.GlideApp;
import model.Item;
import network.FormResponse;
import network.MyRemoteService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://vinrosa.com").
                addConverterFactory(GsonConverterFactory.create()).build();
        MyRemoteService service = retrofit.create(MyRemoteService.class);

        service.getItems().enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                Log.d("MainActivity", "Items: "+response.body());
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {

            }
        });

        service.postForm("Hola!").enqueue(new Callback<FormResponse>() {
            @Override
            public void onResponse(Call<FormResponse> call, Response<FormResponse> response) {
                Log.d("MainActivity","FromResponse: "+ response.body());
            }

            @Override
            public void onFailure(Call<FormResponse> call, Throwable t) {

            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.image_load);
        GlideApp.with(this).load("http://vinrosa.com/example/1.png").into(imageView);
    }
}
