package com.example.mvcmvpmvvm.mvc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvcmvpmvvm.R;

import androidx.appcompat.app.AppCompatActivity;

public class MvcActivity extends AppCompatActivity {

    private EditText mIdEtInput;
    private Button mIdButton;
    private TextView mIdTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);

        mIdEtInput = (EditText) findViewById(R.id.id_et_input);
        mIdButton = (Button) findViewById(R.id.id_button);
        mIdTvContent = (TextView) findViewById(R.id.id_tv_content);

        mIdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (new NetData().getData(getInputData(), new MCallBack() {
                    @Override
                    public void onSuccess(String successData) {
                        onGetDataSuccess("查询成功！");
                    }

                    @Override
                    public void onFail() {
                        onGetDataFail("查询失败！");
                    }
                }));
            }
        });
    }

    private void onGetDataFail(String s) {
        mIdTvContent.setText(s);
    }

    private void onGetDataSuccess(String s) {
        mIdTvContent.setText(s);
    }

    public String getInputData() {
        return mIdEtInput.getText().toString()+"输入";
    }
}