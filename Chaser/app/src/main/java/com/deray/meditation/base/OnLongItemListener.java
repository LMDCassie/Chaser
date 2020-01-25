package com.deray.meditation.base;

import android.view.View;


public interface OnLongItemListener<T> {
    void onLongItemClick(View view, T data, int position);
}
