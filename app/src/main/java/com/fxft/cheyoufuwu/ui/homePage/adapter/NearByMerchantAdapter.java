package com.fxft.cheyoufuwu.ui.homePage.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.interfase.IActivity;
import com.fxft.cheyoufuwu.common.util.BusProvider;
import com.fxft.cheyoufuwu.model.iinterface.IMerchant;
import com.fxft.cheyoufuwu.ui.homePage.activity.MerchantDetailActivity;
import com.fxft.cheyoufuwu.ui.homePage.event.OnNearByMerchantDataChangeEvent;
import com.squareup.otto.Subscribe;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by taosj on 2015/7/20.
 */
public class NearByMerchantAdapter extends PagerAdapter implements IActivity {

    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    private final int DEFUALT_PAGE_ITEM_COUNT = 3;

    private List<IMerchant> mMerchants = new ArrayList<>();

    public NearByMerchantAdapter(Context context) {
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        BusProvider.getInstance().register(this);
    }

    @Subscribe
    public void onReceiveDataChangeEvent(OnNearByMerchantDataChangeEvent event) {
        List<IMerchant> merchants = event.getMerchants();
        if (merchants == null || merchants.isEmpty())
            return;
        setMerchants(merchants);
    }

    private void setMerchants(List<IMerchant> merchants) {
        mMerchants.clear();
        mMerchants.addAll(merchants);
        notifyDataSetChanged();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (mMerchants == null || mMerchants.isEmpty())
            return null;
        NearByMercahntPagerItem item = null;
        int startPosition = position * DEFUALT_PAGE_ITEM_COUNT;
        item = new NearByMercahntPagerItem(mContext);
        for (int i = startPosition; i < mMerchants.size() && i < (position + 1) * DEFUALT_PAGE_ITEM_COUNT; i++) {
            int childItemPosition = i % DEFUALT_PAGE_ITEM_COUNT;
            item.setComponentValue(mMerchants.get(i), childItemPosition);
        }
        container.addView(item);
        return item;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
    }

    @Override
    public int getCount() {
        if (mMerchants.size() % DEFUALT_PAGE_ITEM_COUNT > 0) {
            int pagecount = mMerchants.size() / DEFUALT_PAGE_ITEM_COUNT + 1;
            return pagecount;
        }
        return mMerchants.size() / DEFUALT_PAGE_ITEM_COUNT;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestory() {
        mMerchants.clear();
        mMerchants = null;
        BusProvider.getInstance().unregister(this);
    }

    class NearByMercahntPagerItem extends LinearLayout {

        LinearLayout llFirstItem;
        LinearLayout llSecItem;
        LinearLayout llThirItem;
        ImageView itemImage1;
        TextView itemTitile1;
        TextView itemSubTitile1;
        ImageView itemImage2;
        TextView itemTitile2;
        TextView itemSubTitile2;
        ImageView itemImage3;
        TextView itemTitile3;
        TextView itemSubTitile3;


        public NearByMercahntPagerItem(Context context) {
            this(context, null);
        }

        public NearByMercahntPagerItem(Context context, AttributeSet attrs) {
            super(context, attrs);
            init(context, attrs);
        }

        private void init(Context context, AttributeSet attrs) {
            View viewContainer = LayoutInflater.from(context).inflate(R.layout.home_near_shop_item, this, true);
            setOrientation(HORIZONTAL);
            setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            itemImage1 = (ImageView) viewContainer.findViewById(R.id.iv_merchant_image_1);
            itemTitile1 = (TextView) viewContainer.findViewById(R.id.tv_merchant_name_1);
            itemSubTitile1 = (TextView) viewContainer.findViewById(R.id.tv_merchant_distance_1);
            itemImage2 = (ImageView) viewContainer.findViewById(R.id.iv_merchant_image_2);
            itemTitile2 = (TextView) viewContainer.findViewById(R.id.tv_merchant_name_2);
            itemSubTitile2 = (TextView) viewContainer.findViewById(R.id.tv_merchant_distance_2);
            itemImage3 = (ImageView) viewContainer.findViewById(R.id.iv_merchant_image_3);
            itemTitile3 = (TextView) viewContainer.findViewById(R.id.tv_merchant_name_3);
            itemSubTitile3 = (TextView) viewContainer.findViewById(R.id.tv_merchant_distance_3);
            llFirstItem = (LinearLayout) viewContainer.findViewById(R.id.ll_first_item);
            llSecItem = (LinearLayout) viewContainer.findViewById(R.id.ll_sec_item);
            llThirItem = (LinearLayout) viewContainer.findViewById(R.id.ll_thir_item);
        }

        public void setComponentValue(final IMerchant iMerchant, int childItemPosition) {
            if (childItemPosition == 0) {
                Glide.with(mContext).load(iMerchant.getImageUrl()).into(itemImage1);
                itemTitile1.setText(iMerchant.getName());
                itemSubTitile1.setText(String.valueOf(iMerchant.getDistance()) + "km");
                llFirstItem.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(mContext, MerchantDetailActivity.class);
                        intent.putExtra(MerchantDetailActivity.MERCHANT_KEY, (Parcelable) iMerchant);
                        ((Activity)mContext).startActivity(intent);
                    }
                });
            } else if (childItemPosition == 1) {
                Glide.with(mContext).load(iMerchant.getImageUrl()).into(itemImage2);
                itemTitile2.setText(iMerchant.getName());
                itemSubTitile2.setText(String.valueOf(iMerchant.getDistance()) + "km");
                llSecItem.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(mContext, MerchantDetailActivity.class);
                        intent.putExtra(MerchantDetailActivity.MERCHANT_KEY, (Parcelable) iMerchant);
                        ((Activity)mContext).startActivity(intent);
                    }
                });
            } else {
                Glide.with(mContext).load(iMerchant.getImageUrl()).into(itemImage3);
                itemTitile3.setText(iMerchant.getName());
                itemSubTitile3.setText(String.valueOf(iMerchant.getDistance()) + "km");
                llThirItem.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(mContext, MerchantDetailActivity.class);
                        intent.putExtra(MerchantDetailActivity.MERCHANT_KEY, (Parcelable) iMerchant);
                        ((Activity)mContext).startActivity(intent);
                    }
                });
            }
        }
    }
}
