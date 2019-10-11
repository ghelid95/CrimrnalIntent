package com.bignerdranch.android.crimrnalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private String mSuspect;

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public UUID getId() {
        return mId;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private boolean mSolved;


    public Crime(){
        this(UUID.randomUUID());
    }
    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public String getPhotoFilename(){
        return "IMG_" + getId().toString() + ".jpg";
    }
}
