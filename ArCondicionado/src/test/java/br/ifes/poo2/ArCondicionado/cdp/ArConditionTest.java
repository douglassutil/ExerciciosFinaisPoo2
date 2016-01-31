/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ArCondicionado.cdp;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class ArConditionTest {
    
    @Test
    public void testGetTemperaturaAtual() {
        System.out.println("getTemperaturaAtual");
        ArCondition instance = new ArCondition();
        int expResult = 0;
        int result = instance.getTemperaturaAtual();
        assertEquals(expResult, result);
    
    }

    @Test
    public void testSetTemperaturaAtual() {
        System.out.println("setTemperaturaAtual");
        int temperaturaAtual = 0;
        ArCondition instance = new ArCondition();
        instance.setTemperaturaAtual(temperaturaAtual);
        
    }

    @Test
    public void testAddSensorPessoa() {
        System.out.println("addSensorPessoa");
        SensorPessoa sensor = null;
        ArCondition instance = new ArCondition();
        instance.addSensorPessoa(sensor);
      
    }

    @Test
    public void testAddSensorTemperatura() {
        System.out.println("addSensorTemperatura");
        SensorTemperatura sensor = null;
        ArCondition instance = new ArCondition();
        instance.addSensorTemperatura(sensor);
      
    }

    @Test
    public void testCalculaTemperatura() {
        System.out.println("calculaTemperatura");
        ArCondition instance = new ArCondition();
        instance.calculaTemperatura();
       
    }
    
}
