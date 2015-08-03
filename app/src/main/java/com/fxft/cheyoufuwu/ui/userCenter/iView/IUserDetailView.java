package com.fxft.cheyoufuwu.ui.userCenter.iView;

/**
 * Created by chendeji on 1/8/15.
 */
public interface IUserDetailView {

    /**
     * 设置用户的手机号码
     *
     * @param phoneNumber
     */
    void setPhoneNumber(String phoneNumber);

    /**
     * 设置用户的昵称
     *
     * @param nickName
     */
    void setNickName(String nickName);

    /**
     * 设置当前的用户vip等级
     *
     * @param level
     */
    void setCurrentVipLevel(int level);

    /**
     * 设置用户的下一个VIP等级
     *
     * @param level
     */
    void setNextVipLevel(int level);

    /**
     * 设置用户当前的成长值
     *
     * @param growthValue
     */
    void setCurrentGrowValue(int growthValue);

    /**
     * 设置用户当前等级的基本成长值
     *
     * @param currentLevelBaseGrowValue
     */
    void setCurrentLevelGrowBaseValue(int currentLevelBaseGrowValue);

    /**
     * 设置用户下一个vip等级的基本成长值
     *
     * @param nextLevelBaseGrowValue
     */
    void setNextLevelGrowBaseValue(int nextLevelBaseGrowValue);
}
