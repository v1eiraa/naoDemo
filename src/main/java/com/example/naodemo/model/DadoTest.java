package com.example.naodemo.model;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DadoTest {
    @Test
    public void testeDado(){
     Dado  dado= new Dado();
     dado.lancar();
     int face=dado.getFace();
     if (face>=1 && face<=6){
         System.out.println("valor gerado com sucesso:"+face);

     } else {
         fail("erro ao gerar");
     }
     //assertEquals(4,dado.getFace());
}

}