package com.yaoyao.yiuse.manager.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.yaoyao.yiuse.base.core.BaseActivity;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangjd on 2019/5/23.
 */

public class ManagerMainActivity extends BaseActivity {


    @BindView(R2.id.go_tv)
    TextView goTv;

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
    public void onViewClicked() {

    }
}
