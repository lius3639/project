package com.arch.demo.network_api.observer;

import android.util.Log;

import com.arch.demo.core.model.SuperBaseModel;
import com.arch.demo.network_api.errorhandler.ExceptionHandle;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public abstract class BaseObserver<T> implements Observer<T> {
    SuperBaseModel baseModel;
    public BaseObserver(SuperBaseModel baseModel) {
        this.baseModel = baseModel;
    }
    @Override
    public void onError(Throwable e) {
        Log.e("lvr", e.getMessage());
        // todo error somthing

        if(e instanceof ExceptionHandle.ResponeThrowable){
            onError((ExceptionHandle.ResponeThrowable)e);
        } else {
            onError(new ExceptionHandle.ResponeThrowable(e, ExceptionHandle.ERROR.UNKNOWN));
        }
    }

    @Override
    public void onSubscribe(Disposable d) {
        if(baseModel != null){
            baseModel.addDisposable(d);
        }
    }


    @Override
    public void onComplete() {
    }


    public abstract void onError(ExceptionHandle.ResponeThrowable e);

}