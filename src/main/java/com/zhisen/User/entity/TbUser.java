package com.zhisen.User.entity;

public class TbUser {
    private Integer uid;

    private String usern;

    private String userp;

    private String sex;

    private String email;

    private Boolean ustate;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern == null ? null : usern.trim();
    }

    public String getUserp() {
        return userp;
    }

    public void setUserp(String userp) {
        this.userp = userp == null ? null : userp.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getUstate() {
        return ustate;
    }

    public void setUstate(Boolean ustate) {
        this.ustate = ustate;
    }
}