// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.common.view;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChoosePictureDialog$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.common.view.ChoosePictureDialog> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689866, "field 'btChoosePictureFromGallary'");
    target.btChoosePictureFromGallary = finder.castView(view, 2131689866, "field 'btChoosePictureFromGallary'");
    view = finder.findRequiredView(source, 2131689867, "field 'btChoosePictureCamera'");
    target.btChoosePictureCamera = finder.castView(view, 2131689867, "field 'btChoosePictureCamera'");
    view = finder.findRequiredView(source, 2131689868, "field 'btCancle'");
    target.btCancle = finder.castView(view, 2131689868, "field 'btCancle'");
  }

  @Override public void unbind(T target) {
    target.btChoosePictureFromGallary = null;
    target.btChoosePictureCamera = null;
    target.btCancle = null;
  }
}
