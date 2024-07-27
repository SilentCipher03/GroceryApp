package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    //1- Adapter-View
    RecyclerView recyclerView;

    //2- Data source
    List<Item> itemList;

    //3- Adapter
    MyAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();


        Item item1= new Item(R.drawable.fruit, "Fruits", "Fresh Fruits from the Garden");
        Item item2= new Item(R.drawable.vegitables, "Vegetables", "Delicious Vegetables");
        Item item3= new Item(R.drawable.bread, "Bakery", "Bread, Wheat and beans");
        Item item4= new Item(R.drawable.beverage, "Beverages", "Juice, Tea, Coffee and Soda");
        Item item5= new Item(R.drawable.milk, "Milk", "Milk, Yogurt and Shakes");
        Item item6= new Item(R.drawable.popcorn, "Snacks", "Pop Corn, Donut and Drinks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myadapter = new MyAdapter(itemList);
        recyclerView.setAdapter(myadapter);


        myadapter.setClickListener(this);



    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this,
                "You choose"+ itemList.get(pos).getItemName(),
                Toast.LENGTH_SHORT).show();
    }
}