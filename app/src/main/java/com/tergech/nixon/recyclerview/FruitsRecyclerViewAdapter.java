package com.tergech.nixon.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitsRecyclerViewAdapter extends RecyclerView.Adapter<FruitsRecyclerViewAdapter.MyViewHolder> {
//    List<String> fruitList;
////    List<String> fruitDesc;
////    List<Integer> fruitImages;
    List<Fruit> fruitsList;
    Context context;
    public FruitsRecyclerViewAdapter(List<Fruit> fruitItems,Context context){
        this.fruitsList = fruitItems;
        this.context = context;
//        this.fruitDesc = fruitDesc;
//        this.fruitImages = fruitImages;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        alt + enter
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fruits_view_item,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        //this is we bind view with actual content
        //conect - data fruitlist - view
        holder.fruit_name.setText(fruitsList.get(position).getName());
        holder.fruit_image.setImageResource(fruitsList.get(position).image);
        holder.fruit_desc.setText(fruitsList.get(position).desc);


        //handle events - onclick,longcli
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //handle click event
                //start our detail activity
                Intent intent = new Intent(context,FruitDetailActivity.class);
                intent.putExtra("fruit_name",fruitsList.get(position).getName());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return fruitsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView fruit_name,fruit_desc;
        ImageView fruit_image;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            fruit_name = itemView.findViewById(R.id.txt_fruit_name);
            fruit_desc = itemView.findViewById(R.id.txt_fruit_dec);
            fruit_image = itemView.findViewById(R.id.img_fruit);
        }
    }
}
