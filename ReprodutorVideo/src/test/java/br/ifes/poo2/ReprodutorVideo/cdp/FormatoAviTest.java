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
public class FormatoAviTest {

    @Test
    public void testCarregarArquivo() {
        System.out.println("carregarArquivo");
        FormatoAvi instance = new FormatoAvi();
        instance.carregarArquivo();
    }

    @Test
    public void testCarregarLegenda() {
        System.out.println("carregarLegenda");
        FormatoAvi instance = new FormatoAvi();
        instance.carregarLegenda();
    }

    @Test
    public void testReproduzirVideo() {
        System.out.println("reproduzirVideo");
        FormatoAvi instance = new FormatoAvi();
        instance.reproduzirVideo();
    }

    @Test
    public void testFinalizarReproducao() {
        System.out.println("finalizarReproducao");
        FormatoAvi instance = new FormatoAvi();
        instance.finalizarReproducao();
    }
    
}
