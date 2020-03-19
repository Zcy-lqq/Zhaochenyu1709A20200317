package com.bawei.zhaochenyu1709a.presenter;

import com.bawei.zhaochenyu1709a.base.mvp.BaseModle;
import com.bawei.zhaochenyu1709a.base.mvp.BasePresenter;
import com.bawei.zhaochenyu1709a.base.mvp.BaseView;
import com.bawei.zhaochenyu1709a.contract.IshowContract;
import com.bawei.zhaochenyu1709a.model.IshowModel;

public class IshowPresenter extends BasePresenter<IshowModel, IshowContract.Iview> implements IshowContract.Ipresenter {
    public IshowPresenter(BaseView baseView) {
        super(baseView);
    }

    @Override
    protected IshowModel InitModle() {
        return new IshowModel();
    }

    @Override
    public void getshow(String url) {
        model.getshow(url, new IshowContract.Imodle.ModelCalBack() {
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
