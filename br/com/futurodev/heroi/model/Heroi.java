package br.com.futurodev.heroi.model;

public class Heroi {
    
    private String nome;

    private String superpoder;
    
    private Integer idade;


    public Heroi(String nome, String superpoder, Integer idade) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.idade = idade;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    

}
