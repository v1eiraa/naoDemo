package com.example.naodemo.model;

import org.junit.Test;
import org.junit.jupiter.api.TestReporter;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    public void testeJogador(){
        Jogador jogador= new Jogador();
        jogador.setNome("Paulo melhor que o neymar");
        jogador.setVencer(true);
        jogador.setPontos(7);
        System.out.println(jogador);


    }

}