package com.example.naodemo;

public class Professor {
    private String salario;

    public String getSalario() {return salario;}
    public void setSalario(String salario) {this.salario = salario;}

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                '}';
    }
}
