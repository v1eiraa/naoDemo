package com.example.naodemo;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnderecoTest {
   private final Endereco e1=new Endereco();


    @Test
    public void setE1() {
        System.out.println(e1.toString());
        e1.setRua("ingleses");
        System.out.println(e1.toString());
    }


    @Test
    public void setCidade(){
        e1.setCidade("floripa");
        assertEquals("floripa",e1.getCidade());
    }

    @Test
    public void setUf(){
        e1.setUf("sc");
        assertEquals("sc",e1.getUf());

    }

    @Test
    public void setCpf(){
        e1.setCep("880244-44");
        assertEquals("880244-44",e1.getCep());

    }

    @Test
    public void setPais(){
        e1.setPais("Brasil");
        assertEquals("Brasil",e1.getPais());
    }

}

