package com.arch.demo.common.views.picturetitleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.arch.demo.common.databinding.PictureTitleViewBinding;
import com.arch.demo.common.R;
import com.arch.demo.common.webview.WebActivity;
import com.arch.demo.core.customview.BaseCustomView;


public class PictureTitleView extends BaseCustomView<PictureTitleViewBinding, PictureTitleViewViewModel> {
    public PictureTitleView(Context context) {
        super(context);
    }

    public PictureTitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int setViewLayoutId() {
        return R.layout.picture_title_view;
    }

    @Override
    public void setDataToView(PictureTitleViewViewModel data) {
        getDataBinding().setViewModel(data);
    }

    @Override
    public void onRootClick(View view) {
        WebActivity.startCommonWeb(view.getContext(), "", getViewModel().link);
    }
}
