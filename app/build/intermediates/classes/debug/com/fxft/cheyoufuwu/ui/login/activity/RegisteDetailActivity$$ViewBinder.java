// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.login.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RegisteDetailActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.login.activity.RegisteDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689689, "field 'ctbRegisteTopBar'");
    target.ctbRegisteTopBar = finder.castView(view, 2131689689, "field 'ctbRegisteTopBar'");
    view = finder.findRequiredView(source, 2131689690, "field 'etInputUserNickname'");
    target.etInputUserNickname = finder.castView(view, 2131689690, "field 'etInputUserNickname'");
    view = finder.findRequiredView(source, 2131689691, "field 'inputPsw'");
    target.inputPsw = finder.castView(view, 2131689691, "field 'inputPsw'");
    view = finder.findRequiredView(source, 2131689692, "field 'submitPsw'");
    target.submitPsw = finder.castView(view, 2131689692, "field 'submitPsw'");
    view = finder.findRequiredView(source, 2131689693, "field 'cbCheckReaded'");
    target.cbCheckReaded = finder.castView(view, 2131689693, "field 'cbCheckReaded'");
    view = finder.findRequiredView(source, 2131689694, "field 'tvCheyoufuwuProtocal'");
    target.tvCheyoufuwuProtocal = finder.castView(view, 2131689694, "field 'tvCheyoufuwuProtocal'");
    view = finder.findRequiredView(source, 2131689695, "field 'btFinishRegistButton' and method 'onFinishRegistClick'");
    target.btFinishRegistButton = finder.castView(view, 2131689695, "field 'btFinishRegistButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onFinishRegistClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.ctbRegisteTopBar = null;
    target.etInputUserNickname = null;
    target.inputPsw = null;
    target.submitPsw = null;
    target.cbCheckReaded = null;
    target.tvCheyoufuwuProtocal = null;
    target.btFinishRegistButton = null;
  }
}
