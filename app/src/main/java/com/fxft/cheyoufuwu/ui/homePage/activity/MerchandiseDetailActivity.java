package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;
import com.fxft.cheyoufuwu.common.view.SlideShowView;
import com.fxft.cheyoufuwu.model.iinterface.IMerchandise;
import com.fxft.cheyoufuwu.ui.homePage.adapter.MerchandiseTopPageAdapter;
import com.fxft.cheyoufuwu.ui.homePage.iView.IHomeView;
import com.fxft.cheyoufuwu.ui.homePage.presenter.HomePresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MerchandiseDetailActivity extends AppCompatActivity implements IHomeView {

    public static final String MERCHANDISE_KEY = "merchandise_key";

    @Bind(R.id.ctb_merchandise_info_top_bar)
    CommonTopBar ctbMerchandiseInfoTopBar;
    @Bind(R.id.ssv_merchant_images)
    SlideShowView ssvMerchantImages;
    @Bind(R.id.tv_price)
    TextView tvPrice;
    @Bind(R.id.tv_old_price)
    TextView tvOldPrice;
    @Bind(R.id.btn_buy)
    Button btnBuy;
    @Bind(R.id.tv_name)
    TextView tvName;
    @Bind(R.id.tv_nameAssist)
    TextView tvNameAssist;
    @Bind(R.id.tv_saleAmount)
    TextView tvSaleAmount;
//    @Bind(R.id.tv_grade)
//    TextView tvGrade;
//    @Bind(R.id.tv_grage_fen)
//    TextView tvGrageFen;
//    @Bind(R.id.rl_grade_count)
//    RelativeLayout rlGradeCount;
//    @Bind(R.id.tv_grade_good)
//    TextView tvGradeGood;
//    @Bind(R.id.im_grade)
//    ImageView imGrade;
//    @Bind(R.id.tv_grade_detail)
//    TextView tvGradeDetail;
    @Bind(R.id.rl_grade)
    RelativeLayout rlGrade;
    @Bind(R.id.tv_no_grade)
    TextView tvNoGrade;
    @Bind(R.id.tv_shopName)
    TextView tvShopName;
    @Bind(R.id.tv_address)
    TextView tvAddress;
    @Bind(R.id.tv_distince)
    TextView tvDistince;
    @Bind(R.id.tv_no_phone_desc)
    TextView tvNoPhoneDesc;
    @Bind(R.id.iv_photo)
    ImageView ivPhoto;
    @Bind(R.id.rl_call)
    RelativeLayout rlCall;
    @Bind(R.id.ll_store)
    LinearLayout llStore;
    @Bind(R.id.tv_desc)
    TextView tvDesc;
    @Bind(R.id.tv_like)
    TextView tvLike;
    @Bind(R.id.ll_guess_list)
    LinearLayout llGuessList;
    private MerchandiseTopPageAdapter mTopPageAdapter;

    private IMerchandise merchandise;
    private HomePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchandise_detail);
        ButterKnife.bind(this);

        merchandise = getIntent().getParcelableExtra(MERCHANDISE_KEY);
        initComponnent();
        initEvent();

        mPresenter = new HomePresenter(this);
    }

    @Override
    protected void onResume() {
        mPresenter.getFavouriteMerchant();
        super.onResume();
    }

    private void initEvent() {
        ctbMerchandiseInfoTopBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                switch (buttonPos) {
                    case LEFT_CLICK:
                        finish();
                        break;
                    case FIRST_RIGHT_CLICK:
                        break;
                    case SEC_RIGHT_CLICK:
                        break;
                }
            }
        });
    }

    @OnClick(value = {R.id.btn_buy})
    public void onBuyButtonClick(View v) {
        //跳入到购买界面

    }

    private void initComponnent() {
        mTopPageAdapter = new MerchandiseTopPageAdapter(this);
        List<String> urls = new ArrayList<>();
        urls.add(merchandise.getMerchantdisePhoto());
        mTopPageAdapter.setImageUrls(urls);
        ssvMerchantImages.setAdapter(mTopPageAdapter);


        tvPrice.setText("¥" + merchandise.getCurrentPrice());
        tvOldPrice.setText("¥" + merchandise.getListPrice());
        tvName.setText(merchandise.getName());
        tvNameAssist.setText(merchandise.getDetail());
        tvSaleAmount.setText("已售" + merchandise.getSaleCount());
//        tvShopName.setText(merchandise.getMerchant().get(0).getName());
//        tvAddress.setText(merchandise.getMerchant().get(0).getAddress());
        tvDistince.setText(merchandise.getDistance() + "m");
        tvDesc.setText(merchandise.getDetail());
    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        mTopPageAdapter.onDestory();
        mPresenter.onDestory();
        super.onDestroy();
    }
}
