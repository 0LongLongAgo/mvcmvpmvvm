package com.example.mvcmvpmvvm.mvvm;

import com.example.mvcmvpmvvm.mvc.MCallBack;

import java.util.Random;

class MvvmModel {


    public boolean getData(String inputStr, MCallBack callBack) {
        return new Random().nextBoolean();
    }
}
