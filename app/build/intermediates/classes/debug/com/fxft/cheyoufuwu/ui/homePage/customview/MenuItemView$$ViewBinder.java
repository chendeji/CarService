// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.customview;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MenuItemView$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.customview.MenuItemView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689787, "field 'ivItemTopIamge'");
    target.ivItemTopIamge = finder.castView(view, 2131689787, "field 'ivItemTopIamge'");
    view = finder.findRequiredView(source, 2131689788, "field 'tvBusinessName'");
    target.tvBusinessName = finder.castView(view, 2131689788, "field 'tvBusinessName'");
    view = finder.findRequiredView(source, 2131689789, "field 'tvBusinessDetail'");
    target.tvBusinessDetail = finder.castView(view, 2131689789, "field 'tvBusinessDetail'");
  }

  @Override public void unbind(T target) {
    target.ivItemTopIamge = null;
    target.tvBusinessName = null;
    target.tvBusinessDetail = null;
  }
}
