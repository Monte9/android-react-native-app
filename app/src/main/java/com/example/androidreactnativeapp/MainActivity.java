package com.example.androidreactnativeapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_property);
    }

    public void showPropertyDetailsScreen(View view) {
        Intent intent = new Intent(this, PropertyDetails.class);
        startActivity(intent);
    }

    public void showRNPropertyDetailsScreen(View view) {
        Log.d("rNPropertyDetailsScreen", "Show React Native Property Details Screen");
    }
}
