package com.sun.billmanager.bean;

import java.util.List;

public class LevelBean {

    /**
     * code : 1
     * message : 拉取分类成功
     * data : ["aaa","bbb"]
     */

    private int code;
    private String message;
    private List<String> level0;
    private List<String> level1;
    private List<String> level2;

    public List<String> getLevel0() {
        return level0;
    }

    public void setLevel0(List<String> level0) {
        this.level0 = level0;
    }

    public List<String> getLevel1() {
        return level1;
    }

    public void setLevel1(List<String> level1) {
        this.level1 = level1;
    }

    public List<String> getLevel2() {
        return level2;
    }

    public void setLevel2(List<String> level2) {
        this.level2 = level2;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
