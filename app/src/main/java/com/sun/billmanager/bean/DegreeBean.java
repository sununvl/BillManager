package com.sun.billmanager.bean;

import java.util.ArrayList;
import java.util.List;

public class DegreeBean {
    private int parentId = 0;
    private int myId = 0;
    private String name = "";
    private int level = 0;
    private boolean checked = false;
    private List<String> sonList = new ArrayList<>();

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public List<String> getSonList() {
        return sonList;
    }

    public void setSonList(List<String> sonList) {
        this.sonList.clear();
        this.sonList.addAll(sonList);
    }
}
