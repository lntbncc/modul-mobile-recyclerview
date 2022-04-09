package com.example.module_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PostRecyclerViewAdapter extends RecyclerView.Adapter<PostRecyclerViewAdapter.ViewHolder> {
    ArrayList<Post> dataList;
    Context context;

    public PostRecyclerViewAdapter(ArrayList<Post> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = dataList.get(position);
        holder.userName.setText(post.getUserName());
        holder.description.setText(post.getDescription());
        Glide.with(context)
                .asBitmap()
                .load(post.getImgUrl())
                .into(holder.imgPost);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView userName;
        private ImageView imgPost;
        private TextView description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.layout_post_txt_username);
            imgPost = itemView.findViewById(R.id.layout_post_img_post);
            description = itemView.findViewById(R.id.layout_post_txt_description);
        }
    }
}