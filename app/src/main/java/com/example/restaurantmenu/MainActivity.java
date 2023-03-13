package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView landmarksRecyclerView=findViewById(R.id.landmarksRecyclerView);

        ArrayList<landmarksModel> landmarksModelArrayList=new ArrayList<>();
        landmarksModelArrayList.add(new landmarksModel("Eiffel Tower","Location : France", R.drawable.ic_eiffel_tower));
        landmarksModelArrayList.add(new landmarksModel("Great Wall of China","Location : China", R.drawable.ic_cin_seddi));
        landmarksModelArrayList.add(new landmarksModel("Kremlin","Location : Russia", R.drawable.ic_moscow_kremlin));
        landmarksModelArrayList.add(new landmarksModel("Tower of Pisa", "Location : Italy", R.drawable.ic_tower_of_pisa));
        landmarksModelArrayList.add(new landmarksModel("Great Pyramid of Giza", "Location : Egypt",R.drawable.ic_giza));
        landmarksModelArrayList.add(new landmarksModel("Sydney Opera House", "Location : Australia", R.drawable.ic_sydney_opera_house));
        landmarksModelArrayList.add(new landmarksModel("Statue of Liberty", "Location : The USA",R.drawable.ic_statueofliberty));
        landmarksModelArrayList.add(new landmarksModel("Taj Mahal",  "Location : India",R.drawable.ic_taj_mahal));
        landmarksModelArrayList.add(new landmarksModel("Moai on Easter Island",  "Location : Chile",R.drawable.ic_moai_on_easter_island));
        landmarksModelArrayList.add(new landmarksModel("Machu Picchu", "Location : Peru",R.drawable.ic_machupicchu));

        landmarksAdapter landmarksAdapter=new landmarksAdapter(this,landmarksModelArrayList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        landmarksRecyclerView.setLayoutManager(linearLayoutManager);
        landmarksRecyclerView.setAdapter(landmarksAdapter);

    }
}