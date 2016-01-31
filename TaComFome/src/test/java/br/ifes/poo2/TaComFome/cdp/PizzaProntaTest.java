/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.cdp;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class PizzaProntaTest {
    


    @Test
    public void testGetNome() {
        System.out.println("getNome");
        PizzaPronta instance = new PizzaPronta();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        PizzaPronta instance = new PizzaPronta();
        instance.setNome(nome);
    }

    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        PizzaPronta instance = new PizzaPronta();
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        double preco = 0.0;
        PizzaPronta instance = new PizzaPronta();
        instance.setPreco(preco);
    }
    
}
