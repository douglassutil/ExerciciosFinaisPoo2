/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.impostorenda.cdp;

/**
 *
 * @author dolly
 */
public class EstrategiaTest {

    @org.junit.Test
    public void testCalculaImposto() {
        System.out.println("calculaImposto");
        double valor = 0.0;
        Estrategia instance = new EstrategiaImpl();
        instance.calculaImposto(valor);

    }

    public class EstrategiaImpl implements Estrategia {

        public void calculaImposto(double valor) {
        }
    }
    
}
