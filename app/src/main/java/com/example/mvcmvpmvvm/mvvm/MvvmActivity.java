package com.example.mvcmvpmvvm.mvvm;

import android.os.Bundle;

import com.example.mvcmvpmvvm.R;
import com.example.mvcmvpmvvm.databinding.ActivityMvvmBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MvvmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityMvvmBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_mvvm);
        binding.idTvContent.setText("测试");

        MVVMViewModel mvvmViewModel = new MVVMViewModel(getApplication());
        binding.setViewModel(mvvmViewModel);
    }
}