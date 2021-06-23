package com.example.mvcmvpmvvm.mvvm;

import android.app.Application;
import android.view.View;

import com.example.mvcmvpmvvm.BR;
import com.example.mvcmvpmvvm.databinding.ActivityMvvmBinding;
import com.example.mvcmvpmvvm.mvc.MCallBack;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class MVVMViewModel extends BaseObservable {
    /**
     * 一般需要传入Application对象，方便在ViewModel中使用application
     * 比如SharedPreferences需要使用
     * @param application
     */

    private String result;
    private String userInput;
    private MvvmModel mvvmModel;
    public MVVMViewModel(Application application, ActivityMvvmBinding binding){
        mvvmModel = new MvvmModel();
    }
    @Bindable
    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
        notifyPropertyChanged(BR.userInput);
    }

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }
    public MVVMViewModel(Application application){}

    public void getData(View view) {
        mvvmModel.getData(userInput, new MCallBack() {
            @Override
            public void onSuccess(String successData) {
                String info = "查询结果：\n";
                setResult(info);
            }

            @Override
            public void onFail() {
                setResult("查询结果：\n获取信息失败！");

            }
        });

    }
}
