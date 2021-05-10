package com.example.tugasbottomnavbar.ui.fpertama;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasbottomnavbar.R;

public class ViewHolder extends RecyclerView.ViewHolder{
    ImageView iv_logo, iv_share;
    TextView tv_title,tv_desc;
    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        iv_logo = (ImageView)itemView.findViewById(R.id.iv_logo);
        iv_share = (ImageView)itemView.findViewById(R.id.iv_share);
        tv_title = (TextView)itemView.findViewById(R.id.tv_title);
        tv_desc = (TextView)itemView.findViewById(R.id.tv_desc);
    }
}