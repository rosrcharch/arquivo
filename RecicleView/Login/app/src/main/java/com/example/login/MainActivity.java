package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final String LOG_IN_STATUS="login_status";
    private String



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getValue(LOG_IN_STATUS)){
            Intent intent = new Intent(this, home.class);
            startActivity(intent);
        }

    }

    void saveValue(boolean status){

        SharedPreferences.Editor editor = sharedPref.edit();

    }
    boolean getValue(String key){
        boolean defaltValue = false;
        boolean value = sharedPref.getBoolean(key, defaltValue);

    }

}
