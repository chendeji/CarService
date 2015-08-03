// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BlackBoxActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.BlackBoxActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689598, "field 'ctbBlackBoxTopBar'");
    target.ctbBlackBoxTopBar = finder.castView(view, 2131689598, "field 'ctbBlackBoxTopBar'");
    view = finder.findRequiredView(source, 2131689599, "field 'llCarCheck'");
    target.llCarCheck = finder.castView(view, 2131689599, "field 'llCarCheck'");
    view = finder.findRequiredView(source, 2131689600, "field 'llHealthRecord'");
    target.llHealthRecord = finder.castView(view, 2131689600, "field 'llHealthRecord'");
    view = finder.findRequiredView(source, 2131689601, "field 'llDriveRecord'");
    target.llDriveRecord = finder.castView(view, 2131689601, "field 'llDriveRecord'");
    view = finder.findRequiredView(source, 2131689602, "field 'llLastTimeScore'");
    target.llLastTimeScore = finder.castView(view, 2131689602, "field 'llLastTimeScore'");
    view = finder.findRequiredView(source, 2131689603, "field 'llCarGuard'");
    target.llCarGuard = finder.castView(view, 2131689603, "field 'llCarGuard'");
    view = finder.findRequiredView(source, 2131689604, "field 'llMasterHelp'");
    target.llMasterHelp = finder.castView(view, 2131689604, "field 'llMasterHelp'");
    view = finder.findRequiredView(source, 2131689605, "field 'llMaintainNotice'");
    target.llMaintainNotice = finder.castView(view, 2131689605, "field 'llMaintainNotice'");
    view = finder.findRequiredView(source, 2131689606, "field 'llSafeFriend'");
    target.llSafeFriend = finder.castView(view, 2131689606, "field 'llSafeFriend'");
    view = finder.findRequiredView(source, 2131689607, "field 'llFreeCheck'");
    target.llFreeCheck = finder.castView(view, 2131689607, "field 'llFreeCheck'");
  }

  @Override public void unbind(T target) {
    target.ctbBlackBoxTopBar = null;
    target.llCarCheck = null;
    target.llHealthRecord = null;
    target.llDriveRecord = null;
    target.llLastTimeScore = null;
    target.llCarGuard = null;
    target.llMasterHelp = null;
    target.llMaintainNotice = null;
    target.llSafeFriend = null;
    target.llFreeCheck = null;
  }
}
