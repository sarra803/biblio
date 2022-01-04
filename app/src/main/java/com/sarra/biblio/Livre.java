package com.sarra.biblio;

public class Livre {
    private String titre;
    private String auteur;
    private String nbPages;


    public Livre(String titre, String auteur, String nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public Livre() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getNbPages() {
        return nbPages;
    }

    public void setNbPages(String nbPages) {
        this.nbPages = nbPages;
    }

}
