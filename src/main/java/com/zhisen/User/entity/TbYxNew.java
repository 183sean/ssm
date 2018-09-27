package com.zhisen.User.entity;

import java.util.Date;

public class TbYxNew {
    private String yxid;

    private String yxtitle;

    private String yxpic;

    private Date yxtime;

    private Boolean yxstate;

    private String yxarticle;

    public String getYxid() {
        return yxid;
    }

    public void setYxid(String yxid) {
        this.yxid = yxid == null ? null : yxid.trim();
    }

    public String getYxtitle() {
        return yxtitle;
    }

    public void setYxtitle(String yxtitle) {
        this.yxtitle = yxtitle == null ? null : yxtitle.trim();
    }

    public String getYxpic() {
        return yxpic;
    }

    public void setYxpic(String yxpic) {
        this.yxpic = yxpic == null ? null : yxpic.trim();
    }

    public Date getYxtime() {
        return yxtime;
    }

    public void setYxtime(Date yxtime) {
        this.yxtime = yxtime;
    }

    public Boolean getYxstate() {
        return yxstate;
    }

    public void setYxstate(Boolean yxstate) {
        this.yxstate = yxstate;
    }

    public String getYxarticle() {
        return yxarticle;
    }

    public void setYxarticle(String yxarticle) {
        this.yxarticle = yxarticle == null ? null : yxarticle.trim();
    }
}