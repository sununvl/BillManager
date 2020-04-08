package com.sun.billmanager.bean;

import java.util.ArrayList;
import java.util.List;

public class LevelBean extends LevelBaseBean {
    public static int BASE_LEVEL_ID = -1;
    private boolean isExpand;
    private int level;
    private int childSize;
    private LevelBean parent;
    private List<LevelBean> children = new ArrayList<>();

    public boolean isExpand() {
        return isExpand;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public void addEmptyChild() {
        childSize++;
    }

    public List<LevelBean> getChildren() {
        return children;
    }

    public void setChildren(List<LevelBean> children) {
        if (children == null) {
            return;
        }
        this.children.clear();
        this.children.addAll(children);
    }

    public void addChildren(LevelBean bean) {
        children.add(bean);
    }
}
