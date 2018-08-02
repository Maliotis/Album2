package com.college.album;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No name";
        }
        mName = name;
        mImageUrl = imageUrl;
    }

    public Upload() {
        //empty constructor needed!
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
