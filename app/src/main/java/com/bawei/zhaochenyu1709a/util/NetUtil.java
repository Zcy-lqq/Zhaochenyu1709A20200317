package com.bawei.zhaochenyu1709a.util;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bawei.zhaochenyu1709a.base.App;
import com.bumptech.glide.request.SingleRequest;

import java.util.Map;

/**
 * 时间: 2020/3/17 10:24
 * 作者: 赵晨雨
 * 功能：
 */
public class NetUtil {
    private final RequestQueue queue;
    public NetUtil(){
        queue = Volley.newRequestQueue(App.getAppContext());
    }
    private static class SingleInstance{
        private static final NetUtil INSTANCE= new NetUtil();
    }
    public static NetUtil getInstance(){
        return SingleInstance.INSTANCE;
    }
    //doget方法
    public void doGet(String url, final ICallback iCallback){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                iCallback.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                iCallback.onFailure(error.getMessage());
            }
        });
        queue.add(stringRequest);
    }
    //dopost方法
    public void doPost(String url,final Map<String,String> map,final ICallback iCallback){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                iCallback.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                iCallback.onFailure(error.getMessage());
            }
        }){
            @Override
            protected Map<String, String> getParams()  {
                return map;
            }
        };
        queue.add(stringRequest);
    }
    //接口
    public interface ICallback{
        void onSuccess(String json);
        void onFailure(String msg);
    }
}
