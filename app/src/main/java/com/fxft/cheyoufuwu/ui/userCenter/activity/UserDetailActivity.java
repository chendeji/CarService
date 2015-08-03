package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;
import com.fxft.cheyoufuwu.common.view.LineProcessView;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IUserDetailView;
import com.fxft.cheyoufuwu.ui.userCenter.presenter.UserDetailPresenter;

import java.lang.ref.WeakReference;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UserDetailActivity extends AppCompatActivity implements IUserDetailView {

    @Bind(R.id.ctb_user_detail_top_bar)
    CommonTopBar ctbUserDetailTopBar;
    @Bind(R.id.tv_nick_name)
    TextView tvNickName;
    @Bind(R.id.rl_change_nick_name)
    RelativeLayout rlChangeNickName;
    @Bind(R.id.rl_change_psw)
    RelativeLayout rlChangePsw;
    @Bind(R.id.tv_phone_number)
    TextView tvPhoneNumber;
    @Bind(R.id.rl_change_phone)
    RelativeLayout rlChangePhone;
    @Bind(R.id.tv_pay_psw)
    TextView tvPayPsw;
    @Bind(R.id.rl_change_pay_psw)
    RelativeLayout rlChangePayPsw;
    @Bind(R.id.tv_vip_level)
    TextView tvVipLevel;
    @Bind(R.id.tv_current_grow_value)
    TextView tvCurrentGrowValue;
    @Bind(R.id.lpv_grow_value_process)
    LineProcessView lpvGrowValueProcess;
    @Bind(R.id.tv_current_vip_level)
    TextView tvCurrentVipLevel;
    @Bind(R.id.tv_current_level_grow_value)
    TextView tvCurrentLevelGrowValue;
    @Bind(R.id.tv_next_vip_level)
    TextView tvNextVipLevel;
    @Bind(R.id.tv_next_level_base_grow_value)
    TextView tvNextLevelBaseGrowValue;


    private UpdateGrowValueHandler handler;
    private UserDetailPresenter mPresent;

    @Override
    public void setPhoneNumber(String phoneNumber) {
        if (TextUtils.isEmpty(phoneNumber))
            return;
        phoneNumber = phoneNumber.substring(0, phoneNumber.length() -
                (phoneNumber.substring(3)).length()) + "****" + phoneNumber.substring(7);
        tvPhoneNumber.setText(phoneNumber);
    }

    @Override
    public void setNickName(String nickName) {
        if (TextUtils.isEmpty(nickName))
            return;
        tvNickName.setText(nickName);
    }

    @Override
    public void setCurrentVipLevel(int level) {
        tvVipLevel.setText("VIP" + (level > 0 ? level : 1));
        tvCurrentVipLevel.setText(level == 1 ? getString(R.string.normal_user) : "VIP" + level);
    }

    @Override
    public void setNextVipLevel(int level) {
        tvNextVipLevel.setText("VIP" + level);
    }

    @Override
    public void setCurrentGrowValue(int growthValue) {
        tvCurrentGrowValue.setText(String.valueOf(growthValue));
        lpvGrowValueProcess.setCurrentTotalValue(growthValue);
    }

    @Override
    public void setCurrentLevelGrowBaseValue(int currentLevelBaseGrowValue) {
        tvCurrentLevelGrowValue.setText(String.valueOf(currentLevelBaseGrowValue));
        lpvGrowValueProcess.setMinValue(currentLevelBaseGrowValue);
    }

    @Override
    public void setNextLevelGrowBaseValue(int nextLevelBaseGrowValue) {
        tvNextLevelBaseGrowValue.setText(String.valueOf(nextLevelBaseGrowValue));
        lpvGrowValueProcess.setMaxValue(nextLevelBaseGrowValue);
    }

    private static class UpdateGrowValueHandler extends Handler {
        private static final float DEFUALT_PROCESS_UNIT = 0.05f; //每次自增的比例
        private static final int DEFUALT_TIME_DELAY_MILL = 50;
        private WeakReference<LineProcessView> reference;

        public UpdateGrowValueHandler(LineProcessView view) {
            this.reference = new WeakReference<LineProcessView>(view);
        }

        @Override
        public void handleMessage(Message msg) {
            int process = (int) (msg.arg1 + reference.get().getCurrentTotalValue() * DEFUALT_PROCESS_UNIT);
            if (process >= reference.get().getCurrentTotalValue()) {
                process = reference.get().getCurrentTotalValue();
            } else {
                Message message = this.obtainMessage();
                message.arg1 = process;
                this.sendMessageDelayed(message, DEFUALT_TIME_DELAY_MILL);
            }
            reference.get().setProcessValue(process);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        ButterKnife.bind(this);

        handler = new UpdateGrowValueHandler(lpvGrowValueProcess);
        mPresent = new UserDetailPresenter(this);
        mPresent.getUserDetailInfo();

        initComponent();
        initEvent();
    }

    private void initComponent() {
        //执行进度动画,数据测试
        Message message = handler.obtainMessage();
        message.arg1 = lpvGrowValueProcess.getCurrentMinValue();
        handler.sendMessage(message);
    }

    private void initEvent() {
        ctbUserDetailTopBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                finish();
            }
        });
    }

    @OnClick(value = {R.id.rl_change_nick_name, R.id.rl_change_psw, R.id.rl_change_phone, R.id.rl_change_pay_psw})
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.rl_change_nick_name:
                intent = new Intent(this, ChangeNickNameActivity.class);
                break;
            case R.id.rl_change_psw:
                intent = new Intent(this, ChangeLoginPSWActivity.class);
                break;
            case R.id.rl_change_phone:
                intent = new Intent(this, ChangeUserBindingPhoneNumberActivity.class);
                break;
            case R.id.rl_change_pay_psw:
                break;
        }
        if (intent == null)
            return;
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        mPresent.onDestory();
        mPresent = null;
        super.onDestroy();
    }
}
