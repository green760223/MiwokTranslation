package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Lawrence on 2016/8/11.
 */
public class Word {

    private String mDefaultVersion;

    private String mMiwokVersion;

//    private int imageResourceId;

    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultVersion, String miwokVersion) {
        mDefaultVersion = defaultVersion;
        mMiwokVersion = miwokVersion;
    }


    public Word(String mDefaultVersion, String mMiwokVersion, int imageResourceId) {
        this.mDefaultVersion = mDefaultVersion;
        this.mMiwokVersion = mMiwokVersion;
        this.imageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultVersion() {
        return mDefaultVersion;
    }

    public void setDefaultVersion(String mDefaultVersion) {
        this.mDefaultVersion = mDefaultVersion;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokVersion() {
        return mMiwokVersion;
    }

    public void setMiwokVersion(String mMiwokVersion) {
        this.mMiwokVersion = mMiwokVersion;
    }


    /**
     * Get the Miwok translation of the picture.
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(Integer imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
