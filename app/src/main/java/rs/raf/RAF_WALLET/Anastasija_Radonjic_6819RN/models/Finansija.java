package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.models;


import com.bumptech.glide.Glide;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;

public class Finansija {

    private int id;
    private String picture;
    private String naslov;
    private int kolicina;
    private String vrsta;

    public Finansija(int id, String naslov, int kolicina, String vrsta) {
        this.id = id;
        this.naslov = naslov;
        this.kolicina = kolicina;
        this.vrsta = vrsta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
}
