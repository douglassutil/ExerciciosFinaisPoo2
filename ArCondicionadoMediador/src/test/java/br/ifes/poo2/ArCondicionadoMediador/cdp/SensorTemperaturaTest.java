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
public class SensorTemperaturaTest {
 
    @Test
    public void testGetQtdTemperatura() {
        System.out.println("getQtdTemperatura");
        SensorTemperatura instance = new SensorTemperatura(40);
        int expResult = 40;
        int result = instance.getQtdTemperatura();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQtdTemperatura() {
        System.out.println("setQtdTemperatura");
        int qtdTemperatura = 0;
        SensorTemperatura instance = new SensorTemperatura(35);
        instance.setQtdTemperatura(qtdTemperatura);
    }
    
}
