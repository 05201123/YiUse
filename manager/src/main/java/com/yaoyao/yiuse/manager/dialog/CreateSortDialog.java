package com.yaoyao.yiuse.manager.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.yaoyao.yiuse.base.util.FormatUtils;
import com.yaoyao.yiuse.base.util.ToastUtils;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;

import butterknife.BindView;
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


    /**
     * constructor 构造对话框对象
     *
     * @param context context
     */
    public CreateSortDialog(Context context) {
        super(context, R.style.public_dialog);
        this.setContentView(R.layout.dialog_manager_create_sort);
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
        if(TextUtils.isEmpty(sortName)){
            String realName=sortName.trim();
            if(FormatUtils.isVerifyName(realName)){



            }else{
                ToastUtils.showShortToast("不合法");
            }

        }else{
            ToastUtils.showShortToast("不能为空");
        }

    }
}

