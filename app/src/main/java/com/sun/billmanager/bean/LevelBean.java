package com.sun.billmanager.bean;

import java.util.ArrayList;
import java.util.List;

public class LevelBean extends LevelBaseBean {
    private boolean isExpand;
    private LevelBean parent;
    private List<LevelBean> children = new ArrayList<>();

    public boolean isExpand() {
        return isExpand;
    }

    public LevelBean getParent() {
        return parent;
    }

    public void setParent(LevelBean parent) {
        this.parent = parent;
    }

    public void setExpand(boolean expand) {
        isExpand = expand;
        if (!expand) {
            for (LevelBean bean : children) {
                bean.setExpand(false);
            }
        }
    }

    public List<LevelBean> getChildren() {
        return children;
    }

    public void setChildren(List<LevelBean> children) {
        this.children.clear();
        this.children.addAll(children);
    }

    public void addChildren(LevelBean bean) {
        children.add(bean);
    }
}
