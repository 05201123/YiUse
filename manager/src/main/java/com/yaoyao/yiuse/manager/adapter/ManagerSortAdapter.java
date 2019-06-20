package com.yaoyao.yiuse.manager.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yaoyao.yiuse.base.img.ImageLoader;
import com.yaoyao.yiuse.base.util.ToastUtils;
import com.yaoyao.yiuse.dbmanager.entity.AimsEntity;
import com.yaoyao.yiuse.dbmanager.entity.ResourcesEntity;
import com.yaoyao.yiuse.manager.R;
import com.yaoyao.yiuse.manager.R2;
import com.yaoyao.yiuse.manager.constants.ResConstants;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zhangjd on 2019/6/6.
 */

public class ManagerSortAdapter extends RecyclerView.Adapter<ManagerSortAdapter.MyViewHolder> implements View.OnClickListener {
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
    private ResourcesEntity nullRes=new ResourcesEntity();
    @Override
    public void onBindViewHolder(ManagerSortAdapter.MyViewHolder holder, int position) {
        AimsEntity data=datas.get(position);
        holder.title.setText(data.getAimName());
        List<ResourcesEntity> resList=data.getReslist();
        if(resList==null){
            resList=new ArrayList<>();
            data.setReslist(resList);
        }
        int size=3-resList.size();
        for(int i=0;i<size;i++){
            resList.add(nullRes);
        }
        ImageView[] imgs={holder.image1Iv,holder.image2Iv,holder.image3Iv};

        for(int i=0;i<size;i++){
            ResourcesEntity resEntity=resList.get(i);
            imgs[i].setTag(R.layout.view_item_manager_sort,resEntity);
            imgs[i].setOnClickListener(this);
            if(resEntity.equals(nullRes)){
                if(i==0){
                    imgs[i].setVisibility(View.VISIBLE);
                    ImageLoader.getmInstance().displayImage(mContext,R.mipmap.resource_add,imgs[i]);
                }else{
                    imgs[i].setVisibility(View.GONE);
                }
            }else{
                imgs[i].setVisibility(View.VISIBLE);
                Object url=null;
                switch (resEntity.getFileType()){
                    case ResConstants.RES_TYPE_PIC:
                        url=resEntity.getLocalpath();
                        break;
                    case ResConstants.RES_TYPE_VIDEO:
                        url=resEntity.getLocalpath();
                        break;
                    case ResConstants.RES_TYPE_PPT:
                        url=resEntity.getLocalpath();
                        break;
                    case ResConstants.RES_TYPE_XLS:
                        url=resEntity.getLocalpath();
                        break;
                    case ResConstants.RES_TYPE_TXT:
                        url=resEntity.getLocalpath();
                        break;
                    case ResConstants.RES_TYPE_WORD:
                        url=resEntity.getLocalpath();
                        break;
                    case ResConstants.RES_TYPE_OTHERFILE:
                        url=R.mipmap.folder_icon;
                        break;
                    case ResConstants.RES_TYPE_MUSIC:
                        url=R.mipmap.music_icon;
                        break;
                }

                ImageLoader.getmInstance().displayImage(mContext,url,imgs[i]);
            }
        }
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    @Override
    public void onClick(View v) {
        ResourcesEntity entity= (ResourcesEntity) v.getTag(R.layout.view_item_manager_sort);
        if(entity.equals(nullRes)){



        }else{
            //TODO
            ToastUtils.showShortToast("待做");
        }
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
