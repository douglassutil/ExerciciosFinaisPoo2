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
public class FormatoMp4Test {

    @Test
    public void testCarregarArquivo() {
        System.out.println("carregarArquivo");
        FormatoMp4 instance = new FormatoMp4();
        instance.carregarArquivo();
    }

    @Test
    public void testCarregarLegenda() {
        System.out.println("carregarLegenda");
        FormatoMp4 instance = new FormatoMp4();
        instance.carregarLegenda();
    }

    @Test
    public void testReproduzirVideo() {
        System.out.println("reproduzirVideo");
        FormatoMp4 instance = new FormatoMp4();
        instance.reproduzirVideo();
    }

    @Test
    public void testFinalizarReproducao() {
        System.out.println("finalizarReproducao");
        FormatoMp4 instance = new FormatoMp4();
        instance.finalizarReproducao();
    }
    
}
