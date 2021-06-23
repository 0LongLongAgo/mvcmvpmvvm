package com.example.mvcmvpmvvm.mvp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvcmvpmvvm.R;
import com.example.mvcmvpmvvm.bean.UserInfo;

import androidx.appcompat.app.AppCompatActivity;

public class MvpActivity extends AppCompatActivity implements IMVPView{

    private EditText mIdEtInput;
    private Button mIdButton;
    private TextView mIdTvContent;



    private MVPPresenter mvpPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);


        mvpPresenter = new MVPPresenter(this);

        mIdEtInput = (EditText) findViewById(R.id.id_et_input);
        mIdButton = (Button) findViewById(R.id.id_button);
        mIdTvContent = (TextView) findViewById(R.id.id_tv_content);

        mIdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvpPresenter.getData(getInputData());
            }
        });
    }

    @Override
    public void showSuccess(UserInfo u) {
        mIdTvContent.setText("查询成功");
    }
    @Override
    public void showFailed() {
        mIdTvContent.setText("查询失败");
    }
    @Override
    public String getInputData() {
        return mIdEtInput.getText().toString()+"输入";
    }

}