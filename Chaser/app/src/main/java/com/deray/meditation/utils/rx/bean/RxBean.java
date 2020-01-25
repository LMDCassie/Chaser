package com.deray.meditation.utils.rx.bean;

public class RxBean<T> {
    private int tag;
    private T message;

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
