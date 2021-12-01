package com.example.naodemo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessorTest {


    private final Professor p1=new Professor();


    @Test
    public void setP1(){
      p1.setSalario("R$42323");
      assertEquals ("R$42323",p1.getSalario());
    }
}
