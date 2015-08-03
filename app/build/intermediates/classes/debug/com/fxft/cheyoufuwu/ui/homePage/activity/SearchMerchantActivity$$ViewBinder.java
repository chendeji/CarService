// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SearchMerchantActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.SearchMerchantActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689703, "field 'mSearchMerchantBar'");
    target.mSearchMerchantBar = finder.castView(view, 2131689703, "field 'mSearchMerchantBar'");
    view = finder.findRequiredView(source, 2131689705, "field 'rgCheckGroup'");
    target.rgCheckGroup = finder.castView(view, 2131689705, "field 'rgCheckGroup'");
    view = finder.findRequiredView(source, 2131689709, "field 'btClearSearchRecord'");
    target.btClearSearchRecord = finder.castView(view, 2131689709, "field 'btClearSearchRecord'");
  }

  @Override public void unbind(T target) {
    target.mSearchMerchantBar = null;
    target.rgCheckGroup = null;
    target.btClearSearchRecord = null;
  }
}
