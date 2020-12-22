package com.example.yugioh;

import com.google.gson.annotations.SerializedName;

public class ResultsItem {
    @SerializedName("id")
    Integer id;

    @SerializedName("name")
    String namakartu;

    @SerializedName("type")
    String tipekartu;

    @SerializedName("desc")
    String deskartu;

    @SerializedName("atk")
    Integer atkkartu;

    @SerializedName("def")
    Integer defkartu;

    @SerializedName("level")
    Integer levelkartu;

    @SerializedName("attribute")
    String attkartu;

    public ResultsItem(String namakartu, String tipekartu){
        this.namakartu = namakartu;
        this.tipekartu = tipekartu;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public void setNamaKartu(String namakartu){
        this.namakartu = namakartu;
    }

    public String getNamaKartu(){
        return namakartu;
    }

    public void setTipeKartu(String tipekartu){
        this.tipekartu = tipekartu;
    }

    public String getTipeKartu(){
        return tipekartu;
    }

    public void setDesKartu(String deskartu){
        this.deskartu = deskartu;
    }

    public String getDesKartu(){
        return deskartu;
    }


    public void setAtkKartu(Integer atkkartu){
        this.atkkartu = atkkartu;
    }

    public Integer getAtkKartu(){
        return atkkartu;
    }

    public void setDefKartu(Integer defkartu){
        this.defkartu = defkartu;
    }

    public Integer getDefKartu(){
        return defkartu;
    }

    public void setLevelKartu(Integer levelkartu){
        this.levelkartu = levelkartu;
    }

    public Integer getLevelKartu(){
        return levelkartu;
    }

    public void setAttKartu(String attkartu){
        this.attkartu = attkartu;
    }

    public String getAttKartu(){
        return attkartu;
    }
}