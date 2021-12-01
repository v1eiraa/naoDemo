package com.example.naodemo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    private final Aluno a1=new Aluno();

    @Test
    public void setA1(){
        System.out.println(a1.toString());
        a1.setMatricula(232323121);
        System.out.println(a1.toString());
    }

    @Test
    public void setA1(){
        a1.setMédia(23);
        assertEquals(23,a1.getMédia());
    }

}
