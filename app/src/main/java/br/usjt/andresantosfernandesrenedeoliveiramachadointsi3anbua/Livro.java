package br.usjt.andresantosfernandesrenedeoliveiramachadointsi3anbua;

/**
 * Created by andre.fernandes on 31/10/2017.
 */

public class Livro {
    private String nome;
    private  String assunto;

    public Livro(String nome, String assunto) {
        this.nome = nome;
        this.assunto = assunto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setArea(String assunto) {
        this.assunto = assunto;
    }
}
