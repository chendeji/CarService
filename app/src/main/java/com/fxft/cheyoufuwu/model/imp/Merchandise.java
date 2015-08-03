package com.fxft.cheyoufuwu.model.imp;

import android.os.Parcel;
import android.os.Parcelable;

import com.fxft.cheyoufuwu.common.util.StringFormatUtil;
import com.fxft.cheyoufuwu.model.iinterface.IMerchandise;
import com.fxft.cheyoufuwu.model.iinterface.IMerchant;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品类
 * Created by ChenDJ on 2015/7/22.<br>
 */
public class Merchandise implements IMerchandise, Parcelable {

    private String name;
    private String detail;
    private String photoUrl;
    private int currentPrice;
    private int listPrice;
    private float distance;
    private int saleCount;

    private List<IMerchant> merchants;

    public Merchandise(String name, String detail, String photoUrl, int currentPrice, int listPrice, float distance) {
        this.name = name;
        this.detail = detail;
        this.photoUrl = photoUrl;
        this.currentPrice = currentPrice;
        this.listPrice = listPrice;
        this.distance = distance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMerchantdisePhoto() {
        return this.photoUrl;
    }

    @Override
    public String getDetail() {
        return this.detail;
    }

    @Override
    public int getCurrentPrice() {
        return this.currentPrice;
    }

    @Override
    public int getListPrice() {
        return this.listPrice;
    }

    @Override
    public String getDistance() {
        return StringFormatUtil.afterDecimalTwo(this.distance / 1000);
    }

    @Override
    public int getCommentValue() {
        return 0;
    }

    @Override
    public int getSaleCount() {
        return this.saleCount;
    }

    @Override
    public List<IMerchant> getMerchant() {
        return this.merchants;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.detail);
        dest.writeString(this.photoUrl);
        dest.writeInt(this.currentPrice);
        dest.writeInt(this.listPrice);
        dest.writeFloat(this.distance);
        dest.writeInt(this.saleCount);
        dest.writeList(this.merchants);
    }

    protected Merchandise(Parcel in) {
        this.name = in.readString();
        this.detail = in.readString();
        this.photoUrl = in.readString();
        this.currentPrice = in.readInt();
        this.listPrice = in.readInt();
        this.distance = in.readFloat();
        this.saleCount = in.readInt();
        this.merchants = new ArrayList<IMerchant>();
        in.readList(this.merchants, List.class.getClassLoader());
    }

    public static final Parcelable.Creator<Merchandise> CREATOR = new Parcelable.Creator<Merchandise>() {
        public Merchandise createFromParcel(Parcel source) {
            return new Merchandise(source);
        }

        public Merchandise[] newArray(int size) {
            return new Merchandise[size];
        }
    };
}
