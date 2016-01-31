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
public class FabricaPizzaConeQuatroQueijosTest {
   

    @Test
    public void testAddIngredites() {
        System.out.println("addIngredites");
        FabricaPizzaConeQuatroQueijos instance = new FabricaPizzaConeQuatroQueijos();
        instance.addIngredites();
    }

    @Test
    public void testCalaculaPreco() {
        System.out.println("calaculaPreco");
        FabricaPizzaConeQuatroQueijos instance = new FabricaPizzaConeQuatroQueijos();
        instance.calaculaPreco();
    }
    
}
