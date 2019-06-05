package com.yaoyao.yiuse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yaoyao.yiuse.manager.activity.ManagerMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.go_tv).setOnClickListener(this);
//        AimsEntityDao dao=DbManager.getInstance().getEntityDao(AimsEntityDao.class);
//
//        AimsEntity entity=new AimsEntity(null,"aaaa","bbb","cc");
//        dao.insertOrReplace(entity);
//        AimsEntity entity2=new AimsEntity(null,"aaaa2","bbb2","cc2");
//        dao.insertOrReplace(entity2);
//        List<AimsEntity> list=dao.queryBuilder().list();
//        if(list!=null){
//            for (AimsEntity entityT:list){
//                Log.e("aaaaaaa","Id ="+entityT.getId()+"  aimID"+entityT.getAimId());
//            }
//        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.go_tv){
            ManagerMainActivity.startAcitivty(this);
        }
    }
}
