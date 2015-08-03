package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.util.ToastUtil;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;
import com.fxft.cheyoufuwu.ui.common.activity.BaseActivity;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IChangeBindingPhoneNumber;
import com.fxft.cheyoufuwu.ui.userCenter.presenter.UserDetailPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChangeUserBindingPhoneNumberActivity extends BaseActivity implements IChangeBindingPhoneNumber {

    @Bind(R.id.et_current_binding_phone_number)
    EditText etCurrentBindingPhoneNumber;
    @Bind(R.id.et_new_bingding_phone_number)
    EditText etNewBingdingPhoneNumber;
    @Bind(R.id.tv_send_verification_code)
    TextView tvSendVerificationCode;
    @Bind(R.id.et_input_verification_code)
    EditText etInputVerificationCode;
    @Bind(R.id.bt_binding_button)
    Button btBindingButton;
    @Bind(R.id.ctb_change_bingding_phone_number_bar)
    CommonTopBar ctbChangeBingdingPhoneNumberBar;
    private UserDetailPresenter mPresenter;

    @Override
    protected void initComponent(Bundle savedInstanceState) {
        setContentView(R.layout.activity_change_user_binding_phone_number);
        ButterKnife.bind(this);
        mPresenter = new UserDetailPresenter(this);
    }

    @OnClick(value = {R.id.tv_send_verification_code})
    public void onSendVerificationCodeClick(View v) {
        String new_phoneNumber = etNewBingdingPhoneNumber.getText().toString();
        if (TextUtils.isEmpty(new_phoneNumber)) {
            ToastUtil.showShortToast(this, getString(R.string.please_input_new_phoneNumber));
            return;
        }
        String current_phoneNumber = etCurrentBindingPhoneNumber.getText().toString();
        if (TextUtils.isEmpty(current_phoneNumber)) {
            ToastUtil.showShortToast(this, getString(R.string.please_input_current_phoneNumber));
            return;
        }
        mPresenter.sendVerifacationCode(current_phoneNumber, new_phoneNumber);
    }

    @OnClick(value = {R.id.bt_binding_button})
    public void onBindingNewPhoneNumberClick(View v) {
        String verification = etInputVerificationCode.getText().toString();
        if (TextUtils.isEmpty(verification)) {
            ToastUtil.showShortToast(this, getString(R.string.please_input_verification_code));
            return;
        }
        String new_phoneNumber = etNewBingdingPhoneNumber.getText().toString();
        if (TextUtils.isEmpty(new_phoneNumber)) {
            ToastUtil.showShortToast(this, getString(R.string.please_input_new_phoneNumber));
            return;
        }
        mPresenter.setNewUserBindingPhoneNumber(verification, new_phoneNumber);
    }

    @Override
    protected void initEvent() {
        ctbChangeBingdingPhoneNumberBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                finish();
            }
        });
    }

    @Override
    protected void pause() {

    }

    @Override
    protected void resume() {

    }

    @Override
    protected void destory() {
        ButterKnife.unbind(this);
        mPresenter.onDestory();
        mPresenter = null;
    }

    @Override
    protected void onNetWorkReConnected() {

    }

    @Override
    protected void onNetWorkConnectFail() {

    }
}
