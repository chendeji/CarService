package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.util.ToastUtil;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;
import com.fxft.cheyoufuwu.ui.common.activity.BaseActivity;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IChangePSWView;
import com.fxft.cheyoufuwu.ui.userCenter.presenter.UserDetailPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChangeLoginPSWActivity extends BaseActivity implements IChangePSWView{

    @Bind(R.id.et_current_psw)
    EditText etCurrentPsw;
    @Bind(R.id.et_new_psw)
    EditText etNewPsw;
    @Bind(R.id.et_new_psw_input_again)
    EditText etNewPswInputAgain;
    @Bind(R.id.bt_save_button)
    Button btSaveButton;
    @Bind(R.id.ctb_change_psw_bar)
    CommonTopBar ctbChangePswBar;
    private UserDetailPresenter mPresenter;

    @OnClick(value = {R.id.bt_save_button})
    public void onSaveNewPSWClick(View v){
        String currentPsw = etCurrentPsw.getText().toString();
        String newPsw = etNewPsw.getText().toString();
        if (TextUtils.isEmpty(currentPsw)){
            ToastUtil.showShortToast(this, getString(R.string.please_input_old_psw));
            return;
        }
        if (TextUtils.isEmpty(newPsw)){
            ToastUtil.showShortToast(this, getString(R.string.please_input_new_psw));
            return;
        }
        mPresenter.setUserNewPSW(currentPsw, newPsw);
    }

    @Override
    protected void initComponent(Bundle savedInstanceState) {
        setContentView(R.layout.activity_change_login_psw);
        ButterKnife.bind(this);

        mPresenter = new UserDetailPresenter(this);
    }

    @Override
    protected void initEvent() {
        ctbChangePswBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
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

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }
}
