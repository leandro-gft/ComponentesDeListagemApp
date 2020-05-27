package br.com.gft.componentesdelistagem.activity.model;

public class Filme {

    private String tituloFilme;
    private String anoFilme;
    private String generoFilme;

    public Filme(){

    }

    public Filme(String tituloFilme, String anoFilme, String generoFilme) {
        this.tituloFilme = tituloFilme;
        this.anoFilme = anoFilme;
        this.generoFilme = generoFilme;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(String anoFilme) {
        this.anoFilme = anoFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }
}
