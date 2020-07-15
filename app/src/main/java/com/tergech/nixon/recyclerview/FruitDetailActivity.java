package com.tergech.nixon.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FruitDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_detail);

        String name = getIntent().getStringExtra("fruit_name");

        this.setTitle(name+" Detail");
    }
}
