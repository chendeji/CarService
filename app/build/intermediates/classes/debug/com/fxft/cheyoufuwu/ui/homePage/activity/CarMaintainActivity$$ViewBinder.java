// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CarMaintainActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.CarMaintainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689608, "field 'ctbCarMaintianTopBar'");
    target.ctbCarMaintianTopBar = finder.castView(view, 2131689608, "field 'ctbCarMaintianTopBar'");
    view = finder.findRequiredView(source, 2131689610, "field 'tvDistanceModeName'");
    target.tvDistanceModeName = finder.castView(view, 2131689610, "field 'tvDistanceModeName'");
    view = finder.findRequiredView(source, 2131689609, "field 'llDistanceChoose' and method 'onModeButtonClick'");
    target.llDistanceChoose = finder.castView(view, 2131689609, "field 'llDistanceChoose'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onModeButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689612, "field 'tvCarBeautyModeName'");
    target.tvCarBeautyModeName = finder.castView(view, 2131689612, "field 'tvCarBeautyModeName'");
    view = finder.findRequiredView(source, 2131689611, "field 'llCarBeautyChoose' and method 'onModeButtonClick'");
    target.llCarBeautyChoose = finder.castView(view, 2131689611, "field 'llCarBeautyChoose'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onModeButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689614, "field 'tvSortModeName'");
    target.tvSortModeName = finder.castView(view, 2131689614, "field 'tvSortModeName'");
    view = finder.findRequiredView(source, 2131689613, "field 'llSortTypeChoose' and method 'onModeButtonClick'");
    target.llSortTypeChoose = finder.castView(view, 2131689613, "field 'llSortTypeChoose'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onModeButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689615, "field 'lvMerchantList'");
    target.lvMerchantList = finder.castView(view, 2131689615, "field 'lvMerchantList'");
    view = finder.findRequiredView(source, 2131689760, "field 'tvEmptyText'");
    target.tvEmptyText = finder.castView(view, 2131689760, "field 'tvEmptyText'");
    view = finder.findRequiredView(source, 2131689759, "field 'llEmptyLayout'");
    target.llEmptyLayout = finder.castView(view, 2131689759, "field 'llEmptyLayout'");
  }

  @Override public void unbind(T target) {
    target.ctbCarMaintianTopBar = null;
    target.tvDistanceModeName = null;
    target.llDistanceChoose = null;
    target.tvCarBeautyModeName = null;
    target.llCarBeautyChoose = null;
    target.tvSortModeName = null;
    target.llSortTypeChoose = null;
    target.lvMerchantList = null;
    target.tvEmptyText = null;
    target.llEmptyLayout = null;
  }
}
