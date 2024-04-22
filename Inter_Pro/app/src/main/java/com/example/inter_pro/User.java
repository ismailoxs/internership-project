package com.example.inter_pro;

public class User {
    public int getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    private String adresse;

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

private String groupe;
    private String nom;

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private String prenom;
    private String email;
    public void setEmail(String email) {
        this.email = email;
    }
    public String fullname(){
return getPrenom() +getNom();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
