package com.example.yugioh;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class YuGiOhModel {

    @SerializedName("data")
    private ArrayList<ResultsItem> hasil;

    public void setHasil(ArrayList<ResultsItem> hasil){
        this.hasil = hasil;
    }

    public List<ResultsItem> getHasil(){
        return hasil;
    }


}