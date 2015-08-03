package com.fxft.cheyoufuwu.ui.login.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisteDetailActivity extends ActionBarActivity {

    @Bind(R.id.ctb_registe_top_bar)
    CommonTopBar ctbRegisteTopBar;
    @Bind(R.id.et_input_user_nickname)
    EditText etInputUserNickname;
    @Bind(R.id.input_psw)
    EditText inputPsw;
    @Bind(R.id.submit_psw)
    EditText submitPsw;
    @Bind(R.id.cb_check_readed)
    CheckBox cbCheckReaded;
    @Bind(R.id.tv_cheyoufuwu_protocal)
    TextView tvCheyoufuwuProtocal;
    @Bind(R.id.bt_finish_regist_button)
    Button btFinishRegistButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registe_detail);
        ButterKnife.bind(this);

        initEvent();
    }

    private void initEvent() {
        ctbRegisteTopBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                finish();
            }
        });
    }

    @OnClick(value = {R.id.bt_finish_regist_button})
    public void onFinishRegistClick(View v) {

    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }
}
