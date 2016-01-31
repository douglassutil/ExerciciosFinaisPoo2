/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ReprodutorVideo.cdp;

import org.junit.Test;


/**
 *
 * @author dolly
 */
public class FormatoMp3Test {
 
    @Test
    public void testCarregarArquivo() {
        System.out.println("carregarArquivo");
        FormatoMp3 instance = new FormatoMp3();
        instance.carregarArquivo();
    }

    @Test
    public void testCarregarLegenda() {
        System.out.println("carregarLegenda");
        FormatoMp3 instance = new FormatoMp3();
        instance.carregarLegenda();
    }

    @Test
    public void testReproduzirVideo() {
        System.out.println("reproduzirVideo");
        FormatoMp3 instance = new FormatoMp3();
        instance.reproduzirVideo();
    }

    @Test
    public void testFinalizarReproducao() {
        System.out.println("finalizarReproducao");
        FormatoMp3 instance = new FormatoMp3();
        instance.finalizarReproducao();
    }
    
}
