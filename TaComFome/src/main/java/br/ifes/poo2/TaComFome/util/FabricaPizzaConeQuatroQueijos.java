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
public class FabricaPizzaConeQuatroQueijos extends FabricaPizzaAbstrata {
   
    @Override
    public void addIngredites() {
        this.pizza= new MassaCone(pizza);
        this.pizza= new MolhoTomate(pizza);
        this.pizza= new QueijoParmesao(pizza);
        this.pizza= new QueijoMussarela(pizza);
        this.pizza= new QueijoMargherita(pizza);
        this.pizza= new QueijoProvolone(pizza);
        this.pizza=new Cebola(pizza);
        this.pizza=new Presunto(pizza); 
        System.out.println(pizza.getNome());    
    }
    
    @Override
    public void calaculaPreco(){
        System.out.println(pizza.getPreco());
    }
    
    
}
