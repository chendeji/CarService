package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IChangeNickNameView;
import com.fxft.cheyoufuwu.ui.userCenter.presenter.UserDetailPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChangeNickNameActivity extends AppCompatActivity implements IChangeNickNameView{

    @Bind(R.id.ctb_change_nickname_bar)
    CommonTopBar ctbChangeNicknameBar;
    @Bind(R.id.et_nick_name)
    EditText etNickName;
    @Bind(R.id.bt_save_button)
    Button btSaveButton;
    private UserDetailPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_nick_name);
        ButterKnife.bind(this);

        initEvent();
        initData();
    }

    private void initData() {
        mPresenter = new UserDetailPresenter(this);
        mPresenter.getUserNickName();
    }

    private void initEvent() {
        ctbChangeNicknameBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                finish();
            }
        });
    }

    @OnClick(value = {R.id.bt_save_button})
    public void onSaveButtonClick(View v){
        //TODO 保存昵称到后台
        String nickName = etNickName.getText().toString();
        if (TextUtils.isEmpty(nickName))
            return;
        mPresenter.setUserNickName(nickName);
    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        mPresenter.onDestory();
        super.onDestroy();
    }

    @Override
    public void setNickName(String nickName) {
        etNickName.setText(nickName);
    }
}
