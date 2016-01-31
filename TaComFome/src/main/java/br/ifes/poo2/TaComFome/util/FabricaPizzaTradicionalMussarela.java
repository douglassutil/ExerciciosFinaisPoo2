package br.ifes.poo2.TaComFome.util;


import br.ifes.poo2.TaComFome.cdp.*;
import br.ifes.poo2.TaComFome.util.FabricaPizzaAbstrata;


/**
 *
 * @author dolly
 */
public class FabricaPizzaTradicionalMussarela extends FabricaPizzaAbstrata {

     @Override
    public void addIngredites() {
        this.pizza = new MassaCone(pizza);
        this.pizza = new MolhoTomate(pizza);
        this.pizza = new MolhoTomate(pizza);
        this.pizza = new QueijoMussarela(pizza);
        this.pizza = new QueijoGongorzola(pizza);
        this.pizza = new Cebola(pizza);
        this.pizza = new Presunto(pizza);
        System.out.println(pizza.getNome()); 
 
    }

    @Override
    public void calaculaPreco() {
        System.out.println(pizza.getPreco());
    }
}
