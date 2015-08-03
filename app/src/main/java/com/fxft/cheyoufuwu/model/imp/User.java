package com.fxft.cheyoufuwu.model.imp;

import com.fxft.cheyoufuwu.database.EntityBase;
import com.fxft.cheyoufuwu.model.iinterface.IUser;

/**
 * Created by ChenDJ on 2015/7/24.<br>
 */
public class User extends EntityBase implements IUser {

    private String headImageUrl;
    private String nickName;
    private int level;
    private String phoneNumber;
    private int growthValue;

    //-----------------版本2
    private int currentLevelBaseGrowValue;  //当前等级的基础成长值
    private int nextLevelBaseGrowValue; //下一个等级的基础成长值

    //-----------------版本3
    private long userId;    //后台用户ID

    public User(String headImageUrl, String nickName, int level, String phoneNumber, int growthValue) {
        this.headImageUrl = headImageUrl;
        this.nickName = nickName;
        this.level = level;
        this.phoneNumber = phoneNumber;
        this.growthValue = growthValue;
    }

    public User(String headImageUrl, String nickName, int level, String phoneNumber, int growthValue,
                int currentLevelBaseGrowValue, int nextLevelBaseGrowValue) {
        this.headImageUrl = headImageUrl;
        this.nickName = nickName;
        this.level = level;
        this.phoneNumber = phoneNumber;
        this.growthValue = growthValue;
        this.currentLevelBaseGrowValue = currentLevelBaseGrowValue;
        this.nextLevelBaseGrowValue = nextLevelBaseGrowValue;
    }

    @Override
    public String getHeadImageUrl() {
        return this.headImageUrl;
    }

    @Override
    public String getNickName() {
        return this.nickName;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public int getGrowthValue() {
        return this.growthValue;
    }

    @Override
    public int getCurrentLevelBaseGrowValue() {
        return this.currentLevelBaseGrowValue;
    }

    @Override
    public int getNextLevelBaseGrowValue() {
        return this.nextLevelBaseGrowValue;
    }
}
