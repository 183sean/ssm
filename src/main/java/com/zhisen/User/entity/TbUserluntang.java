package com.zhisen.User.entity;

import java.util.Date;

public class TbUserluntang {
    private String ltid;

    private String lttitle;

    private String ltpic;

    private Date lttime;

    private Integer uid;

    private Boolean ltstate;

    private String ltarticle;

    public String getLtid() {
        return ltid;
    }

    public void setLtid(String ltid) {
        this.ltid = ltid == null ? null : ltid.trim();
    }

    public String getLttitle() {
        return lttitle;
    }

    public void setLttitle(String lttitle) {
        this.lttitle = lttitle == null ? null : lttitle.trim();
    }

    public String getLtpic() {
        return ltpic;
    }

    public void setLtpic(String ltpic) {
        this.ltpic = ltpic == null ? null : ltpic.trim();
    }

    public Date getLttime() {
        return lttime;
    }

    public void setLttime(Date lttime) {
        this.lttime = lttime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Boolean getLtstate() {
        return ltstate;
    }

    public void setLtstate(Boolean ltstate) {
        this.ltstate = ltstate;
    }

    public String getLtarticle() {
        return ltarticle;
    }

    public void setLtarticle(String ltarticle) {
        this.ltarticle = ltarticle == null ? null : ltarticle.trim();
    }
}