/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionadoMediador.cdp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class MediadorArCondicionadoTest {
   

    @Test
    public void testAtualizarTemperatura() {
        System.out.println("atualizarTemperatura");
        MediadorArCondicionado instance = new MediadorArCondicionado();
        instance.atualizarTemperatura();
    
    }
    
}
