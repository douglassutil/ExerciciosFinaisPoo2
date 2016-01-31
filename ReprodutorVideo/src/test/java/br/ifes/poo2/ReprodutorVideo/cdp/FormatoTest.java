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
public class FormatoTest {
 

    @Test
    public void testCarregarArquivo() {
        System.out.println("carregarArquivo");
        Formato instance = new FormatoImpl();
        instance.carregarArquivo();
    }

    @Test
    public void testCarregarLegenda() {
        System.out.println("carregarLegenda");
        Formato instance = new FormatoImpl();
        instance.carregarLegenda();
    }

    @Test
    public void testReproduzirVideo() {
        System.out.println("reproduzirVideo");
        Formato instance = new FormatoImpl();
        instance.reproduzirVideo();
    }

    @Test
    public void testFinalizarReproducao() {
        System.out.println("finalizarReproducao");
        Formato instance = new FormatoImpl();
        instance.finalizarReproducao();
    }

    public class FormatoImpl implements Formato {

        public void carregarArquivo() {
        }

        public void carregarLegenda() {
        }

        public void reproduzirVideo() {
        }

        public void finalizarReproducao() {
        }
    }
    
}
