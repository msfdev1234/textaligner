package com.example.textaligner.LayoutManager;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CustomLayoutManager extends LinearLayoutManager {
    public CustomLayoutManager(Context context) {
        super(context);
    }

    @Override
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(
                RecyclerView.LayoutParams.MATCH_PARENT,
                RecyclerView.LayoutParams.MATCH_PARENT);
    }

    @Override
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        super.onLayoutChildren(recycler, state);
        int width = getWidth();
        int height = getHeight();
        int halfWidth = width / 2;

        for (int i = 0; i < getItemCount(); i++) {
            View child = recycler.getViewForPosition(i);
            int left, right, top, bottom;
            if (i % 2 == 0) {
                left = 0;
                right = halfWidth;
            } else {
                left = halfWidth;
                right = width;
            }
            top = height * (i / 2);
            bottom = top + height;
            layoutDecorated(child, left, top, right, bottom);
        }
    }
}
