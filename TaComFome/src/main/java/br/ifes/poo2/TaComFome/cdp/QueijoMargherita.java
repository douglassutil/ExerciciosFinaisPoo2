/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.poo2.TaComFome.cdp;

/**
 *
 * @author dolly
 */
public class QueijoMargherita extends PizzaDecorador{
    
    public QueijoMargherita(PizzaPronta pizza) {
     super(pizza);
     nome = "QueijoMargherita";
     preco = 1.0;
    }
    
}
