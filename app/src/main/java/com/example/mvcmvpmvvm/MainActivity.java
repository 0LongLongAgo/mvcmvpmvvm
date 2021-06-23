package com.example.mvcmvpmvvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mvcmvpmvvm.mvc.MvcActivity;
import com.example.mvcmvpmvvm.mvp.MvpActivity;
import com.example.mvcmvpmvvm.mvvm.MvvmActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mIdMvc;
    private Button mIdMvp;
    private Button mIdMvvm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIdMvc = (Button) findViewById(R.id.id_mvc);
        mIdMvp = (Button) findViewById(R.id.id_mvp);
        mIdMvvm = (Button) findViewById(R.id.id_mvvm);

        mIdMvc.setOnClickListener(this);
        mIdMvp.setOnClickListener(this);
        mIdMvvm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.id_mvc:
                startActivity(new Intent(MainActivity.this, MvcActivity.class));
                break;
            case R.id.id_mvp:
                startActivity(new Intent(MainActivity.this, MvpActivity.class));
                break;
            case R.id.id_mvvm:
                startActivity(new Intent(MainActivity.this, MvvmActivity.class));
                break;
        }
    }
}