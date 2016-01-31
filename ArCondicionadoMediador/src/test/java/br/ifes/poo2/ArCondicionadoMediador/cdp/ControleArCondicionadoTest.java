/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionadoMediador.cdp;

import org.junit.Test;


/**
 *
 * @author dolly
 */
public class ControleArCondicionadoTest {


    @Test
    public void testVerificaTemperatura() {
        System.out.println("verificaTemperatura");
        ArCondition ar = new ArCondition();
        ControleArCondicionado instance = new ControleArCondicionado();
        instance.verificaTemperatura(ar);
      
    }
    
}
