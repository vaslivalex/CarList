package com.example.vaslivanov.carlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vaslivanov.listview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lv_car;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Cars> result = new ArrayList<Cars>();
        result.add(new Cars("Audi"));
        result.add(new Cars("Ford"));
        result.add(new Cars("Mitsubishi"));
        result.add(new Cars("BMW"));
        result.add(new Cars("Toyota"));
        result.add(new Cars("Jeep"));
        result.add(new Cars("Vaz"));
        result.add(new Cars("Chery"));
        result.add(new Cars("Geely"));
        result.add(new Cars("Hover"));
        result.add(new Cars("Hummer"));
        result.add(new Cars("Volvlo"));
        result.add(new Cars("Renault"));

        lv_car = (RecyclerView)findViewById(R.id.lv_car);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        lv_car.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new CarAdapter (result);

        lv_car.setAdapter(adapter);

    }
}
