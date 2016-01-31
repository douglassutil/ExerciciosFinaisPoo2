/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.util;

import br.ifes.poo2.TaComFome.cdp.*;

/**
 *
 * @author dolly
 */
public abstract class FabricaPizzaAbstrata {
    PizzaPronta pizza;

    public FabricaPizzaAbstrata() {
        pizza = new PizzaPronta();
    }
    public abstract void addIngredites();
    public abstract void calaculaPreco();
}
