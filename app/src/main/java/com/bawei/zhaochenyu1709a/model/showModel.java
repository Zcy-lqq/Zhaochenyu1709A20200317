package com.bawei.zhaochenyu1709a.model;

import com.bawei.zhaochenyu1709a.contract.showContract;
import com.bawei.zhaochenyu1709a.util.NetUtil;

import static android.os.Build.VERSION_CODES.N;

/**
 * 时间: 2020/3/17 11:23
 * 作者: 赵晨雨
 * 功能：
 */
//实现
public class showModel implements showContract.model {
    //重写
    @Override
    public void getshow(String url, final ModelIcalBack modelIcalBack) {
        NetUtil.getInstance().doGet(url, new NetUtil.ICallback() {
            @Override
            public void onSuccess(String json) {
                modelIcalBack.success(json);
            }

            @Override
            public void onFailure(String msg) {
                modelIcalBack.success(msg);
            }
        });
    }
}
