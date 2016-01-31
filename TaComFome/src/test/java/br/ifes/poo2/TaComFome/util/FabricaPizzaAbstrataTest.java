/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.util;


import org.junit.Test;


/**
 *
 * @author dolly
 */
public class FabricaPizzaAbstrataTest {


    @Test
    public void testAddIngredites() {
        System.out.println("addIngredites");
        FabricaPizzaAbstrata instance = new FabricaPizzaAbstrataImpl();
        instance.addIngredites();
    }

    @Test
    public void testCalaculaPreco() {
        System.out.println("calaculaPreco");
        FabricaPizzaAbstrata instance = new FabricaPizzaAbstrataImpl();
        instance.calaculaPreco();
    }

    public class FabricaPizzaAbstrataImpl extends FabricaPizzaAbstrata {

        public void addIngredites() {
        }

        public void calaculaPreco() {
        }
    }
    
}
