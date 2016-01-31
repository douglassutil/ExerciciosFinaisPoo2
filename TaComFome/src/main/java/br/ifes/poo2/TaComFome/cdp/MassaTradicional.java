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
public class MassaTradicional extends PizzaDecorador{
    
    public MassaTradicional(PizzaPronta pizza) {
     super(pizza);
     nome = "MassaTradicional";
     preco = 5.0;
    }
    
}
