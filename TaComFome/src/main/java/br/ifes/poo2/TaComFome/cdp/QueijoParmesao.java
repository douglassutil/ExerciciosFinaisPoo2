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
public class QueijoParmesao extends PizzaDecorador{
    
    public QueijoParmesao(PizzaPronta pizza) {
     super(pizza);
     nome = "QueijoParmesao";
     preco = 1.0;
    }
    
}
