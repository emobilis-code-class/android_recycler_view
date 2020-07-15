package com.tergech.nixon.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
//    private List<String> fruits = new ArrayList<>();
//    private List<String> fruitsDesc = new ArrayList<>();
//    private List<Integer> fruitImages = new ArrayList<>();

    List<Fruit> fruitList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        fruitList.add(new Fruit("Mangoes","Mangoes Description",R.mipmap.mangoe));
        fruitList.add(new Fruit("Apple","Apple Description",R.mipmap.apples));
        fruitList.add(new Fruit("Kiwi","Kiwi Description",R.mipmap.kiwi));
        fruitList.add(new Fruit("Blue Berries","Blue Berries Description",R.mipmap.blueberry));
        fruitList.add(new Fruit("Oranges","Oranges Description",R.mipmap.orange));

//        fruits.add("Mangoes");
//        fruits.add("Apples");
//        fruits.add("Kiwi");
//        fruits.add("Blue Berries");
//        fruits.add("Oranges");
//
//        fruitsDesc.add("Mangoes description");
//        fruitsDesc.add("Apples description");
//        fruitsDesc.add("Kiwi description");
//        fruitsDesc.add("Blue Berries description");
//        fruitsDesc.add("Oranges description");
//
//        fruitImages.add(R.mipmap.mangoe);
//        fruitImages.add(R.mipmap.apples);
//        fruitImages.add(R.mipmap.kiwi);
//        fruitImages.add(R.mipmap.blueberry);
//        fruitImages.add(R.mipmap.orange);

        // integer



/*
* classes
* model
* object
*
* POJO -
* */




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
        FruitsRecyclerViewAdapter recyclerViewAdapter = new FruitsRecyclerViewAdapter(fruitList,MainActivity.this);
        recyclerView.setAdapter(recyclerViewAdapter );

       // recyclerView.setAdapter(new FruitsRecyclerViewAdapter(fruits));
    }
}
