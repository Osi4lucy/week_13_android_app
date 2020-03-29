package com.solomon.imagerecyclerapp.view;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.solomon.imagerecyclerapp.R;


public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView textView, textView2;
    public ImageView imageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        LinearLayout linearLayout = (LinearLayout)itemView;
        textView = linearLayout.findViewById(R.id.titleViewText);
        textView2 = linearLayout.findViewById(R.id.textView2);
        imageView = linearLayout.findViewById(R.id.imageView);

    }


}
