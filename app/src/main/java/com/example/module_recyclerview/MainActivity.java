package com.example.module_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Post> postArrayList;
    private RecyclerView postRecyclerView;
    private PostRecyclerViewAdapter postRecyclerViewAdapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        postArrayList = new ArrayList<>();
        postRecyclerView = findViewById(R.id.activity_main_rv);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this);

        addPostData();

        postRecyclerViewAdapter = new PostRecyclerViewAdapter(postArrayList, MainActivity.this);

        postRecyclerView.setLayoutManager(linearLayoutManager);
        postRecyclerView.setAdapter(postRecyclerViewAdapter);

    }

    public void addPostData(){
        postArrayList.add(new Post("Deer",
                "https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg",
                "description"));
        postArrayList.add(new Post("Deer",
                "https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg",
                "description"));
        postArrayList.add(new Post("Deer",
                "https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg",
                "description"));
        postArrayList.add(new Post("Deer",
                "https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg",
                "description"));
        postArrayList.add(new Post("Deer",
                "https://iso.500px.com/wp-content/uploads/2016/03/stock-photo-142984111.jpg",
                "description"));
    }
}