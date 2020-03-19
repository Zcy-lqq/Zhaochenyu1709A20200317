package com.bawei.zhaochenyu1709a.model;

import com.bawei.zhaochenyu1709a.bean.ShowBean;
import com.bawei.zhaochenyu1709a.contract.IshowContract;
import com.bawei.zhaochenyu1709a.util.NetUtils;
import com.google.gson.Gson;

public class IshowModel implements IshowContract.Imodle {
    @Override
    public void getshow(String url, final ModelCalBack modelCalBack) {
        NetUtils.getInstance().doGet(url, new NetUtils.ICallBack() {
            @Override
            public void onSuccess(String json) {
                modelCalBack.success(json);
            }

            @Override
            public void onFailure(String msg) {
                modelCalBack.success(msg);
            }
        });
    }
}
