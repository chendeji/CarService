// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChangeUserBindingPhoneNumberActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.userCenter.activity.ChangeUserBindingPhoneNumberActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689630, "field 'etCurrentBindingPhoneNumber'");
    target.etCurrentBindingPhoneNumber = finder.castView(view, 2131689630, "field 'etCurrentBindingPhoneNumber'");
    view = finder.findRequiredView(source, 2131689631, "field 'etNewBingdingPhoneNumber'");
    target.etNewBingdingPhoneNumber = finder.castView(view, 2131689631, "field 'etNewBingdingPhoneNumber'");
    view = finder.findRequiredView(source, 2131689632, "field 'tvSendVerificationCode' and method 'onSendVerificationCodeClick'");
    target.tvSendVerificationCode = finder.castView(view, 2131689632, "field 'tvSendVerificationCode'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onSendVerificationCodeClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689633, "field 'etInputVerificationCode'");
    target.etInputVerificationCode = finder.castView(view, 2131689633, "field 'etInputVerificationCode'");
    view = finder.findRequiredView(source, 2131689634, "field 'btBindingButton' and method 'onBindingNewPhoneNumberClick'");
    target.btBindingButton = finder.castView(view, 2131689634, "field 'btBindingButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onBindingNewPhoneNumberClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689629, "field 'ctbChangeBingdingPhoneNumberBar'");
    target.ctbChangeBingdingPhoneNumberBar = finder.castView(view, 2131689629, "field 'ctbChangeBingdingPhoneNumberBar'");
  }

  @Override public void unbind(T target) {
    target.etCurrentBindingPhoneNumber = null;
    target.etNewBingdingPhoneNumber = null;
    target.tvSendVerificationCode = null;
    target.etInputVerificationCode = null;
    target.btBindingButton = null;
    target.ctbChangeBingdingPhoneNumberBar = null;
  }
}
