package com.bawei.zhaochenyu1709a.contract;

import com.bawei.zhaochenyu1709a.base.mvp.BaseModel;
import com.bawei.zhaochenyu1709a.base.mvp.BaseView;
import com.bawei.zhaochenyu1709a.bean.ShowBean;

/**
 * 时间: 2020/3/17 9:34
 * 作者: 赵晨雨
 * 功能：接口类
 */
public interface showContract {
    //接口继承接口
    interface model extends BaseModel{
        void getshow(String url,ModelIcalBack modelIcalBack);
        //接口
        interface ModelIcalBack{
            //返回成功失败两个方法
            //返回Bean类
            void success(String url );
            //返回自带的方法
            void error(String url );
        }
    }
    //接口继承接口
    interface view extends BaseView{
        //返回成功失败两个方法
        //返回Bean类
        void success(String url );
        //返回自带的方法
        void error(String url );
    }
    //接口方法
    interface presenter{
        void getshow(String url);
    }
}
