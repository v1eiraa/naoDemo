package com.example.naodemo;

public class Pessoal {

    private String nome;
    private String  telefone;
    private String email;

    public Pessoal(String nome){this.nome=nome;}
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
