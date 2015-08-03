package com.fxft.cheyoufuwu.ui.userCenter.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.fxft.cheyoufuwu.R;
import com.fxft.cheyoufuwu.common.util.HeadImageUtil;
import com.fxft.cheyoufuwu.common.util.SystemUtil;
import com.fxft.cheyoufuwu.common.view.CommonTopBar;
import com.fxft.cheyoufuwu.common.view.scrollview.ObservableScrollView;
import com.fxft.cheyoufuwu.ui.common.view.ChoosePictureDialog;
import com.fxft.cheyoufuwu.ui.userCenter.activity.SettingActivity;
import com.fxft.cheyoufuwu.ui.userCenter.activity.UserDetailActivity;
import com.fxft.cheyoufuwu.ui.userCenter.iView.IUserCenterView;
import com.fxft.cheyoufuwu.ui.userCenter.presenter.UserCenterPresenter;

import java.io.File;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnUserCenterFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link UserCenterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UserCenterFragment extends Fragment implements IUserCenterView, ChoosePictureDialog.OnChoosePictureListener {

    @Bind(R.id.ctb_usercenter_top_bar)
    CommonTopBar mUsercenterTopBar;
    @Bind(R.id.iv_user_headimage)
    ImageView ivUserHeadimage;
    @Bind(R.id.tv_user_nickname)
    TextView tvUserNickname;
    @Bind(R.id.tv_vip_level)
    TextView tvVipLevel;
    @Bind(R.id.tv_article_collection_count)
    TextView tvArticleCollectionCount;
    @Bind(R.id.tv_volume_collection_count)
    TextView tvVolumeCollectionCount;
    @Bind(R.id.tv_merchant_collection_count)
    TextView tvMerchantCollectionCount;
    @Bind(R.id.rl_my_quan)
    RelativeLayout rlMyQuan;
    @Bind(R.id.rl_my_order)
    RelativeLayout rlMyOrder;
    @Bind(R.id.rl_my_wallet)
    RelativeLayout rlMyWallet;
    @Bind(R.id.rl_my_car)
    RelativeLayout rlMyCar;
    @Bind(R.id.rl_my_bunding)
    RelativeLayout rlMyBunding;
    @Bind(R.id.tv_customer_service_phone_number)
    TextView tvCustomerServicePhoneNumber;
    @Bind(R.id.rl_call_customer_service)
    RelativeLayout rlCallCustomerService;
    @Bind(R.id.sv_usercenter_scroll_layout)
    ObservableScrollView svUsercenterScrollLayout;
    @Bind(R.id.ll_user_head_layout)
    LinearLayout llUserHeadLayout;
    private OnUserCenterFragmentInteractionListener mListener;
    private UserCenterPresenter userPresenter;
    private ChoosePictureDialog mChoosePicturedialog;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment UserCenterFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UserCenterFragment newInstance() {
        UserCenterFragment fragment = new UserCenterFragment();
        return fragment;
    }

    public UserCenterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_center, container, false);
        ButterKnife.bind(this, view);
        initEvent();
        return view;
    }

    private void initEvent() {
        llUserHeadLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳到用户详细信息界面
                Intent intent = new Intent(getActivity(), UserDetailActivity.class);
                getActivity().startActivity(intent);
            }
        });
        ivUserHeadimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击头像弹出选择框
                showChoosePictureDialog();
            }
        });
        mUsercenterTopBar.setOnTitleButtonClickListener(new CommonTopBar.OnTitleButtonClickListener() {
            @Override
            public void onTitleButtonCallback(View view, int buttonPos) {
                switch (buttonPos) {
                    case LEFT_CLICK:
                        //弹出设置窗口
                        Intent intent = new Intent(getActivity(), SettingActivity.class);
                        getActivity().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public void chooseFromGallery() {
        Intent intentFromGallery = new Intent();
        // 设置文件类型
        intentFromGallery.setType("image/*");
        intentFromGallery.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intentFromGallery, HeadImageUtil.CODE_GALLERY_REQUEST);
    }

    @Override
    public void chooseFromCamera() {
        Intent intentFromCapture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // 判断存储卡是否可用，存储照片文件
        if (SystemUtil.hasSdcard()) {
            intentFromCapture.putExtra(MediaStore.EXTRA_OUTPUT, Uri
                    .fromFile(new File(Environment
                            .getExternalStorageDirectory(), HeadImageUtil.IMAGE_FILE_NAME)));
        }
        startActivityForResult(intentFromCapture, HeadImageUtil.CODE_CAMERA_REQUEST);
    }

    /**
     * 裁剪原始的图片
     */
    private void cropRawPhoto(Uri uri) {

        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");

        // 设置裁剪
        intent.putExtra("crop", "true");

        // aspectX , aspectY :宽高的比例
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);

        // outputX , outputY : 裁剪图片宽高
        intent.putExtra("outputX", HeadImageUtil.output_X);
        intent.putExtra("outputY", HeadImageUtil.output_Y);
        intent.putExtra("return-data", true);

        startActivityForResult(intent, HeadImageUtil.CODE_RESULT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        // 用户没有进行有效的设置操作，返回
        if (resultCode == getActivity().RESULT_CANCELED) {
            return;
        }
        switch (requestCode) {
            case HeadImageUtil.CODE_GALLERY_REQUEST:
                cropRawPhoto(data.getData());
                break;

            case HeadImageUtil.CODE_CAMERA_REQUEST:
                if (SystemUtil.hasSdcard()) {
                    File tempFile = new File(
                            Environment.getExternalStorageDirectory(),
                            HeadImageUtil.IMAGE_FILE_NAME);
                    cropRawPhoto(Uri.fromFile(tempFile));
                }
                break;

            case HeadImageUtil.CODE_RESULT_REQUEST:
                if (data != null) {
                    setImageToHeadView(data);
                }
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 提取保存裁剪之后的图片数据，并设置头像部分的View
     */
    private void setImageToHeadView(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            final Bitmap photo = extras.getParcelable("data");
            ivUserHeadimage.post(new Runnable() {
                @Override
                public void run() {
                    ivUserHeadimage.setImageBitmap(photo);
                }
            });
        }
    }

    /**
     * 显示选取图片dialog
     */
    private void showChoosePictureDialog() {
        if (mChoosePicturedialog == null) {
            mChoosePicturedialog = new ChoosePictureDialog(getActivity(), R.style.common_dialog_style);
            mChoosePicturedialog.setChoosePictureListener(this);
        }
        mChoosePicturedialog.show();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        userPresenter = new UserCenterPresenter(this);
//        try {
//            mListener = (OnUserCenterFragmentInteractionListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString()
//                    + " must implement OnUserCenterFragmentInteractionListener");
//        }
    }

    @Override
    public void onResume() {
        userPresenter.getUserInfo();
        super.onResume();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
        userPresenter.onDestory();
        HeadImageUtil.setOnImageSuccessListener(null);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void setUserHeadImage(String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        Glide.with(getActivity()).load(url).into(ivUserHeadimage);
    }

    @Override
    public void setUserNickName(String nickName) {
        if (TextUtils.isEmpty(nickName))
            return;
        tvUserNickname.setText(nickName);
    }

    @Override
    public void setUserVipLevel(int level) {
        tvVipLevel.setText("VIP" + level);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnUserCenterFragmentInteractionListener {
        /**
         * 用户中心的头像被点击
         */
        void onUserHeadImageViewClicked();
    }

}
