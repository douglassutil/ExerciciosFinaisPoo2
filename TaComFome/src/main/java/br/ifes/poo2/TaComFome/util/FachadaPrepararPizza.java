/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.util;

/**
 *
 * @author dolly
 */
public class FachadaPrepararPizza {
    PizzaFlyweightFactory cardapio = new PizzaFlyweightFactory();
    
    public void PrepararPizza(String Tipo){
        FabricaPizzaAbstrata pizza =cardapio.getPizza(Tipo);
        pizza.addIngredites();
        pizza.calaculaPreco();
        
    }
    
}
