package com.sarra.biblio;

public class Commentaire {
    private  String tit;
    private  String com;

    public Commentaire(String tit, String com) {
        this.tit = tit;
        this.com = com;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
}
