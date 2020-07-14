package com.tergech.nixon.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitsRecyclerViewAdapter extends RecyclerView.Adapter<FruitsRecyclerViewAdapter.MyViewHolder> {
    List<String> fruitList;
    public FruitsRecyclerViewAdapter(List<String> fruitItems){
        this.fruitList = fruitItems;
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //this is we bind view with actual content
        //conect - data fruitlist - view
        holder.fruit_name.setText(fruitList.get(position));

    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView fruit_name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            fruit_name = itemView.findViewById(R.id.txt_fruit_name);
        }
    }
}
