package com.bawei.zhaochenyu1709a.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.zhaochenyu1709a.R;
import com.bawei.zhaochenyu1709a.bean.ShowBean;
import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 时间: 2020/3/17 12:04
 * 作者: 赵晨雨
 * 功能：
 */
public class ShowAdapter extends RecyclerView.Adapter <ShowAdapter.ViewHodel>{
    Context context;
    List<ShowBean.ContentBean> contentBeanList;

    public ShowAdapter(Context context, List<ShowBean.ContentBean> contentBeanList) {
        this.context = context;
        this.contentBeanList = contentBeanList;
    }

    @NonNull
    @Override
    public ViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHodel(View.inflate(context,R.layout.show_adapter,null));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodel holder, int position) {
        Glide.with(context).load(contentBeanList.get(position).getPic_big()).into(holder.image);
        holder.text1.setText(contentBeanList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return contentBeanList.size();
}
    //创建类继承
    class ViewHodel extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView text1;

        //自动生成的方法
        public ViewHodel(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            text1 = itemView.findViewById(R.id.text);
        }
    }
}
