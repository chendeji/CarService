// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BindingInfoInputActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.BindingInfoInputActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689590, "field 'ctbBindingInfoTopBar'");
    target.ctbBindingInfoTopBar = finder.castView(view, 2131689590, "field 'ctbBindingInfoTopBar'");
    view = finder.findRequiredView(source, 2131689591, "field 'etInputRefuelCardNumber'");
    target.etInputRefuelCardNumber = finder.castView(view, 2131689591, "field 'etInputRefuelCardNumber'");
    view = finder.findRequiredView(source, 2131689592, "field 'etInputIDName'");
    target.etInputIDName = finder.castView(view, 2131689592, "field 'etInputIDName'");
    view = finder.findRequiredView(source, 2131689593, "field 'etIDNumber'");
    target.etIDNumber = finder.castView(view, 2131689593, "field 'etIDNumber'");
    view = finder.findRequiredView(source, 2131689594, "field 'btBinding'");
    target.btBinding = finder.castView(view, 2131689594, "field 'btBinding'");
  }

  @Override public void unbind(T target) {
    target.ctbBindingInfoTopBar = null;
    target.etInputRefuelCardNumber = null;
    target.etInputIDName = null;
    target.etIDNumber = null;
    target.btBinding = null;
  }
}
