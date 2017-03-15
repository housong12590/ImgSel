package com.example.imgsel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.Bind;

public class ImageSelActivity extends AppCompatActivity {

    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;
    private static final int COLUMN = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_sel);
        initView();
    }

    private void initView() {
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, COLUMN));
//        mRecyclerView.set
    }

}
