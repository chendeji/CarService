// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689819, "field 'mTabBar'");
    target.mTabBar = finder.castView(view, 2131689819, "field 'mTabBar'");
    view = finder.findRequiredView(source, 2131689825, "field 'mIndecator'");
    target.mIndecator = finder.castView(view, 2131689825, "field 'mIndecator'");
  }

  @Override public void unbind(T target) {
    target.mTabBar = null;
    target.mIndecator = null;
  }
}
