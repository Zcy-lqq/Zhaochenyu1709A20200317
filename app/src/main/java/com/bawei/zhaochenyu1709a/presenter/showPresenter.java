package com.bawei.zhaochenyu1709a.presenter;

import com.bawei.zhaochenyu1709a.base.mvp.BasePresenter;
import com.bawei.zhaochenyu1709a.base.mvp.BaseView;
import com.bawei.zhaochenyu1709a.contract.showContract;
import com.bawei.zhaochenyu1709a.model.showModel;

/**
 * 时间: 2020/3/17 11:34
 * 作者: 赵晨雨
 * 功能：
 */
public class showPresenter extends BasePresenter<showModel,showContract.view> implements showContract.presenter {
   public showPresenter(BaseView baseView){
       super(baseView);
   }
    @Override
    protected showModel InitModel() {
        return new showModel();
    }

    @Override
    public void getshow(String url) {
        model.getshow(url, new showContract.model.ModelIcalBack() {
            @Override
            public void success(String url) {
                getview().success(url);
            }

            @Override
            public void error(String url) {
                getview().error(url);
            }
        });
    }
}
