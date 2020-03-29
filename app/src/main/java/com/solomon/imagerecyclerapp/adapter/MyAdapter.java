package com.solomon.imagerecyclerapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.solomon.imagerecyclerapp.MainActivity;
import com.solomon.imagerecyclerapp.R;
import com.solomon.imagerecyclerapp.dataStorage.ImageStorage;
import com.solomon.imagerecyclerapp.view.MyViewHolder;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private MainActivity mainActivity;
    private String[] title;
    private String[] description;
    private int[] images;

    public MyAdapter(MainActivity mainActivity, String[] title, String[] description, int[] images) {
        this.mainActivity=mainActivity;
        this.title = title;
        this.description = description;
       this.images = images;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View myView = inflater.inflate(R.layout.customlayout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(myView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(title[position]);
        holder.textView2.setText(description[position]);
        holder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}
