package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;
import com.fxft.cheyoufuwu.model.iinterface.IMerchant;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MerchantDetailActivity extends AppCompatActivity {

    public static final String MERCHANT_KEY = "merchant_detail";
    @Bind(R.id.iv_icon)
    ImageView ivIcon;
    @Bind(R.id.tv_merchant_name)
    TextView tvMerchantName;
    @Bind(R.id.rb_merhcant_rating)
    RatingBar rbMerhcantRating;
    @Bind(R.id.tv_merchant_sale_count)
    TextView tvMerchantSellCount;
    @Bind(R.id.tv_merchant_address)
    TextView tvMerchantAddress;
    @Bind(R.id.rl_merchant_address)
    RelativeLayout rlMerchantAddress;
    @Bind(R.id.tv_merchant_phone_number)
    TextView tvMerchantPhoneNumber;
    @Bind(R.id.rl_merchant_phone_number)
    RelativeLayout rlMerchantPhoneNumber;
    @Bind(R.id.rl_merchant_service)
    RelativeLayout rlMerchantService;
    @Bind(R.id.ll_wash_car_quan_list_holder)
    LinearLayout llWashCarQuanListHolder;
    @Bind(R.id.ll_merchant_comment_list)
    LinearLayout llMerchantCommentList;
    @Bind(R.id.iv_merchant_service_type_image)
    ImageView ivMerchantServiceTypeImage;
    @Bind(R.id.ctb_merchant_detail_info_top_bar)
    CommonTopBar ctbMerchantDetailInfoTopBar;

    private IMerchant merchant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant_detail);
        ButterKnife.bind(this);

        merchant = getIntent().getParcelableExtra(MERCHANT_KEY);
        initComponent();
        initEvent();
    }

    private void initEvent() {
        ctbMerchantDetailInfoTopBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                switch (buttonPos){
                    case LEFT_CLICK:
                        finish();
                        break;
                    case FIRST_RIGHT_CLICK:
                        //TODO 弹出分享Dialog
                        break;
                    case SEC_RIGHT_CLICK:
                        //TODO 收藏
                        CheckBox checkBox = (CheckBox) ctbMerchantDetailInfoTopBar.getRightSecCustomLayout(R.id.cb_common_collect_button);
                        break;
                }
            }
        });
    }

    private void initComponent() {
        Glide.with(this).load(merchant.getImageUrl()).into(ivIcon);
        tvMerchantName.setText(merchant.getName());
        rbMerhcantRating.setRating(merchant.getRating());
        tvMerchantSellCount.setText("成交" + merchant.getSellCount() + "笔");

        tvMerchantAddress.setText(merchant.getAddress());
        tvMerchantPhoneNumber.setText(merchant.getPhoneNumber());
        ivMerchantServiceTypeImage.setVisibility(merchant.getServiceType() == 0 ? View.VISIBLE : View.INVISIBLE);
    }

    @Override
    protected void onDestroy() {
        ButterKnife.unbind(this);
        super.onDestroy();
    }
}
