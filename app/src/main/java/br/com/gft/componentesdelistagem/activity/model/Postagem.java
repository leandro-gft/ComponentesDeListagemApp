package br.com.gft.componentesdelistagem.activity.model;

public class Postagem {

    private String nomeUsuario;
    private String postagem;
    private String momento;
    private int imagem;

    public Postagem() {
    }

    public Postagem(String nomeUsuario, String postagem, String momento, int imagem) {
        this.nomeUsuario = nomeUsuario;
        this.postagem = postagem;
        this.momento = momento;
        this.imagem = imagem;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getPostagem() {
        return postagem;
    }

    public void setPostagem(String postagem) {
        this.postagem = postagem;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
