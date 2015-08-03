package com.fxft.cheyoufuwu.ui.login.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.ctb_login_top_bar)
    CommonTopBar ctbLoginTopBar;
    @Bind(R.id.et_phone_number)
    EditText etPhoneNumber;
    @Bind(R.id.et_psw)
    EditText etPsw;
    @Bind(R.id.login_button)
    Button loginButton;
    @Bind(R.id.tv_retrieve_psw)
    TextView tvRetrievePsw;
    @Bind(R.id.tv_phone_verification_login)
    TextView tvPhoneVerificationLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        initEvent();
    }

    private void initEvent() {
        ctbLoginTopBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                switch (buttonPos){
                    case LEFT_CLICK:
                        finish();
                        break;
                    case FIRST_RIGHT_CLICK:
                        //注册
                        Intent intent = new Intent(LoginActivity.this, RegisteActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }


    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }
}
