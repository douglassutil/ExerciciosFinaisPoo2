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
public class SensorPessoaTest {

    @Test
    public void testGetQtdPessoa() {
        System.out.println("getQtdPessoa");
        SensorPessoa instance = new SensorPessoa(12);
        int expResult = 12;
        int result = instance.getQtdPessoa();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetQtdPessoa() {
        System.out.println("setQtdPessoa");
        int qtdPessoa = 4;
        SensorPessoa instance = new SensorPessoa(12);
        instance.setQtdPessoa(qtdPessoa);
    }
    
}
