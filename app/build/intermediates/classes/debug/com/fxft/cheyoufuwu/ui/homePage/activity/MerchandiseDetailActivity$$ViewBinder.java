// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MerchandiseDetailActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.MerchandiseDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689653, "field 'ctbMerchandiseInfoTopBar'");
    target.ctbMerchandiseInfoTopBar = finder.castView(view, 2131689653, "field 'ctbMerchandiseInfoTopBar'");
    view = finder.findRequiredView(source, 2131689654, "field 'ssvMerchantImages'");
    target.ssvMerchantImages = finder.castView(view, 2131689654, "field 'ssvMerchantImages'");
    view = finder.findRequiredView(source, 2131689655, "field 'tvPrice'");
    target.tvPrice = finder.castView(view, 2131689655, "field 'tvPrice'");
    view = finder.findRequiredView(source, 2131689656, "field 'tvOldPrice'");
    target.tvOldPrice = finder.castView(view, 2131689656, "field 'tvOldPrice'");
    view = finder.findRequiredView(source, 2131689657, "field 'btnBuy' and method 'onBuyButtonClick'");
    target.btnBuy = finder.castView(view, 2131689657, "field 'btnBuy'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBuyButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689658, "field 'tvName'");
    target.tvName = finder.castView(view, 2131689658, "field 'tvName'");
    view = finder.findRequiredView(source, 2131689659, "field 'tvNameAssist'");
    target.tvNameAssist = finder.castView(view, 2131689659, "field 'tvNameAssist'");
    view = finder.findRequiredView(source, 2131689660, "field 'tvSaleAmount'");
    target.tvSaleAmount = finder.castView(view, 2131689660, "field 'tvSaleAmount'");
    view = finder.findRequiredView(source, 2131689661, "field 'rlGrade'");
    target.rlGrade = finder.castView(view, 2131689661, "field 'rlGrade'");
    view = finder.findRequiredView(source, 2131689662, "field 'tvNoGrade'");
    target.tvNoGrade = finder.castView(view, 2131689662, "field 'tvNoGrade'");
    view = finder.findRequiredView(source, 2131689664, "field 'tvShopName'");
    target.tvShopName = finder.castView(view, 2131689664, "field 'tvShopName'");
    view = finder.findRequiredView(source, 2131689665, "field 'tvAddress'");
    target.tvAddress = finder.castView(view, 2131689665, "field 'tvAddress'");
    view = finder.findRequiredView(source, 2131689666, "field 'tvDistince'");
    target.tvDistince = finder.castView(view, 2131689666, "field 'tvDistince'");
    view = finder.findRequiredView(source, 2131689668, "field 'tvNoPhoneDesc'");
    target.tvNoPhoneDesc = finder.castView(view, 2131689668, "field 'tvNoPhoneDesc'");
    view = finder.findRequiredView(source, 2131689669, "field 'ivPhoto'");
    target.ivPhoto = finder.castView(view, 2131689669, "field 'ivPhoto'");
    view = finder.findRequiredView(source, 2131689667, "field 'rlCall'");
    target.rlCall = finder.castView(view, 2131689667, "field 'rlCall'");
    view = finder.findRequiredView(source, 2131689663, "field 'llStore'");
    target.llStore = finder.castView(view, 2131689663, "field 'llStore'");
    view = finder.findRequiredView(source, 2131689670, "field 'tvDesc'");
    target.tvDesc = finder.castView(view, 2131689670, "field 'tvDesc'");
    view = finder.findRequiredView(source, 2131689671, "field 'tvLike'");
    target.tvLike = finder.castView(view, 2131689671, "field 'tvLike'");
    view = finder.findRequiredView(source, 2131689672, "field 'llGuessList'");
    target.llGuessList = finder.castView(view, 2131689672, "field 'llGuessList'");
  }

  @Override public void unbind(T target) {
    target.ctbMerchandiseInfoTopBar = null;
    target.ssvMerchantImages = null;
    target.tvPrice = null;
    target.tvOldPrice = null;
    target.btnBuy = null;
    target.tvName = null;
    target.tvNameAssist = null;
    target.tvSaleAmount = null;
    target.rlGrade = null;
    target.tvNoGrade = null;
    target.tvShopName = null;
    target.tvAddress = null;
    target.tvDistince = null;
    target.tvNoPhoneDesc = null;
    target.ivPhoto = null;
    target.rlCall = null;
    target.llStore = null;
    target.tvDesc = null;
    target.tvLike = null;
    target.llGuessList = null;
  }
}
