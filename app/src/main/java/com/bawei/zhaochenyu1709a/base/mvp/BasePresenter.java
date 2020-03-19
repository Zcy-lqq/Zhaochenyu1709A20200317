package com.bawei.zhaochenyu1709a.base.mvp;

import java.lang.ref.WeakReference;

/**
 * 时间: 2020/3/17 9:22
 * 作者: 赵晨雨
 * 功能：
 */
public abstract class BasePresenter<M extends BaseModel,V extends BaseView> {
    public M model;
    public WeakReference<V> weakReference;
    public BasePresenter(BaseView baseView){
        model=InitModel();
    }
    //创建几个方法
    public void attch(V v){
        weakReference = new WeakReference<>(v);
    }
    public void deatch(){
        weakReference.clear();
        weakReference=null;
    }
    public V getview(){
        return weakReference.get();
    }
    protected abstract M InitModel();
}
