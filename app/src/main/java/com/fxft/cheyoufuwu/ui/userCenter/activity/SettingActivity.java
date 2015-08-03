package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SettingActivity extends AppCompatActivity {

    @Bind(R.id.ctb_setting_top_bar)
    CommonTopBar ctbSettingTopBar;
    @Bind(R.id.my_version_no)
    TextView myVersionNo;
    @Bind(R.id.version_check)
    RelativeLayout versionCheck;
    @Bind(R.id.about_us)
    RelativeLayout aboutUs;
    @Bind(R.id.share_app)
    RelativeLayout shareApp;
    @Bind(R.id.rl_assistant)
    RelativeLayout rlAssistant;
    @Bind(R.id.login_or_logout_button)
    Button loginOrLogoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        initComponent();
        initEvent();
    }

    private void initEvent() {
        ctbSettingTopBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                finish();
            }
        });
    }

    private void initComponent() {


    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }
}
