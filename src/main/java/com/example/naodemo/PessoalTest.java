package com.example.naodemo;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PessoalTest {
    private final Pessoal c1=new Pessoal("Vitor");



@Test
   public  void setC1(){
    System.out.println(c1.toString());
    c1.setNome("Vitor");
    System.out.println(c1.toString());
}

@Test
    public void setCpf(){
c1.setTelefone("(48)96564624)");
assertEquals ("(48)96564624",c1.getTelefone());

}
    @Test
    public void setEmail(){
        c1.setEmail("PauloLindo@hotmail.com");
        assertEquals ("Aadasdasd@hotmail.com",c1.getEmail());

    }
    @Test
    public void testPessoal(){
        System.out.println(c1.toString());
    }

}
