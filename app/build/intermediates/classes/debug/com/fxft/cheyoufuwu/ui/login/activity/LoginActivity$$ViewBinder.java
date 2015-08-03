// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.login.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.login.activity.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689647, "field 'ctbLoginTopBar'");
    target.ctbLoginTopBar = finder.castView(view, 2131689647, "field 'ctbLoginTopBar'");
    view = finder.findRequiredView(source, 2131689648, "field 'etPhoneNumber'");
    target.etPhoneNumber = finder.castView(view, 2131689648, "field 'etPhoneNumber'");
    view = finder.findRequiredView(source, 2131689649, "field 'etPsw'");
    target.etPsw = finder.castView(view, 2131689649, "field 'etPsw'");
    view = finder.findRequiredView(source, 2131689650, "field 'loginButton'");
    target.loginButton = finder.castView(view, 2131689650, "field 'loginButton'");
    view = finder.findRequiredView(source, 2131689651, "field 'tvRetrievePsw'");
    target.tvRetrievePsw = finder.castView(view, 2131689651, "field 'tvRetrievePsw'");
    view = finder.findRequiredView(source, 2131689652, "field 'tvPhoneVerificationLogin'");
    target.tvPhoneVerificationLogin = finder.castView(view, 2131689652, "field 'tvPhoneVerificationLogin'");
  }

  @Override public void unbind(T target) {
    target.ctbLoginTopBar = null;
    target.etPhoneNumber = null;
    target.etPsw = null;
    target.loginButton = null;
    target.tvRetrievePsw = null;
    target.tvPhoneVerificationLogin = null;
  }
}
