// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChangeNickNameActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.userCenter.activity.ChangeNickNameActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689627, "field 'ctbChangeNicknameBar'");
    target.ctbChangeNicknameBar = finder.castView(view, 2131689627, "field 'ctbChangeNicknameBar'");
    view = finder.findRequiredView(source, 2131689628, "field 'etNickName'");
    target.etNickName = finder.castView(view, 2131689628, "field 'etNickName'");
    view = finder.findRequiredView(source, 2131689476, "field 'btSaveButton' and method 'onSaveButtonClick'");
    target.btSaveButton = finder.castView(view, 2131689476, "field 'btSaveButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onSaveButtonClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.ctbChangeNicknameBar = null;
    target.etNickName = null;
    target.btSaveButton = null;
  }
}
