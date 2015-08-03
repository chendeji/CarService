package com.fxft.cheyoufuwu.ui.userCenter.presenter;

import com.fxft.cheyoufuwu.common.interfase.IActivity;
import com.fxft.cheyoufuwu.common.util.BusProvider;
import com.fxft.cheyoufuwu.model.iinterface.IUser;
import com.fxft.cheyoufuwu.model.imp.User;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IChangeBindingPhoneNumber;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IChangeNickNameView;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IChangePSWView;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IUserDetailView;

import java.lang.ref.WeakReference;

/**
 * Created by chendeji on 1/8/15.
 */
public class UserDetailPresenter implements IActivity {
    /**
     * 设置密码界面
     */
    private WeakReference<IChangePSWView> pswViewWeakReference;

    /**
     * 设置绑定新号码界面
     */
    private WeakReference<IChangeBindingPhoneNumber> changeBindingPhoneNumberWeakReference;

    /**
     * 设置昵称界面
     */
    private WeakReference<IChangeNickNameView> nickNameViewWeakReference;

    /**
     * 个人资料界面
     */
    private WeakReference<IUserDetailView> iUserDetailViewRefrence;

    public UserDetailPresenter(IUserDetailView view) {
        this.iUserDetailViewRefrence = new WeakReference<IUserDetailView>(view);
    }

    public UserDetailPresenter(IChangeNickNameView nickNameView) {
        this.nickNameViewWeakReference = new WeakReference<IChangeNickNameView>(nickNameView);
        BusProvider.getInstance().register(this);
    }

    public UserDetailPresenter(IChangePSWView pswView) {
        this.pswViewWeakReference = new WeakReference<IChangePSWView>(pswView);
        BusProvider.getInstance().register(this);
    }

    public UserDetailPresenter(IChangeBindingPhoneNumber iChangeBindingPhoneNumberView) {
        this.changeBindingPhoneNumberWeakReference = new WeakReference<IChangeBindingPhoneNumber>(iChangeBindingPhoneNumberView);
        BusProvider.getInstance().register(this);
    }

    /**
     * 个人资料界面获取用户详细资料
     */
    public void getUserDetailInfo() {
        IUser user = new User("http://i3.dpfile.com/pc/b486cc8fd6910bf1f7a0ac8bf60fda68(278x200)/thumb.jpg",
                "chendeji", 1, "15060112132", 900, 300, 1000);
        IUserDetailView view = iUserDetailViewRefrence.get();
        view.setNickName(user.getNickName());
        view.setPhoneNumber(user.getPhoneNumber());
        view.setCurrentVipLevel(user.getLevel());
        view.setNextVipLevel(user.getLevel() + 1);
        view.setCurrentGrowValue(user.getGrowthValue());
        view.setCurrentLevelGrowBaseValue(user.getCurrentLevelBaseGrowValue());
        view.setNextLevelGrowBaseValue(user.getNextLevelBaseGrowValue());
    }

    /**
     * 获取用户的昵称
     */
    public void getUserNickName() {
        IUser user = new User("http://i3.dpfile.com/pc/b486cc8fd6910bf1f7a0ac8bf60fda68(278x200)/thumb.jpg",
                "chendeji", 1, "15060112132", 900, 300, 1000);
        if (nickNameViewWeakReference != null) {
            nickNameViewWeakReference.get().setNickName(user.getNickName());
        }
    }

    /**
     * 设置用户的昵称
     *
     * @param nickName 昵称
     */
    public void setUserNickName(String nickName) {
        //TODO 跟后台对接，返回的信息将用于回调设置界面中的最新的信息

        //TODO 后台返回信息之后，也需要修改个人资料界面的相关信息
    }

    /**
     * 更改密码
     *
     * @param oldPSW 旧密码
     * @param newPSW 新密码
     */
    public void setUserNewPSW(String oldPSW, String newPSW) {
        //TODO 跟后台对接，返回的信息将用于回调设置界面中的最新的信息

        //TODO 后台返回信息之后，也需要修改个人资料界面的相关信息
    }

    /**
     * 更新用户绑定的电话号码
     *
     * @param verification 绑定验证码
     * @param newPhoneNumber 新电话号码
     */
    public void setNewUserBindingPhoneNumber(String verification, String newPhoneNumber) {
        //TODO 跟后台对接，返回的信息将用于回调设置界面中的最新的信息

        //TODO 后台返回信息之后，也需要修改个人资料界面的相关信息
    }

    /**
     * 发送验证码给新的号码
     * @param oldphoneNumber 旧号码
     * @param newPhoneNumber 新号码
     */
    public void sendVerifacationCode(String oldphoneNumber, String newPhoneNumber) {
        //TODO 跟后台对接，返回的信息将用于回调设置界面中的最新的信息

        //TODO 后台返回信息之后，也需要修改个人资料界面的相关信息
    }


    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestory() {
        if (iUserDetailViewRefrence != null) {
            iUserDetailViewRefrence.clear();
            iUserDetailViewRefrence = null;
        }
        if (nickNameViewWeakReference != null) {
            nickNameViewWeakReference.clear();
            nickNameViewWeakReference = null;
        }
        if (pswViewWeakReference != null) {
            pswViewWeakReference.clear();
            pswViewWeakReference = null;
        }
        if (changeBindingPhoneNumberWeakReference != null){
            changeBindingPhoneNumberWeakReference.clear();
            changeBindingPhoneNumberWeakReference = null;
        }
    }
}
