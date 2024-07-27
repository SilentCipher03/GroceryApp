package com.example.groceryapp;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<Item> itemList;

    public ItemClickListener clickListener;



    public void setClickListener(ItemClickListener myListener){
        this.clickListener = myListener;
    }


    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);

        holder.imageView.setImageResource(item.getImg());
        holder.title.setText(item.getItemName());
        holder.description.setText(item.getItemDescription());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        //Hold references to the views within the item layout
         ImageView imageView;
         TextView title;
         TextView description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.itemImageView);
            title = itemView.findViewById(R.id.itemTitle);
            description = itemView.findViewById(R.id.itemDescription);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(clickListener != null){
                clickListener.onClick(view, getAdapterPosition());

            }
        }
    }


}
