package com.arch.demo.core.fragment;

import com.arch.demo.core.activity.IBaseView;


public interface IBasePagingView extends IBaseView {

    void onLoadMoreFailure(String message);

    void onLoadMoreEmpty();
}
