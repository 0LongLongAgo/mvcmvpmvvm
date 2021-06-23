package com.example.mvcmvpmvvm.mvp;

import com.example.mvcmvpmvvm.mvc.MCallBack;

import java.util.Random;

class MvpModel {


    public boolean getData(String inputStr, MCallBack callBack) {
        return new Random().nextBoolean();
    }
}
