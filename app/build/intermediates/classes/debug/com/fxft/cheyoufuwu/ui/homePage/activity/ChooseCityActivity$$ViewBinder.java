// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChooseCityActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.ChooseCityActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689635, "field 'ctbChooseCityTopBar'");
    target.ctbChooseCityTopBar = finder.castView(view, 2131689635, "field 'ctbChooseCityTopBar'");
    view = finder.findRequiredView(source, 2131689637, "field 'cslCitySearchLayout'");
    target.cslCitySearchLayout = finder.castView(view, 2131689637, "field 'cslCitySearchLayout'");
    view = finder.findRequiredView(source, 2131689638, "field 'llCurrentLocationCity'");
    target.llCurrentLocationCity = finder.castView(view, 2131689638, "field 'llCurrentLocationCity'");
    view = finder.findRequiredView(source, 2131689640, "field 'lvCityList'");
    target.lvCityList = finder.castView(view, 2131689640, "field 'lvCityList'");
    view = finder.findRequiredView(source, 2131689641, "field 'sbListLocateBar'");
    target.sbListLocateBar = finder.castView(view, 2131689641, "field 'sbListLocateBar'");
    view = finder.findRequiredView(source, 2131689642, "field 'tvLocationFirstSpell'");
    target.tvLocationFirstSpell = finder.castView(view, 2131689642, "field 'tvLocationFirstSpell'");
  }

  @Override public void unbind(T target) {
    target.ctbChooseCityTopBar = null;
    target.cslCitySearchLayout = null;
    target.llCurrentLocationCity = null;
    target.lvCityList = null;
    target.sbListLocateBar = null;
    target.tvLocationFirstSpell = null;
  }
}
