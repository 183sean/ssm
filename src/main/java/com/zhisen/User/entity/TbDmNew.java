package com.zhisen.User.entity;

import java.util.Date;

public class TbDmNew {
    private String dmid;

    private String dmtitle;

    private String dmpic;

    private Date dmtime;

    private Boolean dmstate;

    private String dmarticle;

    public String getDmid() {
        return dmid;
    }

    public void setDmid(String dmid) {
        this.dmid = dmid == null ? null : dmid.trim();
    }

    public String getDmtitle() {
        return dmtitle;
    }

    public void setDmtitle(String dmtitle) {
        this.dmtitle = dmtitle == null ? null : dmtitle.trim();
    }

    public String getDmpic() {
        return dmpic;
    }

    public void setDmpic(String dmpic) {
        this.dmpic = dmpic == null ? null : dmpic.trim();
    }

    public Date getDmtime() {
        return dmtime;
    }

    public void setDmtime(Date dmtime) {
        this.dmtime = dmtime;
    }

    public Boolean getDmstate() {
        return dmstate;
    }

    public void setDmstate(Boolean dmstate) {
        this.dmstate = dmstate;
    }

    public String getDmarticle() {
        return dmarticle;
    }

    public void setDmarticle(String dmarticle) {
        this.dmarticle = dmarticle == null ? null : dmarticle.trim();
    }
}