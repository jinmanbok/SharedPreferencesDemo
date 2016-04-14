package com.httpman_bok.sharedpreferencesdemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.httpman_bok.sharedpreferencesdemo", Context.MODE_PRIVATE);

        sharedPreferences.edit().putString("username", "Gershom").apply();

        String username = sharedPreferences.getString("username","");
        Log.i("username", username);

    }
}
