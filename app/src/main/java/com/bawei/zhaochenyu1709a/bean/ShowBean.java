package com.bawei.zhaochenyu1709a.bean;

import java.util.List;

/**
 * 时间: 2020/3/17 9:40
 * 作者: 赵晨雨
 * 功能：ShowBean类
 */
public class ShowBean {

    /**
     * name : 欧美金曲榜
     * pic_s192 : http://business.cdn.qianqian.com/qianqian/pic/bos_client_9362a5a55277e6fb271010a45bc99e17.jpg
     * content : [{"title":"Симфония № 4（交响乐4号）","author":"Vitas","pic_big":"http://qukufile2.qianqian.com/data2/pic/4d475c81e4c562301e21c2d102165205/590761655/590761655.jpg@s_2,w_150,h_150","fabulous":"http://blog.zhaoliang5156.cn/api/music/music.html"},{"title":"Matrimonio de Amor","author":"Richard Clayderman","pic_big":"http://qukufile2.qianqian.com/data2/pic/5a23af15e3727cff96c8dc2ab5dbe0b9/289895756/289895756.jpg@s_2,w_150,h_150","fabulous":"http://blog.zhaoliang5156.cn/api/music/music.html"},{"title":"因为爱情 (法语版)","author":"弗雷德乐队","pic_big":"http://qukufile2.qianqian.com/data2/pic/88411609/88411609.jpg@s_2,w_150,h_150","fabulous":"http://blog.zhaoliang5156.cn/api/music/music.html"},{"title":"Demons","author":"Imagine Dragons","pic_big":"http://qukufile2.qianqian.com/data2/pic/62a47df196c412a76aff95fb6ab76f31/289626766/289626766.jpg@s_2,w_150,h_150","fabulous":"http://blog.zhaoliang5156.cn/api/music/music.html"}]
     */

    private String name;
    private String pic_s192;
    private List<ContentBean> content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic_s192() {
        return pic_s192;
    }

    public void setPic_s192(String pic_s192) {
        this.pic_s192 = pic_s192;
    }

    public List<ContentBean> getContent() {
        return content;
    }

    public void setContent(List<ContentBean> content) {
        this.content = content;
    }

    public static class ContentBean {
        /**
         * title : Симфония № 4（交响乐4号）
         * author : Vitas
         * pic_big : http://qukufile2.qianqian.com/data2/pic/4d475c81e4c562301e21c2d102165205/590761655/590761655.jpg@s_2,w_150,h_150
         * fabulous : http://blog.zhaoliang5156.cn/api/music/music.html
         */

        private String title;
        private String author;
        private String pic_big;
        private String fabulous;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPic_big() {
            return pic_big;
        }

        public void setPic_big(String pic_big) {
            this.pic_big = pic_big;
        }

        public String getFabulous() {
            return fabulous;
        }

        public void setFabulous(String fabulous) {
            this.fabulous = fabulous;
        }
    }
}
