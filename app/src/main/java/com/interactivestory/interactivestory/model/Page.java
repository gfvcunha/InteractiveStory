package com.interactivestory.interactivestory.model;

/**
 * Created by Guilherme Cunha on 25/02/2015.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private Boolean mIsFinal = false;

    public Boolean getIsFinal() {
        return mIsFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        mIsFinal = isFinal;
    }

    public Page (int imageId, String text, Choice choice1, Choice choice2) {
        mImageId = imageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page (int imageId, String text) {
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int id){
        mImageId = id;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

}
