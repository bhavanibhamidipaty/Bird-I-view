package com.example.BirdIView;

// this file is StoringValues
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by Bhavani on 03-07-2015.
 */
public class Bird extends Activity implements Serializable{

        private Integer id;
        private String name;
        private String beak;
        private String colorB;
        private String colorC;
        private String size;
        private String habitat;

    public Bird(){}

    public Bird(String name, String beak, String colorB, String colorC, String size, String habitat){
        this.name = name;
        this.beak = beak;
        this.colorB = colorB;
        this.colorC = colorC;
        this.size = size;
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeak() {
        return beak;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }

    public String getColorB() {
        return colorB;
    }

    public void setColorB(String colorB) {
        this.colorB = colorB;
    }

    public String getColorC() {
        return colorC;
    }

    public void setColorC(String colorC) {
        this.colorC = colorC;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }




}


