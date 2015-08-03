// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RescueActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.RescueActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689696, "field 'ctbRescueServiceTopBar'");
    target.ctbRescueServiceTopBar = finder.castView(view, 2131689696, "field 'ctbRescueServiceTopBar'");
    view = finder.findRequiredView(source, 2131689644, "field 'llAddCar' and method 'onAddCarButtonClick'");
    target.llAddCar = finder.castView(view, 2131689644, "field 'llAddCar'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onAddCarButtonClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689697, "field 'sosTuoche'");
    target.sosTuoche = finder.castView(view, 2131689697, "field 'sosTuoche'");
    view = finder.findRequiredView(source, 2131689698, "field 'sosMeiyou'");
    target.sosMeiyou = finder.castView(view, 2131689698, "field 'sosMeiyou'");
    view = finder.findRequiredView(source, 2131689699, "field 'sosBaotai'");
    target.sosBaotai = finder.castView(view, 2131689699, "field 'sosBaotai'");
    view = finder.findRequiredView(source, 2131689700, "field 'sosBeikun'");
    target.sosBeikun = finder.castView(view, 2131689700, "field 'sosBeikun'");
    view = finder.findRequiredView(source, 2131689701, "field 'sosQuedian'");
    target.sosQuedian = finder.castView(view, 2131689701, "field 'sosQuedian'");
    view = finder.findRequiredView(source, 2131689702, "field 'sosQita'");
    target.sosQita = finder.castView(view, 2131689702, "field 'sosQita'");
  }

  @Override public void unbind(T target) {
    target.ctbRescueServiceTopBar = null;
    target.llAddCar = null;
    target.sosTuoche = null;
    target.sosMeiyou = null;
    target.sosBaotai = null;
    target.sosBeikun = null;
    target.sosQuedian = null;
    target.sosQita = null;
  }
}
