package com.example.sanjaya.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sanjaya on 5/4/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);//isi itemlayout ke recyclerview
        return new viewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;//jumlah item di recyclerView
    }

    class viewHolder extends RecyclerView.ViewHolder{//objek viewholder

        public viewHolder(View itemView) {
            super(itemView);
        }
    }
}
