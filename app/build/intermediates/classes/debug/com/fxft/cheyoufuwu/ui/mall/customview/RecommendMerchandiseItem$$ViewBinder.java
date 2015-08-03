// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.mall.customview;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecommendMerchandiseItem$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.mall.customview.RecommendMerchandiseItem> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689833, "field 'ivMerchandiseImage'");
    target.ivMerchandiseImage = finder.castView(view, 2131689833, "field 'ivMerchandiseImage'");
    view = finder.findRequiredView(source, 2131689834, "field 'tvMerchandiseName'");
    target.tvMerchandiseName = finder.castView(view, 2131689834, "field 'tvMerchandiseName'");
    view = finder.findRequiredView(source, 2131689835, "field 'tvMerchandiseDetail'");
    target.tvMerchandiseDetail = finder.castView(view, 2131689835, "field 'tvMerchandiseDetail'");
    view = finder.findRequiredView(source, 2131689836, "field 'tvMerchandiseCurrentPrice'");
    target.tvMerchandiseCurrentPrice = finder.castView(view, 2131689836, "field 'tvMerchandiseCurrentPrice'");
    view = finder.findRequiredView(source, 2131689837, "field 'tvMerchandiseListPrice'");
    target.tvMerchandiseListPrice = finder.castView(view, 2131689837, "field 'tvMerchandiseListPrice'");
  }

  @Override public void unbind(T target) {
    target.ivMerchandiseImage = null;
    target.tvMerchandiseName = null;
    target.tvMerchandiseDetail = null;
    target.tvMerchandiseCurrentPrice = null;
    target.tvMerchandiseListPrice = null;
  }
}
