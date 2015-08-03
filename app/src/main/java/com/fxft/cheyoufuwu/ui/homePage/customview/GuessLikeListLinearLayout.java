package com.fxft.cheyoufuwu.ui.homePage.customview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
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
import com.fxft.cheyoufuwu.model.iinterface.IMerchandise;
import com.fxft.cheyoufuwu.ui.homePage.activity.MerchandiseDetailActivity;
import com.fxft.cheyoufuwu.ui.homePage.activity.MerchantDetailActivity;
import com.fxft.cheyoufuwu.ui.homePage.event.OnGuessLikeDataChangeEvent;
import com.squareup.otto.Subscribe;

import java.util.List;

/**
 * 动态添加子项
 * Created by ChenDJ on 2015/7/22.<br>
 */
public class GuessLikeListLinearLayout extends LinearLayout {

    private LayoutInflater mLayoutInflater;

    public GuessLikeListLinearLayout(Context context) {
        this(context, null);
    }

    public GuessLikeListLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        BusProvider.getInstance().register(this);
        init();
    }

    private void init() {
        mLayoutInflater = LayoutInflater.from(getContext());
    }

    @Override
    protected void onDetachedFromWindow() {
        BusProvider.getInstance().unregister(this);
        super.onDetachedFromWindow();
    }

    @Subscribe
    public void onGuessListDataChangeEvent(OnGuessLikeDataChangeEvent event) {
        this.removeAllViews();
        List<IMerchandise> merchandises = event.getMerchandises();
        if (merchandises == null || merchandises.isEmpty())
            return;
        ViewHolder holder;
        IMerchandise merchandise;
        for (int i = 0; i < merchandises.size(); i++) {
            merchandise = merchandises.get(i);
            holder = new ViewHolder();
            holder.setComponentValue(merchandise);
            addView(holder.itemView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                    , ViewGroup.LayoutParams.MATCH_PARENT));
        }
    }

    class ViewHolder implements OnClickListener {
        View itemView;
        ImageView ivIcon;
        TextView tvName;
        TextView tvComment;
        TextView tvPrice;
        TextView tvOldPrice;
        TextView tvDistance;
        private IMerchandise mMerchandise;

        public ViewHolder() {
            itemView = mLayoutInflater.inflate(R.layout.home_guess_item, null, false);
            ivIcon = (ImageView) itemView.findViewById(R.id.iv_icon);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvComment = (TextView) itemView.findViewById(R.id.tv_comment);
            tvPrice = (TextView) itemView.findViewById(R.id.tv_price);
            tvOldPrice = (TextView) itemView.findViewById(R.id.tv_old_price);
            tvDistance = (TextView) itemView.findViewById(R.id.tv_distance);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //跳到商品详情页
            Intent intent = new Intent(getContext(), MerchandiseDetailActivity.class);
            intent.putExtra(MerchandiseDetailActivity.MERCHANDISE_KEY, (Parcelable) mMerchandise);
            ((Activity)getContext()).startActivity(intent);
        }

        public void setComponentValue(IMerchandise merchandise) {
            this.mMerchandise = merchandise;
            tvComment.setText(merchandise.getDetail());
            tvName.setText(merchandise.getName());
            tvPrice.setText("¥"+merchandise.getCurrentPrice());
            tvOldPrice.setText("¥"+merchandise.getListPrice());
            tvDistance.setText(merchandise.getDistance()+"km");
            if (getContext() == null)
                return;
            //容易产生Activity被销毁导致的内部报错
            Glide.with(getContext()).load(merchandise.getMerchantdisePhoto()).into(ivIcon);
        }
    }


}
