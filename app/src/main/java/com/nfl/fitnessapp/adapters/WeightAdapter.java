package com.nfl.fitnessapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nfl.fitnessapp.R;

public class WeightAdapter extends RecyclerView.Adapter<WeightAdapter.WeightViewHolder> {

    public Context context;

    public WeightAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public WeightViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.number_item_layout,parent,false);
        return new WeightViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WeightViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class WeightViewHolder extends RecyclerView.ViewHolder{

        public WeightViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
