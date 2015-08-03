// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CarWashActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.CarWashActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689616, "field 'ctbCarWashTopBar'");
    target.ctbCarWashTopBar = finder.castView(view, 2131689616, "field 'ctbCarWashTopBar'");
    view = finder.findRequiredView(source, 2131689610, "field 'tvDistanceModeName'");
    target.tvDistanceModeName = finder.castView(view, 2131689610, "field 'tvDistanceModeName'");
    view = finder.findRequiredView(source, 2131689609, "field 'llDistanceChoose'");
    target.llDistanceChoose = finder.castView(view, 2131689609, "field 'llDistanceChoose'");
    view = finder.findRequiredView(source, 2131689621, "field 'tvCarTypeModeName'");
    target.tvCarTypeModeName = finder.castView(view, 2131689621, "field 'tvCarTypeModeName'");
    view = finder.findRequiredView(source, 2131689620, "field 'llCarTypeChoose'");
    target.llCarTypeChoose = finder.castView(view, 2131689620, "field 'llCarTypeChoose'");
    view = finder.findRequiredView(source, 2131689614, "field 'tvSortModeName'");
    target.tvSortModeName = finder.castView(view, 2131689614, "field 'tvSortModeName'");
    view = finder.findRequiredView(source, 2131689613, "field 'llSortTypeChoose'");
    target.llSortTypeChoose = finder.castView(view, 2131689613, "field 'llSortTypeChoose'");
    view = finder.findRequiredView(source, 2131689622, "field 'lvMerchantItem'");
    target.lvMerchantItem = finder.castView(view, 2131689622, "field 'lvMerchantItem'");
  }

  @Override public void unbind(T target) {
    target.ctbCarWashTopBar = null;
    target.tvDistanceModeName = null;
    target.llDistanceChoose = null;
    target.tvCarTypeModeName = null;
    target.llCarTypeChoose = null;
    target.tvSortModeName = null;
    target.llSortTypeChoose = null;
    target.lvMerchantItem = null;
  }
}
