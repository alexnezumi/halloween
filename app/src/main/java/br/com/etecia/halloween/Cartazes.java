package br.com.etecia.halloween;

public class Cartazes {

    private String titulo;
    private int imagem;

    public Cartazes(int imagem, String titulo) {
        this.imagem = imagem;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
