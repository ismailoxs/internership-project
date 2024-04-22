package com.example.inter_pro;

import android.provider.ContactsContract;
import android.widget.ImageButton;

public class Center {
    private String adresse;
    private String le_centre;
    ImageButton map;


    private String prenom;
    private ContactsContract.CommonDataKinds.Email email;
    private String groupe;


    public ImageButton getMap() {
        return map;
    }

    public ImageButton getCall() {
        return call;
    }

    public void setMap(ImageButton map) {
        this.map = map;
    }

    public void setCall(ImageButton call) {
        this.call = call;
    }

    ImageButton call ;

    private String numero_telephone;
    public void setLe_centre(String le_centre) {
        this.le_centre = le_centre;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumero_telephone(String numero_telephone) {
        this.numero_telephone = numero_telephone;
    }


    public String getLe_centre() {
        return le_centre;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumero_telephone() {
        return numero_telephone;
    }


}
