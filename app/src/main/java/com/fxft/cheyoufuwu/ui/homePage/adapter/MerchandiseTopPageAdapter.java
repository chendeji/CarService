package com.fxft.cheyoufuwu.ui.homePage.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.fxft.cheyoufuwu.common.util.BusProvider;
import com.fxft.cheyoufuwu.ui.common.adapter.BasePagerAdapter;

/**
 * Created by ChenDJ on 2015/7/30.<br>
 */
public class MerchandiseTopPageAdapter extends BasePagerAdapter {

    ViewGroup.LayoutParams mImageViewLP = new ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    public MerchandiseTopPageAdapter(Context mContext) {
        super(mContext);
        BusProvider.getInstance().register(this);
    }

    @Override
    protected View generateView(Drawable drawable) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(mImageViewLP);
        imageView.setBackgroundDrawable(drawable);
        return imageView;
    }

    @Override
    protected View generateView(String url) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(mImageViewLP);
        Glide.with(getContext()).load(url).into(imageView);
        return imageView;
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestory() {
        BusProvider.getInstance().unregister(this);
    }

    @Override
    public int getCount() {
        return getViewList();
    }
}
