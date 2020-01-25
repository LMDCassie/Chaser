package com.deray.meditation.base;

import android.view.View;


public interface OnItemListener<T> {
    void onItemClick(View view, T data, int position);
}
