package com.pursuit.fragmentexercisescallbackcommunicationrevisited;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
    public RecyclerViewViewHolder(View itemView) {
        super(itemView);
    }
    public void bind(String s, final FragmentInterface.fragmentInterface){
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
