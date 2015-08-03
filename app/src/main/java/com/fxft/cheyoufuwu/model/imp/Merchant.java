package com.fxft.cheyoufuwu.model.imp;

import android.os.Parcel;
import android.os.Parcelable;

import com.fxft.cheyoufuwu.common.util.StringFormatUtil;
import com.fxft.cheyoufuwu.model.iinterface.IMerchant;

/**
 * 商户实体类
 * Created by chendeji on 2015/7/21.
 */
public class Merchant implements IMerchant, Parcelable {

    private String photoUrl;
    private String name;
    private float distance;

    //------------版本3
    private int sellCount;
    private String area;
    private float rating;
    private int serviceType = COMPOSITE_SERVICE;    //默认值为综合服务
    private boolean hasSnacksService;
    private boolean hasWIFIService;
    private boolean hasLightService;
    private boolean hasVideoService;
    private boolean hasTeeService;

    //----------------版本4
    private String address;
    private String phone;

    public Merchant(String photoUrl, String name, float distance) {
        this.photoUrl = photoUrl;
        this.name = name;
        this.distance = distance;
    }

    public Merchant(String photoUrl, String name, float distance, int sellCount, String area,
                    float rating, int serviceType, boolean hasSnacksService, boolean hasWIFIService,
                    boolean hasLightService, boolean hasVideoService, boolean hasTeeService) {
        this.photoUrl = photoUrl;
        this.name = name;
        this.distance = distance;
        this.sellCount = sellCount;
        this.area = area;
        this.rating = rating;
        this.serviceType = serviceType;
        this.hasSnacksService = hasSnacksService;
        this.hasWIFIService = hasWIFIService;
        this.hasLightService = hasLightService;
        this.hasVideoService = hasVideoService;
        this.hasTeeService = hasTeeService;
    }

    @Override
    public String getImageUrl() {
        return this.photoUrl;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDistance() {
        return StringFormatUtil.afterDecimalTwo(this.distance / 1000);
    }

    @Override
    public int getSellCount() {
        return this.sellCount;
    }

    @Override
    public String getArea() {
        return this.area;
    }

    @Override
    public float getRating() {
        return this.rating;
    }

    @Override
    public int getServiceType() {
        return this.serviceType;
    }

    @Override
    public boolean hasWifiService() {
        return this.hasWIFIService;
    }

    @Override
    public boolean hasSnacksService() {
        return this.hasSnacksService;
    }

    @Override
    public boolean hasLightService() {
        return this.hasLightService;
    }

    @Override
    public boolean hasVideoService() {
        return this.hasVideoService;
    }

    @Override
    public boolean hasTeeService() {
        return this.hasTeeService;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getPhoneNumber() {
        return this.phone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.photoUrl);
        dest.writeString(this.name);
        dest.writeFloat(this.distance);
        dest.writeInt(this.sellCount);
        dest.writeString(this.area);
        dest.writeFloat(this.rating);
        dest.writeInt(this.serviceType);
        dest.writeByte(hasSnacksService ? (byte) 1 : (byte) 0);
        dest.writeByte(hasWIFIService ? (byte) 1 : (byte) 0);
        dest.writeByte(hasLightService ? (byte) 1 : (byte) 0);
        dest.writeByte(hasVideoService ? (byte) 1 : (byte) 0);
        dest.writeByte(hasTeeService ? (byte) 1 : (byte) 0);
    }

    protected Merchant(Parcel in) {
        this.photoUrl = in.readString();
        this.name = in.readString();
        this.distance = in.readFloat();
        this.sellCount = in.readInt();
        this.area = in.readString();
        this.rating = in.readFloat();
        this.serviceType = in.readInt();
        this.hasSnacksService = in.readByte() != 0;
        this.hasWIFIService = in.readByte() != 0;
        this.hasLightService = in.readByte() != 0;
        this.hasVideoService = in.readByte() != 0;
        this.hasTeeService = in.readByte() != 0;
    }

    public static final Parcelable.Creator<Merchant> CREATOR = new Parcelable.Creator<Merchant>() {
        public Merchant createFromParcel(Parcel source) {
            return new Merchant(source);
        }

        public Merchant[] newArray(int size) {
            return new Merchant[size];
        }
    };
}
