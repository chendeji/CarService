// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class IllegalActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.IllegalActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689643, "field 'ctbIllegalQueryTopBar'");
    target.ctbIllegalQueryTopBar = finder.castView(view, 2131689643, "field 'ctbIllegalQueryTopBar'");
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
    view = finder.findRequiredView(source, 2131689760, "field 'tvEmptyText'");
    target.tvEmptyText = finder.castView(view, 2131689760, "field 'tvEmptyText'");
    view = finder.findRequiredView(source, 2131689759, "field 'llEmptyLayout'");
    target.llEmptyLayout = finder.castView(view, 2131689759, "field 'llEmptyLayout'");
    view = finder.findRequiredView(source, 2131689645, "field 'lvIllegalList'");
    target.lvIllegalList = finder.castView(view, 2131689645, "field 'lvIllegalList'");
  }

  @Override public void unbind(T target) {
    target.ctbIllegalQueryTopBar = null;
    target.llAddCar = null;
    target.tvEmptyText = null;
    target.llEmptyLayout = null;
    target.lvIllegalList = null;
  }
}
