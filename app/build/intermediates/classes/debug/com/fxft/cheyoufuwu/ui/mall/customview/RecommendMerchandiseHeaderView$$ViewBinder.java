// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.mall.customview;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecommendMerchandiseHeaderView$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.mall.customview.RecommendMerchandiseHeaderView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689826, "field 'mallRecommendMerchandise1'");
    target.mallRecommendMerchandise1 = finder.castView(view, 2131689826, "field 'mallRecommendMerchandise1'");
    view = finder.findRequiredView(source, 2131689827, "field 'mallRecommendMerchandise2'");
    target.mallRecommendMerchandise2 = finder.castView(view, 2131689827, "field 'mallRecommendMerchandise2'");
  }

  @Override public void unbind(T target) {
    target.mallRecommendMerchandise1 = null;
    target.mallRecommendMerchandise2 = null;
  }
}
