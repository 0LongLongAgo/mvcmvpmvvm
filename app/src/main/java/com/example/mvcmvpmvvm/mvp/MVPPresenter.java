package com.example.mvcmvpmvvm.mvp;

import com.example.mvcmvpmvvm.bean.UserInfo;
import com.example.mvcmvpmvvm.mvc.MCallBack;

public class MVPPresenter {
    private IMVPView imvpView;
    private MvpModel mvpModel;

    public MVPPresenter(IMVPView imvpView) {
        this.imvpView = imvpView;
        mvpModel = new MvpModel();
    }
    //获取数据
    public void getData(String inputName) {
        mvpModel.getData(inputName, new MCallBack() {
            @Override
            public void onSuccess(String successData) {
                imvpView.showSuccess(new UserInfo());//成功
            }

            @Override
            public void onFail() {
                imvpView.showFailed();//失败
            }
        });
    }

}
