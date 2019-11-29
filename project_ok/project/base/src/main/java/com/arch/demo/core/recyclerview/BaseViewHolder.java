package com.arch.demo.core.recyclerview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import com.arch.demo.core.customview.BaseCustomViewModel;
import com.arch.demo.core.customview.ICustomView;



public class BaseViewHolder extends RecyclerView.ViewHolder {
    ICustomView view;

    public BaseViewHolder(ICustomView view) {
        super((View) view);
        this.view = view;
    }

    public void bind(@NonNull BaseCustomViewModel item) {
        view.setData(item);
    }
}