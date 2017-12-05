package com.packtpub.waterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.packtpub.waterapp.adapters.MainAdapter;
import com.packtpub.waterapp.models.Drink;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private MainAdapter mAdapter;

    private ArrayList<Drink> mDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)
                findViewById(R.id.main_recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);




    }
}
