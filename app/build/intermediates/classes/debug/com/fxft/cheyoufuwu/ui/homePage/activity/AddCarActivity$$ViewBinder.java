// Generated code from Butter Knife. Do not modify!
package com.fxft.cheyoufuwu.ui.homePage.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AddCarActivity$$ViewBinder<T extends com.fxft.cheyoufuwu.ui.homePage.activity.AddCarActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689578, "field 'tvSelectCarBrand'");
    target.tvSelectCarBrand = finder.castView(view, 2131689578, "field 'tvSelectCarBrand'");
    view = finder.findRequiredView(source, 2131689579, "field 'etLicensePlateNumber'");
    target.etLicensePlateNumber = finder.castView(view, 2131689579, "field 'etLicensePlateNumber'");
    view = finder.findRequiredView(source, 2131689580, "field 'etFrameNumber'");
    target.etFrameNumber = finder.castView(view, 2131689580, "field 'etFrameNumber'");
    view = finder.findRequiredView(source, 2131689581, "field 'etEngineNumber'");
    target.etEngineNumber = finder.castView(view, 2131689581, "field 'etEngineNumber'");
    view = finder.findRequiredView(source, 2131689582, "field 'etMileageNumber'");
    target.etMileageNumber = finder.castView(view, 2131689582, "field 'etMileageNumber'");
    view = finder.findRequiredView(source, 2131689583, "field 'ChooseNextMaintenanceTime'");
    target.ChooseNextMaintenanceTime = finder.castView(view, 2131689583, "field 'ChooseNextMaintenanceTime'");
    view = finder.findRequiredView(source, 2131689584, "field 'btSave'");
    target.btSave = finder.castView(view, 2131689584, "field 'btSave'");
    view = finder.findRequiredView(source, 2131689577, "field 'ivCarImage'");
    target.ivCarImage = finder.castView(view, 2131689577, "field 'ivCarImage'");
    view = finder.findRequiredView(source, 2131689576, "field 'ctbAddCarTopBar'");
    target.ctbAddCarTopBar = finder.castView(view, 2131689576, "field 'ctbAddCarTopBar'");
  }

  @Override public void unbind(T target) {
    target.tvSelectCarBrand = null;
    target.etLicensePlateNumber = null;
    target.etFrameNumber = null;
    target.etEngineNumber = null;
    target.etMileageNumber = null;
    target.ChooseNextMaintenanceTime = null;
    target.btSave = null;
    target.ivCarImage = null;
    target.ctbAddCarTopBar = null;
  }
}
