// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.descovery.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DescoveryFragment$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.descovery.fragment.DescoveryFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689778, "field 'mDescoveryTopBar'");
    target.mDescoveryTopBar = finder.castView(view, 2131689778, "field 'mDescoveryTopBar'");
    view = finder.findRequiredView(source, 2131689779, "field 'mDecoveryList'");
    target.mDecoveryList = finder.castView(view, 2131689779, "field 'mDecoveryList'");
  }

  @Override public void unbind(T target) {
    target.mDescoveryTopBar = null;
    target.mDecoveryList = null;
  }
}
