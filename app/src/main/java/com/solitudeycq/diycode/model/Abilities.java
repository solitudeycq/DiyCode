package com.solitudeycq.diycode.model;

/**
 * Created by solitudeycq on 2017/3/19.
 */

public class Abilities {
    private boolean update;//update - 是否有权限修改
    private boolean destroy;//destroy - 是否有权限删除

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isDestroy() {
        return destroy;
    }

    public void setDestroy(boolean destroy) {
        this.destroy = destroy;
    }
}
