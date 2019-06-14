package com.yaoyao.yiuse.manager.activity.presenter.impl;

import com.yaoyao.yiuse.dbmanager.entity.AimsEntity;
import com.yaoyao.yiuse.manager.activity.model.impl.ManagerMainAModelImpl;
import com.yaoyao.yiuse.manager.activity.model.inter.IManagerMainAModel;
import com.yaoyao.yiuse.manager.activity.presenter.inter.IManagerMainAPresenter;
import com.yaoyao.yiuse.manager.activity.view.inter.IManagerMainAView;

import java.util.List;

import static com.yaoyao.yiuse.manager.activity.view.inter.IManagerMainAView.RESPONSE_ONE;

public class ManagerMainAPresenterImpl implements IManagerMainAPresenter {
    private IManagerMainAView mIManagerMainAView;
    private IManagerMainAModel mIManagerMainAModel;

    public ManagerMainAPresenterImpl(IManagerMainAView aIManagerMainAView) {
        mIManagerMainAView = aIManagerMainAView;
        mIManagerMainAModel = new ManagerMainAModelImpl();
    }

    @Override
    public void getSortInos() {
        List<AimsEntity> list=mIManagerMainAModel.getSortInos();
        mIManagerMainAView.response(list,RESPONSE_ONE);

    }
}
