/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.ControleUniversal.cdp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class CarroTest {
    
    public CarroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsCarroLigado() {
        System.out.println("isCarroLigado");
        Carro instance = new Carro();
        boolean expResult = false;
        boolean result = instance.isCarroLigado();
        assertEquals(expResult, result);
    }

    @Test
    public void testLigar() {
        System.out.println("ligar");
        Carro instance = new Carro();
        instance.ligar();
    }

    @Test
    public void testDesligar() {
        System.out.println("desligar");
        Carro instance = new Carro();
        instance.desligar();
    }
    
}
