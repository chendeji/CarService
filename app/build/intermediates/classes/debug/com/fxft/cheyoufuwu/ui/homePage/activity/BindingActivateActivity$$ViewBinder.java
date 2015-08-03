// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BindingActivateActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.BindingActivateActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689586, "field 'rlCheyouActivate' and method 'onBindFuncButtonClick'");
    target.rlCheyouActivate = finder.castView(view, 2131689586, "field 'rlCheyouActivate'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBindFuncButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689587, "field 'rlBlackBoxBinding' and method 'onBindFuncButtonClick'");
    target.rlBlackBoxBinding = finder.castView(view, 2131689587, "field 'rlBlackBoxBinding'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBindFuncButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689588, "field 'rlResculCarBinding' and method 'onBindFuncButtonClick'");
    target.rlResculCarBinding = finder.castView(view, 2131689588, "field 'rlResculCarBinding'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBindFuncButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689589, "field 'rlWashCardBinding' and method 'onBindFuncButtonClick'");
    target.rlWashCardBinding = finder.castView(view, 2131689589, "field 'rlWashCardBinding'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBindFuncButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689585, "field 'ctbBindingActivateTopBar'");
    target.ctbBindingActivateTopBar = finder.castView(view, 2131689585, "field 'ctbBindingActivateTopBar'");
  }

  @Override public void unbind(T target) {
    target.rlCheyouActivate = null;
    target.rlBlackBoxBinding = null;
    target.rlResculCarBinding = null;
    target.rlWashCardBinding = null;
    target.ctbBindingActivateTopBar = null;
  }
}
