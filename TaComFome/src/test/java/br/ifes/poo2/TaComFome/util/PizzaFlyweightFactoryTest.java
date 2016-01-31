/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dolly
 */
public class PizzaFlyweightFactoryTest {
    
  

    @Test
    public void testGetPizza() {
        System.out.println("getPizza");
        String tipo = "";
        PizzaFlyweightFactory instance = new PizzaFlyweightFactory();
        FabricaPizzaAbstrata expResult = null;
        FabricaPizzaAbstrata result = instance.getPizza(tipo);
        assertEquals(expResult, result);
        
    }
    
}
