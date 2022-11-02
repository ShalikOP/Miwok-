package com.example.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static  final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;



    public Word(String DefaultTranslation ,String MiwokTranslation, int audioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String DefaultTranslation ,String MiwokTranslation, int ImageResourceId, int audioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){ return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }


}
