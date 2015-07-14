/** Description of Bird Class
 *
 * Contains the "pseudo" data access object (DAO)
 *
 */


package com.example.BirdIView;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

/**
 * Created by Bhavani on 03-07-2015.
 */
public class Bird {

    private int call;
    private String name;
    private int pic;

    public Bird(int call, String name, int pic) {
        super();
        this.setCall(call);
        this.setName(name);
        this.setPic(pic);
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }









}


