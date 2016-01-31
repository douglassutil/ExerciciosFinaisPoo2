/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ControleUniversal.cdp;


import org.junit.Test;


/**
 *
 * @author dolly
 */
public class ControleTest {
    
    @Test
    public void testExecutar() {
        System.out.println("executar");
        Controle instance = new ControleImpl();
        instance.executar();
    }

    @Test
    public void testDesfazer() {
        System.out.println("desfazer");
        Controle instance = new ControleImpl();
        instance.desfazer();
    }

    public class ControleImpl implements Controle {

        public void executar() {
        }

        public void desfazer() {
        }
    }
    
}
