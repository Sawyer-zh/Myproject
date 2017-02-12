package com.example.zhang.test.Prototype;

import android.util.Log;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by zhang on 1/6/2017.
 */
public class WordDocument implements Cloneable {

    private String mText;

    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("constructor");
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void addImage(String image) {
        this.mImages.add(image);
    }

    @Override
    public WordDocument clone() {

        try {
            WordDocument wordDocument = (WordDocument) super.clone();

            wordDocument.mImages = this.mImages;
            wordDocument.mText = this.mText;

            return wordDocument;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void showDoc(){
        Log.d("start","----------WordDoc start-------");
        Log.d("mText",mText);
        Log.d("mImage","imageList");

        for (String image: mImages) {
            Log.d("---",image);
        }

        Log.d("end","----------WordDoc end------------");
    }
}
