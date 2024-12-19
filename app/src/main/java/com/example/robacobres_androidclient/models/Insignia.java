package com.example.robacobres_androidclient.models;


import java.io.Serializable;

public class Insignia implements Serializable {
    String name;
    String avatar;

    public Insignia(){}
    public Insignia(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}


