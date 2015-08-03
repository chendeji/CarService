// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MessageActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.MessageActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689687, "field 'ctbMessageBar'");
    target.ctbMessageBar = finder.castView(view, 2131689687, "field 'ctbMessageBar'");
    view = finder.findRequiredView(source, 2131689688, "field 'lvMessageList'");
    target.lvMessageList = finder.castView(view, 2131689688, "field 'lvMessageList'");
    view = finder.findRequiredView(source, 2131689760, "field 'tvEmptyText'");
    target.tvEmptyText = finder.castView(view, 2131689760, "field 'tvEmptyText'");
    view = finder.findRequiredView(source, 2131689759, "field 'llEmptyLayout'");
    target.llEmptyLayout = finder.castView(view, 2131689759, "field 'llEmptyLayout'");
  }

  @Override public void unbind(T target) {
    target.ctbMessageBar = null;
    target.lvMessageList = null;
    target.tvEmptyText = null;
    target.llEmptyLayout = null;
  }
}
