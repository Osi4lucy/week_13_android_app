package com.solomon.imagerecyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.solomon.imagerecyclerapp.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private MyAdapter myAdapter;
    String title[];
    String description[];
    int images [] = {R.drawable.image_1, R.drawable.image_2, R.drawable.image_3, R.drawable.image_4, R.drawable.image_5, R.drawable.image_6,
           R.drawable.image_7, R.drawable.image_8, R.drawable.image_9, R.drawable.image_10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = getResources().getStringArray(R.array.image_title);
        description = getResources().getStringArray(R.array.image_description);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this, title, description, images);
        recyclerView.setAdapter(myAdapter); // assign the adapter to recyclerview

        // Use this if the images does not fit into the custom layout
        //recyclerView.setHasFixedSize(true);

        // Add Item decorator to separate items in the view layer

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);
    }
}
