package com.bawei.zhaochenyu1709a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bawei.zhaochenyu1709a.base.BaseActivity;
import com.bawei.zhaochenyu1709a.bean.ShowBean;
import com.bawei.zhaochenyu1709a.contract.showContract;
import com.bawei.zhaochenyu1709a.presenter.showPresenter;
import com.bawei.zhaochenyu1709a.view.ShowAdapter;
import com.google.gson.Gson;

import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends BaseActivity<showPresenter> implements showContract.view{

    private RecyclerView rc;

    @Override
    protected void initData() {
        //获取
        persent.getshow("http://blog.zhaoliang5156.cn/baweiapi/searchmusic?kword=欧美金曲榜");
    }

    @Override
    protected void initView() {
        //找id
        rc = findViewById(R.id.rc);
        rc.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    @Override
    protected showPresenter InitPresent() {
        return new showPresenter(this);
    }

    @Override
    protected int Layoutid() {
        return R.layout.activity_main;
    }

    @Override
    public void success(String url) {
        //实例化Gson对象
        Gson gson = new Gson();
        ShowBean showBean = gson.fromJson(url, ShowBean.class);
        List<ShowBean.ContentBean> content = showBean.getContent();
        ShowAdapter showAdapter = new ShowAdapter(this,content);
        rc.setAdapter(showAdapter);
    }

    @Override
    public void error(String url) {

    }


}
