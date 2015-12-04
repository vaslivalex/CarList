package com.example.vaslivanov.carlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vaslivanov.listview.R;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarsViewHolder> {
    private ArrayList<Cars> item;

    public CarAdapter(ArrayList<Cars> item) {
        this.item = item;
    }

    @Override
    public CarsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cars, parent, false);
        CarsViewHolder cars = new CarsViewHolder (v);
        return cars;
    }

    @Override
    public void onBindViewHolder(CarAdapter.CarsViewHolder holder, int position) {
        holder.carModel.setText(item.get(position).getCarModel());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class CarsViewHolder extends RecyclerView.ViewHolder {
        public TextView carModel;

        public CarsViewHolder(View itemView) {
            super(itemView);

            carModel = (TextView) itemView.findViewById(R.id.tv_car);
        }
    }
}
