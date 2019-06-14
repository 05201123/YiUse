package com.yaoyao.yiuse.manager.activity.presenter.impl;

import com.yaoyao.yiuse.manager.activity.model.impl.ManagerMain2AModelImpl;
import com.yaoyao.yiuse.manager.activity.model.inter.IManagerMain2AModel;
import com.yaoyao.yiuse.manager.activity.presenter.inter.IManagerMain2APresenter;
import com.yaoyao.yiuse.manager.activity.view.inter.IManagerMain2AView;

public class ManagerMain2APresenterImpl implements IManagerMain2APresenter {
    private IManagerMain2AView mIManagerMain2AView;
    private IManagerMain2AModel mIManagerMain2AModel;

    public ManagerMain2APresenterImpl(IManagerMain2AView aIManagerMain2AView) {
        mIManagerMain2AView = aIManagerMain2AView;
        mIManagerMain2AModel = new ManagerMain2AModelImpl();
    }
}
