// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.mall.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MallFragment$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.mall.fragment.MallFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689784, "field 'mMallMerchandiseList'");
    target.mMallMerchandiseList = finder.castView(view, 2131689784, "field 'mMallMerchandiseList'");
  }

  @Override public void unbind(T target) {
    target.mMallMerchandiseList = null;
  }
}
