package com.mukul.miwok;

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private int MimageResourc = NO_IMAGE_PROVIDED;

    private int myColoe;

    public static final int NO_IMAGE_PROVIDED = -1;

    // audio word id for the resource
    private int mAudioResourceId;





    public Word(String mDefaultTranslation, String mMiwokTranslation, int mimageResourc,int audioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        MimageResourc = mimageResourc;
        mAudioResourceId = audioResourceId;
    }

    public Word(int myColoe,String mDefaultTranslation, String mMiwokTranslation, int mimageResourc) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        MimageResourc = mimageResourc;
        this.myColoe = myColoe;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     *
     *
     */

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public int getImageView() {
        return MimageResourc;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getMyColoe() {
        return myColoe;
    }


// return weather on not there is an image foe this word

    public boolean hasImage(){
        return MimageResourc != NO_IMAGE_PROVIDED;
    }


    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}