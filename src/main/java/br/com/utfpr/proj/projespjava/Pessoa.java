package br.com.utfpr.proj.projespjava;

public class Pessoa {
    private int cpf;
    private String nome;

    public Pessoa() {
        this.cpf = 0;
        this.nome = "";
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
