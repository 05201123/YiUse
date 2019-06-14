package com.yaoyao.yiuse.manager.activity.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.yaoyao.yiuse.base.core.BaseActivity;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;
import com.yaoyao.yiuse.manager.activity.presenter.impl.ManagerMain2APresenterImpl;
import com.yaoyao.yiuse.manager.activity.presenter.inter.IManagerMain2APresenter;
import com.yaoyao.yiuse.manager.activity.presenter.inter.IManagerMainAPresenter;
import com.yaoyao.yiuse.manager.activity.view.inter.IManagerMain2AView;
import com.yaoyao.yiuse.manager.adapter.ManagerSortAdapter;
import com.yaoyao.yiuse.manager.dialog.CreateSortDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangjd on 2019/5/23.
 */

public class ManagerMainActivity2 extends BaseActivity implements IManagerMain2AView {


    @BindView(R2.id.recyclerview)
    RecyclerView recyclerview;
    @BindView(R2.id.go_tv)
    TextView goTv;
    @BindView(R2.id.sort_title_tv)
    TextView sortTitleTv;

    private ManagerSortAdapter mAdapter;
    private IManagerMainAPresenter mIManagerMainAPresenter;
    private IManagerMain2APresenter mIManagerMain2APresenter;

    public static void startAcitivty(Context context) {
        Intent intent = new Intent(context, ManagerMainActivity2.class);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIManagerMain2APresenter = new ManagerMain2APresenterImpl(this);
        setContentView(R.layout.activity_manager_main);
        ButterKnife.bind(this);
        initView();
        initData();

    }


    private void initView() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(llm);
        mAdapter = new ManagerSortAdapter(this);

    }

    private void initData() {
    }


    @OnClick(R2.id.go_tv)
    public void onViewClicked(View view) {
        if (view == goTv) {
            CreateSortDialog dialog = new CreateSortDialog(this);
            dialog.show();
        }
    }

    @Override
    public <T> T request(int requestFlag) {
        return null;
    }

    @Override
    public <T> void response(T response, int responseFlag) {

    }
}
