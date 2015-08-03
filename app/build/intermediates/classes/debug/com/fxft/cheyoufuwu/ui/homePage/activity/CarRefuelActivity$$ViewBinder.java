// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CarRefuelActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.CarRefuelActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689616, "field 'ctbCarWashTopBar'");
    target.ctbCarWashTopBar = finder.castView(view, 2131689616, "field 'ctbCarWashTopBar'");
    view = finder.findRequiredView(source, 2131689617, "field 'llAddRebate'");
    target.llAddRebate = finder.castView(view, 2131689617, "field 'llAddRebate'");
    view = finder.findRequiredView(source, 2131689618, "field 'tvMoreRefuelStation'");
    target.tvMoreRefuelStation = finder.castView(view, 2131689618, "field 'tvMoreRefuelStation'");
    view = finder.findRequiredView(source, 2131689760, "field 'tvEmptyText'");
    target.tvEmptyText = finder.castView(view, 2131689760, "field 'tvEmptyText'");
    view = finder.findRequiredView(source, 2131689759, "field 'llEmptyLayout'");
    target.llEmptyLayout = finder.castView(view, 2131689759, "field 'llEmptyLayout'");
    view = finder.findRequiredView(source, 2131689619, "field 'lvRefuelStationList'");
    target.lvRefuelStationList = finder.castView(view, 2131689619, "field 'lvRefuelStationList'");
  }

  @Override public void unbind(T target) {
    target.ctbCarWashTopBar = null;
    target.llAddRebate = null;
    target.tvMoreRefuelStation = null;
    target.tvEmptyText = null;
    target.llEmptyLayout = null;
    target.lvRefuelStationList = null;
  }
}
