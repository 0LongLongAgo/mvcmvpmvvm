package com.example.mvcmvpmvvm.mvp;

import com.example.mvcmvpmvvm.bean.UserInfo;

interface IMVPView {

    /**
     * 获取用户输入的信息
     */
    String getInputData();

    /**
     * 获取数据成功
     */
    void showSuccess(UserInfo userInfo);

    /**
     * 获取数据失败
     */
    void showFailed();

}
