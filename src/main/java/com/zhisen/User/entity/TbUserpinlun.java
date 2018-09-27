package com.zhisen.User.entity;

import java.util.Date;

public class TbUserpinlun {
    private Integer plid;

    private String plarticle;

    private Date pltime;

    private Integer uid;

    private String plallid;

    private Boolean plstate;

    public Integer getPlid() {
        return plid;
    }

    public void setPlid(Integer plid) {
        this.plid = plid;
    }

    public String getPlarticle() {
        return plarticle;
    }

    public void setPlarticle(String plarticle) {
        this.plarticle = plarticle == null ? null : plarticle.trim();
    }

    public Date getPltime() {
        return pltime;
    }

    public void setPltime(Date pltime) {
        this.pltime = pltime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPlallid() {
        return plallid;
    }

    public void setPlallid(String plallid) {
        this.plallid = plallid == null ? null : plallid.trim();
    }

    public Boolean getPlstate() {
        return plstate;
    }

    public void setPlstate(Boolean plstate) {
        this.plstate = plstate;
    }
}