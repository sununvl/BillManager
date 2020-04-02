package com.sun.billmanager.bean;

import java.util.ArrayList;
import java.util.List;

public class ClassifyBean extends ClassifyBaseBean {
    private boolean isExpand;
    private ClassifyBean parent;
    private List<ClassifyBean> children = new ArrayList<>();

    public boolean isExpand() {
        return isExpand;
    }

    public ClassifyBean getParent() {
        return parent;
    }

    public void setParent(ClassifyBean parent) {
        this.parent = parent;
    }

    public void setExpand(boolean expand) {
        isExpand = expand;
        if (!expand) {
            for (ClassifyBean bean : children) {
                bean.setExpand(false);
            }
        }
    }

    public List<ClassifyBean> getChildren() {
        return children;
    }

    public void setChildren(List<ClassifyBean> children) {
        this.children.clear();
        this.children.addAll(children);
    }
}
