package com.yaoyao.yiuse.manager.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.yaoyao.yiuse.base.db.DbManager;
import com.yaoyao.yiuse.base.userinfo.UserInfo;
import com.yaoyao.yiuse.base.util.FormatUtils;
import com.yaoyao.yiuse.base.util.ToastUtils;
import com.yaoyao.yiuse.dbmanager.dao.AimsEntityDao;
import com.yaoyao.yiuse.dbmanager.entity.AimsEntity;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;
import com.yaoyao.yiuse.manager.activity.presenter.callback.CallBack;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by zk on 2019/05/13.
 */

public class CreateSortDialog extends Dialog {
    @BindView(R2.id.content)
    EditText content;
    @BindView(R2.id.dialog_cancel)
    TextView dialogCancel;
    @BindView(R2.id.dialog_ok)
    TextView dialogOk;

    /**
     * context
     */
    private Context mContext;

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    private CallBack callBack;
    /**
     * constructor 构造对话框对象
     *
     * @param context context
     */
    public CreateSortDialog(Context context) {
        super(context, R.style.public_dialog);
        this.setContentView(R.layout.dialog_manager_create_sort);
        ButterKnife.bind(this);
        this.mContext = context;
        this.init(context);
    }

    private void init(Context context) {

    }


    @OnClick({R2.id.dialog_cancel, R2.id.dialog_ok})
    public void onViewClicked(View view) {
        if(view==dialogCancel){
            dismiss();
        }else if(view==dialogOk){
            createSort(content.getText().toString());
        }

    }

    /**
     * 创建分类
     * @param sortName
     */
    private void createSort(String sortName) {
        if(!TextUtils.isEmpty(sortName)){
            String realName=sortName.trim();
            if(FormatUtils.isVerifyName(realName)){
                AimsEntityDao dao=DbManager.getInstance().getEntityDao(AimsEntityDao.class);
                boolean isExist=dao.queryBuilder().where(AimsEntityDao.Properties.AimName.eq(sortName)).count()>0?true:false;
                if(isExist){
                    ToastUtils.showShortToast("该分类已存在");
                }else{
                    long id=dao.insert(AimsEntity.createEntity(sortName, UserInfo.getUserId()));
                    if(id>0&&callBack!=null){
                        callBack.onSuccess(null);
                    }
                    dismiss();
                }

            }else{
                ToastUtils.showShortToast("不合法");
            }

        }else{
            ToastUtils.showShortToast("不能为空");
        }

    }
}

