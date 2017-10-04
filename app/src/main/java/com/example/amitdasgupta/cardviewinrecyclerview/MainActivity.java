package com.example.amitdasgupta.cardviewinrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // ArrayList for person names
    ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2"));
    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.am, R.drawable.b));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
// set a LinearLayoutManager with default vertical orientaion
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager); // set LayoutManager to RecyclerView
// call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, personNames,personImages);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}
