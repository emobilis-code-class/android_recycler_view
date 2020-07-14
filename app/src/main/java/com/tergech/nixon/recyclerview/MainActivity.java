package com.tergech.nixon.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> fruits = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        fruits.add("Mangoes");
        fruits.add("Apples");
        fruits.add("Kiwi");
        fruits.add("Blue Berries");
        fruits.add("Oranges");


        /*
        * recyclerview to view
        *  1.Add to layout
        * 2.get the view on .java
        * 3.create a layoutmanager
        * 1.Adapter
        *  create the adapter class - extends Recycler.Adapter
        *
        * recycler
        *
        * */
        FruitsRecyclerViewAdapter recyclerViewAdapter = new FruitsRecyclerViewAdapter(fruits);
        recyclerView.setAdapter(recyclerViewAdapter );

       // recyclerView.setAdapter(new FruitsRecyclerViewAdapter(fruits));
    }
}
