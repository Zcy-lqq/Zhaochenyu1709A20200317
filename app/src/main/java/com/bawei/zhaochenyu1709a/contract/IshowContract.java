package com.bawei.zhaochenyu1709a.contract;

import com.bawei.zhaochenyu1709a.base.mvp.BaseModle;
import com.bawei.zhaochenyu1709a.base.mvp.BaseView;
import com.bawei.zhaochenyu1709a.bean.ShowBean;

public interface IshowContract {

    interface Imodle extends BaseModle {
        void getshow(String url,ModelCalBack modelCalBack);
        interface ModelCalBack{
            void success(String url);
            void error(String url);
        }
    }
    interface Iview extends BaseView {

        void success(String url);
        void error(String url);

    }
    interface Ipresenter{

        void getshow(String url);

    }
}
