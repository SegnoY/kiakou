package com.example.kiakou;

import android.net.Uri;

import java.net.URI;

public class RecyclerViewModele {
    private String prix ;
    private String description ;
    private int url ;

    public RecyclerViewModele(String prix, String description, int url) {
        this.prix = prix;
        this.description = description;
        this.url = url;
    }

    public RecyclerViewModele() {

    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }
}
