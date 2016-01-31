/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ControleUniversal.cdp;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class PortaoTest {


    @Test
    public void testIsPortaoAberto() {
        System.out.println("isPortaoAberto");
        Portao instance = new Portao();
        boolean expResult = false;
        boolean result = instance.isPortaoAberto();
        assertEquals(expResult, result);
    }

    @Test
    public void testAbrir() {
        System.out.println("abrir");
        Portao instance = new Portao();
        instance.abrir();
    }

    @Test
    public void testFechar() {
        System.out.println("fechar");
        Portao instance = new Portao();
        instance.fechar();
    }
    
}
