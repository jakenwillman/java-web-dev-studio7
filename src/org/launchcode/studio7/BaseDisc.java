package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {
    private double storageCapacity;
    private String format;

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
