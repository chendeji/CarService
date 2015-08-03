// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.userCenter.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class UserDetailActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.userCenter.activity.UserDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689719, "field 'ctbUserDetailTopBar'");
    target.ctbUserDetailTopBar = finder.castView(view, 2131689719, "field 'ctbUserDetailTopBar'");
    view = finder.findRequiredView(source, 2131689730, "field 'tvNickName'");
    target.tvNickName = finder.castView(view, 2131689730, "field 'tvNickName'");
    view = finder.findRequiredView(source, 2131689729, "field 'rlChangeNickName' and method 'onClick'");
    target.rlChangeNickName = finder.castView(view, 2131689729, "field 'rlChangeNickName'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689731, "field 'rlChangePsw' and method 'onClick'");
    target.rlChangePsw = finder.castView(view, 2131689731, "field 'rlChangePsw'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689733, "field 'tvPhoneNumber'");
    target.tvPhoneNumber = finder.castView(view, 2131689733, "field 'tvPhoneNumber'");
    view = finder.findRequiredView(source, 2131689732, "field 'rlChangePhone' and method 'onClick'");
    target.rlChangePhone = finder.castView(view, 2131689732, "field 'rlChangePhone'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689735, "field 'tvPayPsw'");
    target.tvPayPsw = finder.castView(view, 2131689735, "field 'tvPayPsw'");
    view = finder.findRequiredView(source, 2131689734, "field 'rlChangePayPsw' and method 'onClick'");
    target.rlChangePayPsw = finder.castView(view, 2131689734, "field 'rlChangePayPsw'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689720, "field 'tvVipLevel'");
    target.tvVipLevel = finder.castView(view, 2131689720, "field 'tvVipLevel'");
    view = finder.findRequiredView(source, 2131689721, "field 'tvCurrentGrowValue'");
    target.tvCurrentGrowValue = finder.castView(view, 2131689721, "field 'tvCurrentGrowValue'");
    view = finder.findRequiredView(source, 2131689728, "field 'lpvGrowValueProcess'");
    target.lpvGrowValueProcess = finder.castView(view, 2131689728, "field 'lpvGrowValueProcess'");
    view = finder.findRequiredView(source, 2131689723, "field 'tvCurrentVipLevel'");
    target.tvCurrentVipLevel = finder.castView(view, 2131689723, "field 'tvCurrentVipLevel'");
    view = finder.findRequiredView(source, 2131689724, "field 'tvCurrentLevelGrowValue'");
    target.tvCurrentLevelGrowValue = finder.castView(view, 2131689724, "field 'tvCurrentLevelGrowValue'");
    view = finder.findRequiredView(source, 2131689726, "field 'tvNextVipLevel'");
    target.tvNextVipLevel = finder.castView(view, 2131689726, "field 'tvNextVipLevel'");
    view = finder.findRequiredView(source, 2131689727, "field 'tvNextLevelBaseGrowValue'");
    target.tvNextLevelBaseGrowValue = finder.castView(view, 2131689727, "field 'tvNextLevelBaseGrowValue'");
  }

  @Override public void unbind(T target) {
    target.ctbUserDetailTopBar = null;
    target.tvNickName = null;
    target.rlChangeNickName = null;
    target.rlChangePsw = null;
    target.tvPhoneNumber = null;
    target.rlChangePhone = null;
    target.tvPayPsw = null;
    target.rlChangePayPsw = null;
    target.tvVipLevel = null;
    target.tvCurrentGrowValue = null;
    target.lpvGrowValueProcess = null;
    target.tvCurrentVipLevel = null;
    target.tvCurrentLevelGrowValue = null;
    target.tvNextVipLevel = null;
    target.tvNextLevelBaseGrowValue = null;
  }
}
