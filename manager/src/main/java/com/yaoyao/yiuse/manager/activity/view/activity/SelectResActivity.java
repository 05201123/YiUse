package com.yaoyao.yiuse.manager.activity.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;

import com.yaoyao.yiuse.base.core.BaseActivity;
import com.yaoyao.yiuse.base.core.BaseViewPagerAdapter;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;
import com.yaoyao.yiuse.manager.activity.presenter.impl.ManagerMain2APresenterImpl;
import com.yaoyao.yiuse.manager.activity.presenter.inter.IManagerMain2APresenter;
import com.yaoyao.yiuse.manager.activity.view.fragment.SelectResFragment;
import com.yaoyao.yiuse.manager.activity.view.inter.IManagerMain2AView;
import com.yaoyao.yiuse.manager.adapter.ManagerSortAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangjd on 2019/5/23.
 */

public class SelectResActivity extends BaseActivity implements IManagerMain2AView {


    @BindView(R2.id.res_pic_tv)
    TextView resPicTv;
    @BindView(R2.id.res_video_tv)
    TextView resVideoTv;
    @BindView(R2.id.rse_file_tv)
    TextView rseFileTv;
    @BindView(R2.id.res_auto_select_tv)
    TextView resAutoSelectTv;
    @BindView(R2.id.res_vp)
    ViewPager resVp;
    private ManagerSortAdapter mAdapter;
    private IManagerMain2APresenter mIManagerMain2APresenter;

    public static void startAcitivty(Context context) {
        Intent intent = new Intent(context, SelectResActivity.class);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIManagerMain2APresenter = new ManagerMain2APresenterImpl(this);
        setContentView(R.layout.activity_select_res_main);
        ButterKnife.bind(this);
        initView();
        initData();

    }


    private void initView() {
        SelectResFragment picResFragment=new SelectResFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("res_type",1);
        picResFragment.setArguments(bundle);
        Bundle bundle2=new Bundle();
        bundle2.putInt("res_type",2);
        SelectResFragment videoResFragment=new SelectResFragment();
        videoResFragment.setArguments(bundle2);
        List<Fragment> fragments=new ArrayList<>();
        fragments.add(picResFragment);
        fragments.add(videoResFragment);
        String[] titles={"图片","视频"};
        BaseViewPagerAdapter adpter=new BaseViewPagerAdapter(getSupportFragmentManager(),fragments,titles);
        resVp.setAdapter(adpter);
        resVp.setCurrentItem(0);
    }

    private void initData() {
    }



    @Override
    public <T> T request(int requestFlag) {
        return null;
    }

    @Override
    public <T> void response(T response, int responseFlag) {

    }

    @OnClick({R2.id.res_pic_tv, R2.id.res_video_tv, R2.id.rse_file_tv, R2.id.res_auto_select_tv})
    public void onViewClicked(View view) {
        if(view.getId()== R.id.res_pic_tv){

        }else if(view.getId()== R.id.res_video_tv){

        }else if(view.getId()== R.id.rse_file_tv){

        }else if(view.getId()== R.id.res_auto_select_tv){
            //文件选择器

        }
    }
}
