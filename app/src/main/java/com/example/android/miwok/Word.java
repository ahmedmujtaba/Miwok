package com.example.android.miwok;

/**
 * Created by mujtaba on 9/6/2016.
 * For populating the word list
 *
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID;
    private int mMusicID;

    //User passes in the words as inputs to the constructor.
    public Word(String defaultTranslation, String miwokTranslation,int  imageID, int resId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageID;
        mMusicID = resId;
    }
    //Returns default Translation(English) word
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    //Returns Miwok word
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceID()
    {
        return mImageResourceID;
    }

    public int getmMusicID(){return mMusicID;}

}

