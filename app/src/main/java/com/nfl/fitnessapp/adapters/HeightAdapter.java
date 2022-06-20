package com.nfl.fitnessapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nfl.fitnessapp.R;

public class HeightAdapter extends RecyclerView.Adapter<HeightAdapter.HeightViewHolder>{

    private Context context;

    public HeightAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public HeightViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.number_item_layout,parent,false);
        return new HeightViewHolder(view);
        
    }

    @Override
    public void onBindViewHolder(@NonNull HeightViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HeightViewHolder extends RecyclerView.ViewHolder {

        public HeightViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
