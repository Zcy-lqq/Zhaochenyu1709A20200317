package com.bawei.zhaochenyu1709a.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bawei.zhaochenyu1709a.base.mvp.BasePresenter;
import com.bawei.zhaochenyu1709a.contract.showContract;

/**
 * 时间: 2020/3/17 9:49
 * 作者: 赵晨雨
 * 功能：BaseActivity类
 */
//继承
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements showContract.view {
    public P persent;
    //重写onCreate方法
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(Layoutid());
        persent=InitPresent();
        //判断
        if (persent!=null){
            //在上边实现契约类里的view方法
            persent.attch(this);
        }
        //写方法
        initView();
        initData();
    }
    //上边生成的方法
    protected abstract void initData();
    //上边生成的方法
    protected abstract void initView();
    //上边生成的方法
    protected abstract P InitPresent();
    //上边生成的方法
    protected abstract int Layoutid();
}
