package com.yaoyao.yiuse.manager.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yaoyao.yiuse.dbmanager.entity.AimsEntity;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zhangjd on 2019/6/6.
 */

public class ManagerSortAdapter extends RecyclerView.Adapter<ManagerSortAdapter.MyViewHolder> {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<AimsEntity> datas = new ArrayList();

    public ManagerSortAdapter(Context context) {
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
    }
    public void refreshList(List<AimsEntity> datas){
        this.datas.clear();
        this.datas.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public ManagerSortAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = mLayoutInflater.inflate(R.layout.view_item_manager_sort, parent, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(ManagerSortAdapter.MyViewHolder holder, int position) {
        AimsEntity data=datas.get(position);
        holder.title.setText(data.getAimName());

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R2.id.title)
        TextView title;
        @BindView(R2.id.image_1_iv)
        ImageView image1Iv;
        @BindView(R2.id.image_2_iv)
        ImageView image2Iv;
        @BindView(R2.id.image_3_iv)
        ImageView image3Iv;
        @BindView(R2.id.root)
        RelativeLayout root;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
