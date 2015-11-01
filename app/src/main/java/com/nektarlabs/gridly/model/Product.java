package com.nektarlabs.gridly.model;

/**
 * Created by viktordenic on 11/1/15.
 */
public class Product {

    private String mName;

    public Product(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
