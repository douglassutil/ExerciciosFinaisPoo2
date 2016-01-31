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
public class MolhoTomate extends PizzaDecorador{
    
    public MolhoTomate(PizzaPronta pizza) {
     super(pizza);
     nome = "MolhoTomate";
     preco = 3.0;
    }
}
