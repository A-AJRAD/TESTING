package com.example.ar_17_6_17.test21;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by AR-17-6-17 on 12/10/17.
 */

public class Owner implements Serializable {


    private String name ;
    private int numofchalet;

    public Owner(String n , int i){
        name=n; numofchalet=i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumofchalet() {
        return numofchalet;
    }

    public void setNumofchalet(int numofchalet) {
        this.numofchalet = numofchalet;
    }
}
