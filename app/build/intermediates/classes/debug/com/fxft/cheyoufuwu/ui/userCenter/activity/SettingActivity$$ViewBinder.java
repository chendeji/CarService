// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SettingActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.userCenter.activity.SettingActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689711, "field 'ctbSettingTopBar'");
    target.ctbSettingTopBar = finder.castView(view, 2131689711, "field 'ctbSettingTopBar'");
    view = finder.findRequiredView(source, 2131689714, "field 'myVersionNo'");
    target.myVersionNo = finder.castView(view, 2131689714, "field 'myVersionNo'");
    view = finder.findRequiredView(source, 2131689712, "field 'versionCheck'");
    target.versionCheck = finder.castView(view, 2131689712, "field 'versionCheck'");
    view = finder.findRequiredView(source, 2131689715, "field 'aboutUs'");
    target.aboutUs = finder.castView(view, 2131689715, "field 'aboutUs'");
    view = finder.findRequiredView(source, 2131689716, "field 'shareApp'");
    target.shareApp = finder.castView(view, 2131689716, "field 'shareApp'");
    view = finder.findRequiredView(source, 2131689717, "field 'rlAssistant'");
    target.rlAssistant = finder.castView(view, 2131689717, "field 'rlAssistant'");
    view = finder.findRequiredView(source, 2131689718, "field 'loginOrLogoutButton'");
    target.loginOrLogoutButton = finder.castView(view, 2131689718, "field 'loginOrLogoutButton'");
  }

  @Override public void unbind(T target) {
    target.ctbSettingTopBar = null;
    target.myVersionNo = null;
    target.versionCheck = null;
    target.aboutUs = null;
    target.shareApp = null;
    target.rlAssistant = null;
    target.loginOrLogoutButton = null;
  }
}
