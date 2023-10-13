package model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> hm;

    public Dictionary() {
        hm = new HashMap<>();
    }

    public HashMap<String, String> getHm() {
        return hm;
    }

    public void setHm(HashMap<String, String> hm) {
        this.hm = hm;
    }
       
}