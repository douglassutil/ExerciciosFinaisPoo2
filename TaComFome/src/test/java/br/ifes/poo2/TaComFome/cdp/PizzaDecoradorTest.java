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
public class PizzaDecoradorTest {

    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        PizzaPronta pizza = new PizzaPronta();
        PizzaDecorador instance = new PizzaDecorador(pizza);
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
     
    }
    
}
