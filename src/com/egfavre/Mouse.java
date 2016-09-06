package com.egfavre;

/**
 * Created by Elizabeth on 9/6/2016.
 */
public class Mouse {
    int id;
    String strain;
    Boolean is_alive;

    public Mouse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Boolean getIs_alive() {
        return is_alive;
    }

    public void setIs_alive(Boolean is_alive) {
        this.is_alive = is_alive;
    }
}
