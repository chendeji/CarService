// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomePageFragment$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.fragment.HomePageFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689812, "field 'mHomeNearbyMerchant'");
    target.mHomeNearbyMerchant = finder.castView(view, 2131689812, "field 'mHomeNearbyMerchant'");
    view = finder.findRequiredView(source, 2131689781, "field 'mTopAdView'");
    target.mTopAdView = finder.castView(view, 2131689781, "field 'mTopAdView'");
    view = finder.findRequiredView(source, 2131689780, "field 'mScrollView'");
    target.mScrollView = finder.castView(view, 2131689780, "field 'mScrollView'");
    view = finder.findRequiredView(source, 2131689782, "field 'mOverlayView'");
    target.mOverlayView = view;
    view = finder.findRequiredView(source, 2131689783, "field 'mHomepageTopBar'");
    target.mHomepageTopBar = finder.castView(view, 2131689783, "field 'mHomepageTopBar'");
    view = finder.findRequiredView(source, 2131689791, "field 'menuWashCar' and method 'onMenuClick'");
    target.menuWashCar = finder.castView(view, 2131689791, "field 'menuWashCar'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689792, "field 'menuCarRefuel' and method 'onMenuClick'");
    target.menuCarRefuel = finder.castView(view, 2131689792, "field 'menuCarRefuel'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689793, "field 'menuCarMaintain' and method 'onMenuClick'");
    target.menuCarMaintain = finder.castView(view, 2131689793, "field 'menuCarMaintain'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689794, "field 'menuCarSos' and method 'onMenuClick'");
    target.menuCarSos = finder.castView(view, 2131689794, "field 'menuCarSos'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689796, "field 'menuIllegalQuery' and method 'onMenuClick'");
    target.menuIllegalQuery = finder.castView(view, 2131689796, "field 'menuIllegalQuery'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689797, "field 'menuIntegralExchange' and method 'onMenuClick'");
    target.menuIntegralExchange = finder.castView(view, 2131689797, "field 'menuIntegralExchange'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689798, "field 'menuBlackBox' and method 'onMenuClick'");
    target.menuBlackBox = finder.castView(view, 2131689798, "field 'menuBlackBox'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131689799, "field 'menuBinding' and method 'onMenuClick'");
    target.menuBinding = finder.castView(view, 2131689799, "field 'menuBinding'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onMenuClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.mHomeNearbyMerchant = null;
    target.mTopAdView = null;
    target.mScrollView = null;
    target.mOverlayView = null;
    target.mHomepageTopBar = null;
    target.menuWashCar = null;
    target.menuCarRefuel = null;
    target.menuCarMaintain = null;
    target.menuCarSos = null;
    target.menuIllegalQuery = null;
    target.menuIntegralExchange = null;
    target.menuBlackBox = null;
    target.menuBinding = null;
  }
}
