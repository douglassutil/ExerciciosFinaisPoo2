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
public class SensorPessoaTest {
  
    @Test
    public void testGetQtdPessoa() {
        System.out.println("getQtdPessoa");
        SensorPessoa instance = new SensorPessoa(3);
        int expResult = 3;
        int result = instance.getQtdPessoa();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetQtdPessoa() {
        System.out.println("setQtdPessoa");
        int qtdPessoa = 3;
        SensorPessoa instance = new SensorPessoa(3);
        instance.setQtdPessoa(qtdPessoa);
    }
    
}
