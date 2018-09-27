package com.zhisen.User.entity;

public class TbAuser {
    private Integer aid;

    private String ausern;

    private String auserp;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAusern() {
        return ausern;
    }

    public void setAusern(String ausern) {
        this.ausern = ausern == null ? null : ausern.trim();
    }

    public String getAuserp() {
        return auserp;
    }

    public void setAuserp(String auserp) {
        this.auserp = auserp == null ? null : auserp.trim();
    }
}