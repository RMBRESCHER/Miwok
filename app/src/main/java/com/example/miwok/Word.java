package com.example.miwok;

public class Word {
    private String myDefaultTranslation;
    private String myMiwakTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Word(String defaultTranslation, String miwakTranslation,int audioResourceId) {
        this.myDefaultTranslation = defaultTranslation;
        this.myMiwakTranslation= miwakTranslation;
        this.mAudioResourceId = audioResourceId;

    }
    public Word(String defaultTranslation, String miwakTranslation,int ImageResourceId,int audioResourceId) {
        this.myDefaultTranslation = defaultTranslation;
        this.myMiwakTranslation= miwakTranslation;
        this.mImageResourceId = ImageResourceId;
        this.mAudioResourceId = audioResourceId;

    }

    public String getMyDefaultTranslation() {
        return myDefaultTranslation;
    }

    public void setMyDefaultTranslation(String myDefaultTranslation) {
        this.myDefaultTranslation = myDefaultTranslation;
    }

    public String getMyMiwakTranslation() {
        return myMiwakTranslation;
    }

    public void setMyMiwakTranslation(String myMiwakTranslation) {
        this.myMiwakTranslation = myMiwakTranslation;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
