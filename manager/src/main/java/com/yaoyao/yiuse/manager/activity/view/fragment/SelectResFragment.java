package com.yaoyao.yiuse.manager.activity.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yaoyao.yiuse.base.core.BaseFragment;
import com.yaoyao.yiuse.manager.R;

/**
 * Created by zhangjd on 2019/6/21.
 */

public class SelectResFragment extends BaseFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_select_res_main,container,false);
    }
}
