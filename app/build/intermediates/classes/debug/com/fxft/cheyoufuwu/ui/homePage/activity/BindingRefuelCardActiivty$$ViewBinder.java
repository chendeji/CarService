// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BindingRefuelCardActiivty$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.BindingRefuelCardActiivty> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689596, "field 'tvPersonalBinding' and method 'onBindingClick'");
    target.tvPersonalBinding = finder.castView(view, 2131689596, "field 'tvPersonalBinding'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBindingClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689597, "field 'tvCompanyBinding' and method 'onBindingClick'");
    target.tvCompanyBinding = finder.castView(view, 2131689597, "field 'tvCompanyBinding'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBindingClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689595, "field 'ctbBindingCarTopBar'");
    target.ctbBindingCarTopBar = finder.castView(view, 2131689595, "field 'ctbBindingCarTopBar'");
  }

  @Override public void unbind(T target) {
    target.tvPersonalBinding = null;
    target.tvCompanyBinding = null;
    target.ctbBindingCarTopBar = null;
  }
}
