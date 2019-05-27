package com.yaoyao.yiuse.manager.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.yaoyao.yiuse.base.core.BaseActivity;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;
import com.yaoyao.yiuse.manager.dialog.CreateSortDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangjd on 2019/5/23.
 */

public class ManagerMainActivity extends BaseActivity {


    @BindView(R2.id.recyclerview)
    RecyclerView recyclerview;
    @BindView(R2.id.go_tv)
    TextView goTv;
    @BindView(R2.id.sort_title_tv)
    TextView sortTitleTv;

    public static void startAcitivty(Context context) {
        Intent intent = new Intent(context, ManagerMainActivity.class);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_main);
        ButterKnife.bind(this);
    }


    @OnClick(R2.id.go_tv)
    public void onViewClicked(View view) {
        if(view==goTv){
            CreateSortDialog dialog=new CreateSortDialog(this);
            dialog.show();
        }
    }
}
