package com.example.BirdIView;

import android.app.Activity;

/**
 * Created by Bhavani on 07-07-2015.
 */
public class BirdFilter extends Activity {
    private String beakSize;
    private String colorC;
    private String colorB;
    private String habitat;
    private String size;

    public String getColorC() {
        return colorC;
    }

    public void setColorC(String colorC) {
        this.colorC = colorC;
    }

    public String getColorB() {
        return colorB;
    }

    public void setColorB(String colorB) {
        this.colorB = colorB;
    }

    public String getBeakSize() {
        return beakSize;
    }

    public void setBeakSize(String beakSize) {
        this.beakSize = beakSize;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
